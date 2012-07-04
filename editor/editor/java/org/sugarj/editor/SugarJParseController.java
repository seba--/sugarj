package org.sugarj.editor;

import org.eclipse.core.runtime.IPath;
import org.eclipse.imp.model.ISourceProject;
import org.eclipse.imp.parser.IMessageHandler;
import org.eclipse.imp.parser.IParseController;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.strategoxt.eclipse.ant.StrategoJarAntPropertyProvider;
import org.strategoxt.imp.runtime.dynamicloading.BadDescriptorException;
import org.strategoxt.imp.runtime.dynamicloading.Descriptor;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.imp.runtime.parser.SGLRParseController;
import org.sugarj.common.Environment;
import org.sugarj.common.path.AbsolutePath;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.SourceLocation;

public class SugarJParseController extends SugarJParseControllerGenerated {
  
  private static Descriptor descriptor;

  private SugarJParser sugarjParser;
  private Environment environment;
  
  @Override
  public IParseController getWrapped() {
    initDescriptor();
    IParseController result = super.getWrapped();
    if (result instanceof SGLRParseController) {
      JSGLRI parser = ((SGLRParseController) result).getParser();
      if (!(parser instanceof SugarJParser)) {
        sugarjParser = new SugarJParser(parser);

        sugarjParser.setEnvironment(environment);
        
        ((SGLRParseController) result).setParser(sugarjParser);
      }
    }
    
    return result;
  }
  
  public static synchronized Descriptor getDescriptor() { 
    initDescriptor();
    return descriptor;
  }

  public static synchronized Descriptor initDescriptor() {
    try {
      if (descriptor == null) {
        descriptor = new SugarJDescriptor(SugarJParseControllerGenerated.getDescriptor());
        descriptor.setAttachmentProvider(SugarJParseControllerGenerated.class);
        setDescriptor(descriptor);
        // TODO: Optimize - generated parse controller also registers and reinitializes the descriptor...
        org.strategoxt.imp.runtime.Environment.registerDescriptor(descriptor.getLanguage(), descriptor);
      }
      return descriptor;
    } catch (BadDescriptorException e) {
      org.strategoxt.imp.runtime.Environment.logException("Bad descriptor for " + LANGUAGE + " plugin", e);
      throw new RuntimeException("Bad descriptor for " + LANGUAGE + " plugin", e);
    }
  }
  
  @Override
  public void initialize(IPath filePath, ISourceProject project,
      IMessageHandler handler) {
    super.initialize(filePath, project, handler);
    
    if (project != null) {
      IJavaProject javaProject = JavaCore.create(project.getRawProject());
      if (javaProject != null)
        try {
          environment = makeProjectEnvironment(javaProject);
        } catch (JavaModelException e) {
          environment = null;
          throw new RuntimeException(e);
        }
    }
    
    if (sugarjParser != null)
      sugarjParser.setEnvironment(environment);
  }
  
  public static Environment makeProjectEnvironment(IJavaProject project) throws JavaModelException {
    Environment env = new Environment();
    
    IPath fullPath = project.getProject().getFullPath();
    Path root = new AbsolutePath(project.getProject().getLocation().makeAbsolute().toString());
    Path bin = new RelativePath(root, project.getOutputLocation().makeRelativeTo(fullPath).toString());
    env.setRoot(root);
    env.setBin(bin);
    
    for (IPackageFragmentRoot fragment : project.getAllPackageFragmentRoots()) {
      IPath path = fragment.getPath();
      boolean externalPath = fragment.getResource() == null;
      String p = externalPath ? path.toString() : path.makeRelativeTo(fullPath).toString();

      Path includePath; 
      if (fullPath.isPrefixOf(path))
        includePath = p.isEmpty() ? root : new RelativePath(root, p);
      else
        includePath = new AbsolutePath(p);
      
      if (fragment.getKind() == IPackageFragmentRoot.K_SOURCE)
        env.getSourcePath().add(new SourceLocation(includePath, env));
      else if (fragment.getKind() == IPackageFragmentRoot.K_BINARY)
        env.getIncludePath().add(includePath);
    }
    
    for (String reqProject : project.getRequiredProjectNames()) {
      IJavaProject reqJavaProject = JavaCore.create(project.getProject().getWorkspace().getRoot().getProject(reqProject));
      if (reqJavaProject != null) {
        Environment projEnv = makeProjectEnvironment(reqJavaProject);
        env.getSourcePath().addAll(projEnv.getSourcePath());
        env.getIncludePath().add(projEnv.getBin());
      }
    }
  
    setDefaultEnvironmentOptions(env);
    
    return env;
  }
  
  private static void setDefaultEnvironmentOptions(Environment environment) {
    if (environment.getCacheDir() == null)
      environment.setCacheDir(new RelativePath(environment.getRoot(), ".sugarjcache"));
    
    environment.setAtomicImportParsing(true);
    environment.setGenerateJavaFile(true);
    
    environment.setNoChecking(true);

    environment.getIncludePath().add(new AbsolutePath(new StrategoJarAntPropertyProvider().getAntPropertyValue("")));
  }
}