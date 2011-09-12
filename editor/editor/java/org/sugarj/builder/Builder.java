package org.sugarj.builder;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
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
import org.sugarj.driver.CommandExecution;
import org.sugarj.driver.Driver;
import org.sugarj.driver.Environment;
import org.sugarj.driver.FileCommands;
import org.sugarj.driver.Log;
import org.sugarj.driver.ModuleSystemCommands;
import org.sugarj.driver.path.AbsolutePath;
import org.sugarj.driver.path.Path;
import org.sugarj.driver.path.RelativePath;
import org.sugarj.driver.path.RelativeSourceLocationPath;
import org.sugarj.editor.SugarJConsole;
import org.sugarj.editor.SugarJParseController;

/**
 * updates editors to show newly built results
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class Builder extends IncrementalProjectBuilder {

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
    try {
      FileCommands.delete(new AbsolutePath(f.getPath()));
    } catch (IOException e) {
    }
  }

  private void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) {
    fullBuild(monitor);
    // System.out.println("incremental build on " + delta);
    // try {
    // delta.accept(new IResourceDeltaVisitor() {
    // public boolean visit(IResourceDelta delta) {
    // System.out.println("changed: " + delta.getResource().getRawLocation());
    // return true; // visit children too
    // }
    // });
    // } catch (CoreException e) {
    // e.printStackTrace();
    // }
  }

  private void fullBuild(IProgressMonitor monitor) {
    final List<RelativeSourceLocationPath> resources = new LinkedList<RelativeSourceLocationPath>();
    try {
      getProject().accept(new IResourceVisitor() {
        Environment environment = SugarJParseController.makeProjectEnvironment(JavaCore.create(getProject()));
        
        @Override
        public boolean visit(IResource resource) throws CoreException {
          Path root = new AbsolutePath(getProject().getLocation().makeAbsolute().toString());
          Environment environment = this.environment;
          IPath relPath = resource.getFullPath().makeRelativeTo(getProject().getFullPath());
          if (!relPath.isEmpty() &&
              (environment.getBin().equals(new RelativePath(root, relPath.toString())) ||
               environment.getIncludePath().contains(new RelativePath(root, relPath.toString()))))
            return false;
          
          if ("sugj".equals(resource.getFileExtension())) {
            String path = getProject().getLocation().makeAbsolute() + "/" + relPath;
            final RelativeSourceLocationPath sourceFile = ModuleSystemCommands.locateSourceFile(
                    FileCommands.dropExtension(path.toString()),
                    environment.getSourcePath());
            
            if (sourceFile == null)
              throw new IllegalStateException("cannot locate source file for ressource " + resource.getFullPath());
              
            resources.add(sourceFile);
          }
          return true;
        }
      });
    } catch (CoreException e) {
      e.printStackTrace();
    }

    build(monitor, resources, "project " + getProject().getName());
  }

  private void build(IProgressMonitor monitor, final List<RelativeSourceLocationPath> resources, String what) {
    CommandExecution.SILENT_EXECUTION = false;
    CommandExecution.SUB_SILENT_EXECUTION = false;
    CommandExecution.FULL_COMMAND_LINE = true;

    Log.out = SugarJConsole.getOutputPrintStream();
    Log.err = SugarJConsole.getErrorPrintStream();
    SugarJConsole.activateConsoleOnce();

    Job buildJob = new Job("Build " + what) {
      @Override
      protected IStatus run(IProgressMonitor monitor) {
        for (RelativeSourceLocationPath sourceFile : resources)
          try {
            monitor.beginTask("compile " + sourceFile.getRelativePath(),
                IProgressMonitor.UNKNOWN);
            Driver.compile(sourceFile, monitor);
            
            IWorkbenchWindow[] workbenchWindows = PlatformUI.getWorkbench().getWorkbenchWindows();
            for (IWorkbenchWindow workbenchWindow : workbenchWindows)
              for (IWorkbenchPage page : workbenchWindow.getPages())
                for (IEditorReference editorRef : page.getEditorReferences()) {
                  IEditorPart editor = editorRef.getEditor(false);
                  if (editor != null && 
                      editor instanceof UniversalEditor && 
                      editor.getEditorInput() instanceof FileEditorInput) {
                    IFile file = ((FileEditorInput) editor.getEditorInput()).getFile();
                    if (file.getLocation().toString().equals(sourceFile.toString()))
                      ((UniversalEditor) editor).fParserScheduler.schedule();
                  }
                }
            
            
          } catch (InterruptedException e) {
            monitor.setCanceled(true);
            monitor.done();
            return Status.CANCEL_STATUS;
          } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("compilation of "
                + FileCommands.fileName(sourceFile) + " failed", e);
          } finally {
            monitor.done();
          }
          return Status.OK_STATUS;
      }
    };
    buildJob.schedule();
  }
}
