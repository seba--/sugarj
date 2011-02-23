package org.sugarj.driver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.spoofax.interpreter.terms.IStrategoTerm;


/**
 * Shared execution environment.
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class Environment {
  
  public static Map<String, IStrategoTerm> terms = new WeakHashMap<String, IStrategoTerm>();
  
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
   * parse all imports simultaneously, i.e., not one after the other
   */
  public static boolean atomicImportParsing = false;
  
  /*
   * don't check resulting sdf and stratego files after splitting
   */
  public static boolean noChecking = false;
  
  
  public static String trans = "sugarj" + sep + "driver" + sep + "transformations";
  public static String tmpDir = System.getProperty("java.io.tmpdir");
  
  
  public static List<String> srcPath = new ArrayList<String>();
  
  public static List<String> includePath = new ArrayList<String>();
  
  public static void init() throws IOException {
    srcPath.add(src);
    includePath.add(bin);
  }
}
