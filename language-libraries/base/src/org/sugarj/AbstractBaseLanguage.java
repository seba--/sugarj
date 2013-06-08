package org.sugarj;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.common.FileCommands;
import org.sugarj.common.Log;
import org.sugarj.common.path.AbsolutePath;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.stdlib.StdLib;

/**
 * Abstract base language representation. Configures some fixed options, such as file
 * extensions.
 * 
 * @author seba, frieger
 * 
 */
public abstract class AbstractBaseLanguage implements IBaseLanguage {
  private transient Path libDir;
  private transient Path libTmpDir;

  public List<Path> getPackagedGrammars() {
    return StdLib.stdGrammars();
  }

  public final Path getPluginDirectory() {
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
      
      libDir = new AbsolutePath(binPath);
    }
    
    return libDir;
  }

  public Path ensureFile(String resource) {
    Path f = new RelativePath(getPluginDirectory(), resource);
  
    if (FileCommands.exists(f))
      return f;
  
    if (libTmpDir == null) {
      try {
        libTmpDir = FileCommands.newTempDir();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  
    f = new RelativePath(libTmpDir, resource);
    f.getFile().getParentFile().mkdirs();
  
    try {
      InputStream in = this.getClass().getClassLoader().getResourceAsStream(resource);
      if (in == null) {
        Log.log.logErr("Could not load resource " + resource, Log.ALWAYS);
        return new RelativePath(getPluginDirectory(), resource);
      }
  
      FileOutputStream fos = new FileOutputStream(f.getFile());
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
