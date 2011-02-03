package org.sugarj.driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;


/**
 * Shared execution environment.
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class Environment {
  
  public static String sep = "/";
  public static String classpathsep = File.pathSeparator;
  
  public static String src = ".";
  public static String bin = ".";
  public static String cacheDir = null;
  
  /*
   * read-only/write-only cache flags.
   */
  public static boolean rocache = false;
  public static boolean wocache = false;
  
  /*
   * separate parse table compilation
   */
  public static boolean xtblCompilation = false;
  
  /* 
   * parse all imports simultaneously, i.e., not one after the other
   */
  public static boolean atomicImportParsing = false;
  
  
  public static String stdLibDir = "stdlib";
  
  
  public static String trans = "sugarj" + sep + "driver" + sep + "transformations";
  public static String tmpDir = System.getProperty("java.io.tmpdir");
  
  
  public static List<String> srcPath = new ArrayList<String>();
  
  public static List<String> includePath = new ArrayList<String>();
  
  public static String javaDef = null;
  public static String sdfDef = null;
  public static String sdfTbl = null;
  public static String strategoDef = null;
  public static String strategoTbl = null;
  public static String synDir = null;

  public static String initGrammar = null;
  public static String initGrammarModule = null;
  public static String initGrammarAtomicImports = null;
  public static String initGrammarAtomicImportsModule = null;
  public static String initGrammarXTBL = null;
  public static String initTrans = null;
  public static String initTransModule = null;

  public static String strategoxt_jar = null;


  public static void init() throws IOException {
    srcPath.add(src);
    includePath.add(bin);
    
    ClassLoader cl = new URLClassLoader(new URL[] {new File(stdLibDir).toURI().toURL()}, Environment.class.getClassLoader());
    
    URL u;
    
    
    if ((u = cl.getResource("org/sugarj/languages/Java-15.def")) != null) {
      javaDef = u.getPath();
    }
    else notFound("Java grammar org/sugarj/languages/Java-15.def");
      
    if ((u = cl.getResource("org/sugarj/languages/Sdf2.def")) != null) {
      sdfDef = u.getPath();
    }
    else notFound("SDF grammar org/sugarj/languages/Sdf2.def");
    
    if ((u = cl.getResource("org/sugarj/languages/Sdf2.tbl")) != null) {
      sdfTbl = u.getPath();
    }
    else notFound("SDF parse table org/sugarj/languages/Sdf2.tbl");
    
    if ((u = cl.getResource("org/sugarj/languages/Stratego.def")) != null) {
      strategoDef = u.getPath();
    }
    else notFound("Stratego grammar org/sugarj/languages/Stratego.def");
    
    if ((u = cl.getResource("org/sugarj/languages/Stratego.tbl")) != null)  {
      strategoTbl = u.getPath();
    }
    else notFound("Stratego parse table org/sugarj/languages/Stratego.tbl");
    
    if ((u = cl.getResource("org/sugarj/init/initGrammar.sdf")) != null) {
      initGrammar = u.getPath();
      initGrammarModule = "org/sugarj/init/initGrammar";
    }
    else notFound("initial SugarJ grammar org/sugarj/init/initGrammar.sdf");
    
    if ((u = cl.getResource("org/sugarj/init/initGrammar_atomicImports.sdf")) != null) {
      initGrammarAtomicImports = u.getPath();
      initGrammarAtomicImportsModule = "org/sugarj/init/initGrammar_atomicImports";
    }
    else notFound("initial SugarJ grammar org/sugarj/init/initGrammar_atomicImports.sdf");
    
    if (xtblCompilation) {
      if ((u = cl.getResource("org/sugarj/init/initGrammar.xtbl")) != null) {
        initGrammarXTBL = u.getPath();
      }
      else notFound("compiled initial SugarJ grammar org/sugarj/init/initGrammar.xtbl");
    }
    
    if ((u = cl.getResource("org/sugarj/init/initTrans.str")) != null) {
      initTrans = u.getPath();
      initTransModule = "org/sugarj/init/initTrans";
    }
    else notFound("initial SugarJ desugaring org/sugarj/init/initTrans.str");
    
    URL url;
    if ((url = cl.getResource("strategoxt.jar")) != null) {
      strategoxt_jar = url.getPath(); 
    }
    else notFound("Stratego binaries strategoxt.jar");
    
    if (sdfDef != null)
      synDir = new File(sdfDef).getParent();
  }
  
  private static void notFound(String what) throws FileNotFoundException {
    throw new FileNotFoundException("Could not locate " + what + " in the standard library " + stdLibDir + ".");
  }
}
