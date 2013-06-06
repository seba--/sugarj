package org.sugarj;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.common.FileCommands;
import org.sugarj.common.Log;
import org.sugarj.stdlib.StdLib;

/**
 * Factory for language libraries. Configures some fixed options, such as file
 * extensions.
 * 
 * @author seba, frieger
 * 
 */
public abstract class LanguageLibFactory implements ILanguageLibFactory {
  private transient File libDir;
  private transient File libTmpDir;

  @Override
  public String getOriginalFileExtension() {
    return null;
  }
  
  public List<File> getDefaultGrammars() {
    return StdLib.stdGrammars();
  }

  public final File getLibraryDirectory() {
    if (libDir == null) { // set up directories first
      String thisClassPath = this.getClass().getName().replace(".", "/") + ".class";
      URL thisClassURL = this.getClass().getClassLoader().getResource(thisClassPath);
      
      if (thisClassURL.getProtocol().equals("bundleresource"))
        try {
          thisClassURL = FileLocator.resolve(thisClassURL);
        } catch (IOException e) {
          e.printStackTrace();
        }
      
      String classPath = thisClassURL.getPath();
      String binPath = classPath.substring(0, classPath.length() - thisClassPath.length());
      
      libDir = new File(binPath);
    }
    
    return libDir;
  }

  public File ensureFile(String resource) {
    File f = new File(getLibraryDirectory().getPath() + File.separator + resource);
  
    if (f.exists())
      return f;
  
    if (libTmpDir == null) {
      try {
        libTmpDir = File.createTempFile(FileCommands.fileName(getLibraryDirectory().getAbsolutePath()), "");
        libTmpDir.delete();
        libTmpDir.mkdir();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  
    f = new File(libTmpDir.getPath() + "/" + resource);
    f.getParentFile().mkdirs();
  
    try {
      InputStream in = this.getClass().getClassLoader().getResourceAsStream(resource);
      if (in == null) {
        Log.log.logErr("Could not load resource " + resource, Log.ALWAYS);
        return new File(getLibraryDirectory().getPath() + File.separator + resource);
      }
  
      FileOutputStream fos = new FileOutputStream(f);
      int len = -1;
      byte[] bs = new byte[256];
      while ((len = in.read(bs)) >= 0)
        fos.write(bs, 0, len);
      fos.close();
      in.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  
    return f;
  }

  public          IStrategoTerm getTransformationApplication(IStrategoTerm decl) { return null; }

  public          IStrategoTerm getTransformationBody(IStrategoTerm decl) { return null; }

  public          String getTransformationName(IStrategoTerm decl) throws IOException { return null; }

  public          boolean isModelDec(IStrategoTerm decl) { return false; }

  public          boolean isTransformationApplication(IStrategoTerm decl) { return false; }

  public          boolean isTransformationDec(IStrategoTerm decl) { return false; }

  public          boolean isTransformationImportDec(IStrategoTerm decl) { return false; }

  public          String getModelName(IStrategoTerm decl) throws IOException { return null; }
}
