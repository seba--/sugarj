package org.sugarj.builder;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.imp.editor.UniversalEditor;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.sugarj.AbstractBaseLanguage;
import org.sugarj.BaseLanguageRegistry;
import org.sugarj.common.CommandExecution;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.Log;
import org.sugarj.common.path.AbsolutePath;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.driver.Driver;
import org.sugarj.driver.ModuleSystemCommands;
import org.sugarj.driver.Result;
import org.sugarj.editor.SugarJConsole;
import org.sugarj.editor.SugarJParseController;
import org.sugarj.util.ProcessingListener;

/**
 * updates editors to show newly built results
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class Builder extends IncrementalProjectBuilder {

  private class BuildInput {
    public final IResource resource;
    public final RelativePath sourceFile;
    public final AbstractBaseLanguage baseLang;
    public BuildInput(IResource resource, RelativePath path, AbstractBaseLanguage baseLang) {
      this.resource = resource; 
      this.sourceFile = path;
      this.baseLang = baseLang;
    }
  }

//  private static Map<IProject, ILock> buildLocks = new HashMap<IProject, ILock>();
//  
//  private synchronized static ILock getLock(IProject project) {
//    ILock lock = buildLocks.get(project);
//    if (lock != null)
//      return lock;
//    lock = Job.getJobManager().newLock();
//    buildLocks.put(project, lock);
//    return lock;
//  }
  
  protected IProject[] build(int kind, @SuppressWarnings("rawtypes") Map args,
      IProgressMonitor monitor) {
    if (kind == IncrementalProjectBuilder.FULL_BUILD) {
      fullBuild(monitor);
    } else {
      IResourceDelta delta = getDelta(getProject());
      if (delta == null) {
        fullBuild(monitor);
      } else {
        incrementalBuild(delta, monitor);
      }
    }
    return null;
  }
  
  protected void clean(IProgressMonitor monitor) throws CoreException {
    File f = getProject().getLocation().append(JavaCore.create(getProject()).getOutputLocation().makeRelativeTo(getProject().getFullPath())).toFile();
    Environment environment = SugarJParseController.makeProjectEnvironment(getProject());
    try {
      FileCommands.delete(new AbsolutePath(f.getPath()));
      FileCommands.delete(environment.getParseBin());
      FileCommands.delete(environment.getCacheDir());
    } catch (IOException e) {
    }
    
  }

  private void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) {
    boolean rebuild = true;

    if (rebuild)
      fullBuild(monitor);
  }

  private void fullBuild(IProgressMonitor monitor) {
    final BaseLanguageRegistry languageReg = BaseLanguageRegistry.getInstance();
    final LinkedList<BuildInput> resources = new LinkedList<BuildInput>();

    try {
      getProject().accept(new IResourceVisitor() {
        Environment environment = SugarJParseController.makeProjectEnvironment(getProject());
        
        @Override
        public boolean visit(IResource resource) throws CoreException {
          Path root = new AbsolutePath(getProject().getLocation().makeAbsolute().toString());
          IPath relPath = resource.getFullPath().makeRelativeTo(getProject().getFullPath());
          if (!relPath.isEmpty() &&
              (environment.getParseBin().equals(new RelativePath(root, relPath.toString())) ||
               environment.getIncludePath().contains(new RelativePath(root, relPath.toString()))))
            return false;
          
          if (languageReg.isRegistered(resource.getFileExtension())) {
            String path = getProject().getLocation().makeAbsolute() + "/" + relPath;
            final RelativePath sourceFile = ModuleSystemCommands.locateSourceFile(
                    path.toString(),
                    environment.getSourcePath()); 
            
            if (sourceFile == null) {
//              org.strategoxt.imp.runtime.Environment.logWarning("cannot locate source file for ressource " + resource.getFullPath());
              return false;
            }
              
            resources.addFirst(new BuildInput(resource, sourceFile, languageReg.getBaseLanguage(resource.getFileExtension())));
          }
          return true;
        }
      });
    } catch (CoreException e) {
      e.printStackTrace();
    }

    build(monitor, resources, "project " + getProject().getName());
  }

  private void build(IProgressMonitor monitor, final List<BuildInput> inputs, String what) {
    final Environment environment = SugarJParseController.makeProjectEnvironment(getProject());
    environment.setGenerateFiles(true);
    
    CommandExecution.SILENT_EXECUTION = false;
    CommandExecution.SUB_SILENT_EXECUTION = false;
    CommandExecution.FULL_COMMAND_LINE = true;

    Log.out = SugarJConsole.getOutputPrintStream();
    Log.err = SugarJConsole.getErrorPrintStream();
    SugarJConsole.activateConsoleOnce();

    Job buildJob = new Job("Build " + what) {
      @Override
      protected IStatus run(IProgressMonitor monitor) {
        ProcessingListener marker = new MarkingProcessingListener(getProject());
        Driver.addProcessingDoneListener(marker);
//        getLock(getProject()).acquire();
        for (BuildInput input : inputs)
          try {
            if (Thread.currentThread().isInterrupted()) {
              monitor.setCanceled(true);
              monitor.done();
              return Status.CANCEL_STATUS;
            }
              
            monitor.beginTask("compile " + input.sourceFile.getRelativePath(), IProgressMonitor.UNKNOWN);

            RelativePath depFile = new RelativePath(environment.getParseBin(), FileCommands.dropExtension(input.sourceFile.getRelativePath()) + ".dep");
            Result res = Result.readDependencyFile(depFile);
            if (res == null || !res.isUpToDate(input.sourceFile, environment))
              res = Driver.run(input.sourceFile, environment, monitor, input.baseLang);
            
            IWorkbenchWindow[] workbenchWindows = PlatformUI.getWorkbench().getWorkbenchWindows();
            for (IWorkbenchWindow workbenchWindow : workbenchWindows)
              for (IWorkbenchPage page : workbenchWindow.getPages())
                for (IEditorReference editorRef : page.getEditorReferences()) {
                  IEditorPart editor = editorRef.getEditor(false);
                  if (editor != null && 
                      editor instanceof UniversalEditor && 
                      editor.getEditorInput() instanceof FileEditorInput &&
                      !Thread.currentThread().isInterrupted()) {
                    IFile file = ((FileEditorInput) editor.getEditorInput()).getFile();
                    if (file.getLocation().toString().equals(input.sourceFile.toString()))
                      ((UniversalEditor) editor).fParserScheduler.schedule();
                  }
                }
          } catch (InterruptedException e) {
            monitor.setCanceled(true);
            monitor.done();
            return Status.CANCEL_STATUS;
          } catch (Exception e) {
            e.printStackTrace();
            try {
              IMarker m = input.resource.createMarker(IMarker.PROBLEM);
              m.setAttribute(IMarker.MESSAGE, "compilation failed: " + e.getMessage());
            } catch (CoreException ce) {
            }
          } finally {
//            getLock(getProject()).release();
            Driver.removeProcessingDoneListener(marker);
            monitor.done();
          }
          return Status.OK_STATUS;
      }
    };
    buildJob.setRule(getProject());
    buildJob.schedule();
  }
}
