package org.sugarj.editor;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.eclipse.core.resources.IProject;
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
import org.strategoxt.imp.runtime.dynamicloading.DescriptorFactory;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.imp.runtime.parser.SGLRParseController;
import org.sugarj.BaseLanguageRegistry;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.StringCommands;
import org.sugarj.common.path.AbsolutePath;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.stdlib.StdLib;

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
        descriptor = new SugarJDescriptor(createDescriptorWithRegisteredExtensions());
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
  
  /*
   * next four declarations are copied from SugarJParseControllerGenerated, except for the call to imposeRegisteredExtensions.
   */
  private static final String TABLE = "/include/" + LANGUAGE + ".tbl";
  private static final String DESCRIPTOR = "/include/" + LANGUAGE + ".packed.esv";
  private static String getPluginLocation() { 
    return SugarJParseController.class.getProtectionDomain().getCodeSource().getLocation().getFile();
  }
  private static Descriptor createDescriptorWithRegisteredExtensions() {
    try
    { 
      InputStream descriptorStream = SugarJParseControllerGenerated.class.getResourceAsStream(DESCRIPTOR);
      InputStream table = SugarJParseControllerGenerated.class.getResourceAsStream(TABLE);
      boolean filesystem = false;
      if(descriptorStream == null && new File("./" + DESCRIPTOR).exists())
      { 
        descriptorStream = new FileInputStream("./" + DESCRIPTOR);
        filesystem = true;
      }
      if(table == null && new File("./" + TABLE).exists())
      { 
        table = new FileInputStream("./" + TABLE);
        filesystem = true;
      }
      if(descriptorStream == null)
        throw new BadDescriptorException("Could not load descriptor file from " + DESCRIPTOR + " (not found in plugin: " + getPluginLocation() + ")");
      if(table == null)
        throw new BadDescriptorException("Could not load parse table from " + TABLE + " (not found in plugin: " + getPluginLocation() + ")");
      
      descriptorStream = imposeRegisteredExtensions(descriptorStream);
      
      Descriptor descriptor = DescriptorFactory.load(descriptorStream, table, filesystem ? org.eclipse.core.runtime.Path.fromPortableString("./") : null);
      descriptor.setAttachmentProvider(SugarJParseControllerGenerated.class);
      return descriptor;
    }
    catch(BadDescriptorException exc)
    { 
      org.strategoxt.imp.runtime.Environment.logException("Bad descriptor for " + LANGUAGE + " plugin", exc);
      throw new RuntimeException("Bad descriptor for " + LANGUAGE + " plugin", exc);
    }
    catch(IOException exc)
    { 
      org.strategoxt.imp.runtime.Environment.logException("I/O problem loading descriptor for " + LANGUAGE + " plugin", exc);
      throw new RuntimeException("I/O problem loading descriptor for " + LANGUAGE + " plugin", exc);
    }
  }

  @Override
  public void initialize(IPath filePath, ISourceProject project,
      IMessageHandler handler) {
    super.initialize(filePath, project, handler);
    
    if (project != null)
      initializeEnvironment(project.getRawProject());
  }
  
  private void initializeEnvironment(IProject project) {
    if (project != null)
      environment = makeProjectEnvironment(project);
    
    if (sugarjParser != null)
      sugarjParser.setEnvironment(environment);
  }

  public static Environment makeProjectEnvironment(IProject project) {
    IJavaProject javaProject = JavaCore.create(project);
    if (javaProject == null)
      return null;
    
    Environment env = null;
    
    try {
      env = makeProjectEnvironment(javaProject);
    } catch (JavaModelException e) {
      throw new RuntimeException(e);
    }
    
    return env;
  }
  
  private static Environment makeProjectEnvironment(IJavaProject project) throws JavaModelException {
    Environment env = new Environment(false, StdLib.stdLibDir);
    
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
      else if (externalPath)
        includePath = new AbsolutePath(p);
      else
        includePath = new RelativePath(root, p);
      
      if (fragment.getKind() == IPackageFragmentRoot.K_SOURCE && fragment.getParent().equals(project))
        env.addToSourcePath(includePath);
      else if (fragment.getKind() == IPackageFragmentRoot.K_BINARY)
        env.addToIncludePath(includePath);
    }
    
    for (String reqProject : project.getRequiredProjectNames()) {
      IJavaProject reqJavaProject = JavaCore.create(project.getProject().getWorkspace().getRoot().getProject(reqProject));
      if (reqJavaProject != null) {
        Environment projEnv = makeProjectEnvironment(reqJavaProject);
//        env.getSourcePath().addAll(projEnv.getSourcePath());
        env.addToIncludePath(projEnv.getParseBin());
      }
    }
  
    setDefaultEnvironmentOptions(env);
    
    return env;
  }
  
  private static void setDefaultEnvironmentOptions(Environment environment) {
    if (environment.getCacheDir() == null)
      environment.setCacheDir(new RelativePath(environment.getRoot(), ".sugarjcache"));

    environment.setAtomicImportParsing(true);
    environment.setNoChecking(true);
    environment.addToIncludePath(new AbsolutePath(new StrategoJarAntPropertyProvider().getAntPropertyValue("")));
  }
  
  private static InputStream imposeRegisteredExtensions(InputStream descriptorStream) {
    String in;
    try {
      in = FileCommands.readStreamAsString(descriptorStream);
    } catch (IOException e) {
      return descriptorStream;
    }
    List<String> exts = BaseLanguageRegistry.getInstance().getRegisteredFileExtensions();
    for (int i = 0; i < exts.size(); i++)
      exts.set(i, "\"" + exts.get(i) + "\"");
    String extsString = StringCommands.printListSeparated(exts, ",");
    String out = in.replaceFirst("Extensions\\(Values\\(\\[.*\\]\\)\\)", "Extensions\\(Values\\(\\[" + extsString + "\\]\\)\\)");
    return new ByteArrayInputStream(out.getBytes());
  }

}