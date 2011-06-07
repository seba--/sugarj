package org.sugarj.editor;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.core.runtime.IPath;
import org.eclipse.imp.model.ISourceProject;
import org.eclipse.imp.parser.IMessageHandler;
import org.eclipse.imp.parser.IParseController;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.strategoxt.imp.runtime.Environment;
import org.strategoxt.imp.runtime.dynamicloading.BadDescriptorException;
import org.strategoxt.imp.runtime.dynamicloading.Descriptor;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.imp.runtime.parser.SGLRParseController;

public class SugarJParseController extends SugarJParseControllerGenerated {
  
  private static Descriptor descriptor;

  private SugarJParser sugarjParser;
  private String projectPath;

  private String outputPath;
  private ArrayList<String> includePath;
  private ArrayList<String> sourcePath;
  
  @Override
  public IParseController getWrapped() {
    initDescriptor();
    IParseController result = super.getWrapped();
    if (result instanceof SGLRParseController) {
      JSGLRI parser = ((SGLRParseController) result).getParser();
      if (!(parser instanceof SugarJParser)) {
        sugarjParser = new SugarJParser(parser);

        sugarjParser.setProjectPath(projectPath);
        sugarjParser.setOutputPath(outputPath);
        sugarjParser.setIncludePath(includePath);
        sugarjParser.setSourcePath(sourcePath);
        
        ((SGLRParseController) result).setParser(sugarjParser);
      }
    }
    
    return result;
  }
  
  public static synchronized Descriptor initDescriptor() {
    try {
      if (descriptor == null) {
        descriptor = new SugarJDescriptor(SugarJParseControllerGenerated.getDescriptor());
        descriptor.setAttachmentProvider(SugarJParseControllerGenerated.class);
        setDescriptor(descriptor);
        // TODO: Optimize - generated parse controller also registers and reinitializes the descriptor...
        Environment.registerDescriptor(descriptor.getLanguage(), descriptor);
      }
      return descriptor;
    } catch (BadDescriptorException e) {
      Environment.logException("Bad descriptor for " + LANGUAGE + " plugin", e);
      throw new RuntimeException("Bad descriptor for " + LANGUAGE + " plugin", e);
    }
  }
  
  @Override
  public void initialize(IPath filePath, ISourceProject project,
      IMessageHandler handler) {
    super.initialize(filePath, project, handler);
    
    if (project != null) {
      projectPath = project.getRawProject().getLocation().makeAbsolute().toString();
      IJavaProject javaProject = JavaCore.create(project.getRawProject());
      if (javaProject != null)
        try { 
          
          outputPath = projectPath + File.separator + javaProject.getOutputLocation().makeRelativeTo(project.getRawProject().getFullPath()).toString();
          
          sourcePath = new ArrayList<String>();
          includePath = new ArrayList<String>();
          for (IPackageFragmentRoot root : javaProject.getAllPackageFragmentRoots()) {
            IPath path = root.getPath();
            boolean externalPath = root.getResource() == null;
            String p = externalPath ? path.toString() : projectPath + "/" + path.makeRelativeTo(project.getRawProject().getFullPath());
            if (root.getKind() == IPackageFragmentRoot.K_SOURCE)
              sourcePath.add(p);
            else if (root.getKind() == IPackageFragmentRoot.K_BINARY)
              includePath.add(p);
          }
          
          for (String reqProject : javaProject.getRequiredProjectNames()) {
            IJavaProject reqJavaProject = JavaCore.create(project.getRawProject().getWorkspace().getRoot().getProject(reqProject));
            IPath reqProjectPath = reqJavaProject.getProject().getLocation().makeAbsolute();
            if (reqJavaProject != null)
              includePath.add(reqProjectPath + "/" + reqJavaProject.getOutputLocation().makeRelativeTo(reqJavaProject.getProject().getFullPath()).toPortableString());
          }
        } catch (JavaModelException e) { 
          outputPath = null; 
        }
      else
        outputPath = null;
    }
    
    if (sugarjParser != null) {
      sugarjParser.setProjectPath(projectPath);
      sugarjParser.setOutputPath(outputPath);
      sugarjParser.setIncludePath(includePath);
      sugarjParser.setSourcePath(sourcePath);
    }
  }
}