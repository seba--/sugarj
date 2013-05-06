package org.sugarj.stdlib;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class StdLib {

  public static final String VERSION = "stdlib-0.4";
  
  public static File stdLibDir;
  private static String stdLibTmpDir;
  static {

    String thisClassPath = "org/sugarj/stdlib/StdLib.class";
    URL thisClassURL = StdLib.class.getClassLoader().getResource(thisClassPath);
    
    if (thisClassURL.getProtocol().equals("bundleresource"))
      try {
        thisClassURL = FileLocator.resolve(thisClassURL);
      } catch (IOException e) {
        e.printStackTrace();
      }
    
    String classPath = thisClassURL.getPath();
    String binPath = classPath.substring(0, classPath.length() - thisClassPath.length());
    
    try {
      stdLibDir = new File(binPath);
      
      File f = File.createTempFile("org.sugarj.stdlib", "");
      f.delete();
      f.mkdir();
      stdLibTmpDir = f.getPath();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static File ensureFile(String resource) {
    File f = new File(stdLibDir.getPath() + File.separator + resource);
    if (f.exists())
      return f;
    
    f = new File(stdLibTmpDir + "/" + resource);
    f.getParentFile().mkdirs();
    
    try {
      InputStream in = StdLib.class.getClassLoader().getResourceAsStream(resource);
      if (in == null)
        return  new File(stdLibDir.getPath() + File.separator + resource);
      
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
  
  public static File sdfDef = ensureFile("org/sugarj/languages/Sdf2.def");
  public static File sdfTbl = ensureFile("org/sugarj/languages/Sdf2.tbl");
  public static File strategoDef = ensureFile("org/sugarj/languages/Stratego.def");
  public static File strategoTbl = ensureFile("org/sugarj/languages/Stratego.tbl");
  public static File editorServicesDef = ensureFile("org/sugarj/languages/EditorServices.def");
  public static File editorServicesTbl = ensureFile("org/sugarj/languages/EditorServices.tbl");
  public static File plainDef = ensureFile("org/sugarj/languages/Plain.def");
  public static File commonDef = ensureFile("org/sugarj/stdlib/Common.def");
  public static File sugarDef = ensureFile("org/sugarj/languages/Sugar.def");
  public static File modelDef = ensureFile("org/sugarj/languages/Model.def");
  public static File failureTrans = ensureFile("failure-trans.jar");
  public static File stdEditor = ensureFile("org/sugarj/stdlib/StdEditor.serv");

  public static List<File> stdGrammars() {
    return Arrays.asList(new File[]{sdfDef, strategoDef, editorServicesDef, plainDef, commonDef, sugarDef, modelDef});
  }
  
  public static List<String> stdStrategoLibs() {
    return Arrays.asList(new String[] {"stratego-lib", "stratego-sdf", "strc"});
  }

  public static void main(String args[]) {
    exists(stdLibDir);
    exists(sdfDef);
    exists(sdfTbl);
    exists(strategoDef);
    exists(strategoTbl);
    exists(editorServicesDef);
    exists(editorServicesTbl);
    exists(plainDef);
    exists(commonDef);
    exists(sugarDef);
    exists(failureTrans);
  }
  
  private static void exists(File file) {
    if (file.exists())
      System.out.println(file.getPath() + " exists.");
    else
      System.err.println(file.getPath() + " does not exist.");
  }
}
