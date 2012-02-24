package org.sugarj.stdlib;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;

import org.eclipse.core.runtime.FileLocator;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class StdLib {

  public static URI stdLibDir;
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
      stdLibDir = new File(binPath).toURI();
      
      File f = File.createTempFile("org.sugarj.stdlib", "");
      f.delete();
      f.mkdir();
      stdLibTmpDir = f.getPath();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static URI ensureFile(String resource) {
    File f = new File(stdLibDir.getPath() + File.separator + resource);
    if (f.exists())
      return f.toURI();
    
    f = new File(stdLibTmpDir + "/" + resource);
    f.getParentFile().mkdirs();
    
    try {
      InputStream in = StdLib.class.getClassLoader().getResourceAsStream(resource);
      if (in == null)
        return  new File(stdLibDir.getPath() + File.separator + resource).toURI();
      
      FileOutputStream fos = new FileOutputStream(f);
      byte[] bs = new byte[256];
      while (in.read(bs) >= 0)
        fos.write(bs);
      fos.close();
      in.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    return f.toURI();
  }
  

  
//  public static URI sugarjDef = ensureFile("org/sugarj/languages/SugarJ.def");
//  public static URI javaDef = ensureFile("org/sugarj/languages/Java-15.def");
  public static URI sdfDef = ensureFile("org/sugarj/languages/Sdf2.def");
  public static URI sdfTbl = ensureFile("org/sugarj/languages/Sdf2.tbl");
  public static URI strategoDef = ensureFile("org/sugarj/languages/Stratego.def");
  public static URI strategoTbl = ensureFile("org/sugarj/languages/Stratego.tbl");
  public static URI editorServicesDef = ensureFile("org/sugarj/languages/EditorServices.def");
  public static URI editorServicesTbl = ensureFile("org/sugarj/languages/EditorServices.tbl");
  public static URI plainDef = ensureFile("org/sugarj/languages/Plain.def");
  
//  public static URI initGrammar = ensureFile("org/sugarj/init/initGrammar.sdf");
//  public static String initGrammarModule = "org/sugarj/init/initGrammar";
//  public static URI initGrammarAtomicImports = ensureFile("org/sugarj/init/initGrammar_atomicImports.sdf");
//  public static String initGrammarAtomicImportsModule = "org/sugarj/init/initGrammar_atomicImports";
//  public static URI initGrammarXTBL = ensureFile("org/sugarj/init/initGrammar.xtbl");
//  public static URI initTrans = ensureFile("org/sugarj/init/InitTrans.str");
//  public static String initTransModule = "org/sugarj/init/InitTrans";
//  public static URI initEditor = ensureFile("org/sugarj/init/initEditor.serv");
//  public static String initEditorModule = "org/sugarj/init/initEditor";


  public static void main(String args[]) throws URISyntaxException {
//    exists(javaDef);
    exists(sdfDef);
    exists(sdfTbl);
    exists(strategoDef);
    exists(strategoTbl);
    exists(editorServicesDef);
    exists(editorServicesTbl);
    exists(plainDef);
//    exists(initGrammar);
//    exists(initGrammarAtomicImports);
//    exists(initGrammarXTBL);
//    exists(initTrans);
//    exists(initEditor);
    exists(stdLibDir);
  }
  
  private static void exists(URI uri) {
    if (new File(uri).exists())
      System.out.println(uri.getPath() + " exists.");
    else
      System.err.println(uri.getPath() + " does not exist.");
  }
}
