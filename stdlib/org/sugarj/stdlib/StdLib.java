package org.sugarj.stdlib;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class StdLib {

  public static URI stdLibDir = new File("/Users/seba/svn-strategoxt/sugarj/branches/SugarJ-editor-services/stdlib").toURI();

  public static URI sugarjDef = new File(stdLibDir.getPath() + "/" + "org/sugarj/languages/SugarJ.def").toURI();
  public static URI javaDef = new File(stdLibDir.getPath() + "/" + "org/sugarj/languages/Java-15.def").toURI();
  public static URI sdfDef = new File(stdLibDir.getPath() + "/" + "org/sugarj/languages/Sdf2.def").toURI();
  public static URI sdfTbl = new File(stdLibDir.getPath() + "/" + "org/sugarj/languages/Sdf2.tbl").toURI();
  public static URI strategoDef = new File(stdLibDir.getPath() + "/" + "org/sugarj/languages/Stratego.def").toURI();
  public static URI strategoTbl = new File(stdLibDir.getPath() + "/" + "org/sugarj/languages/Stratego.tbl").toURI();
  public static URI editorServiceDef = new File(stdLibDir.getPath() + "/" + "org/sugarj/languages/EditorServices.def").toURI();

  public static URI initGrammar = new File(stdLibDir.getPath() + "/" + "org/sugarj/init/initGrammar.sdf").toURI();
  public static String initGrammarModule = "org/sugarj/init/initGrammar";
  public static URI initGrammarAtomicImports = new File(stdLibDir.getPath() + "/" + "org/sugarj/init/initGrammar_atomicImports.sdf").toURI();
  public static String initGrammarAtomicImportsModule = "org/sugarj/init/initGrammar_atomicImports";
  public static URI initGrammarXTBL = new File(stdLibDir.getPath() + "/" + "org/sugarj/init/initGrammar.xtbl").toURI();
  public static URI initTrans = new File(stdLibDir.getPath() + "/" + "org/sugarj/init/initTrans.str").toURI();
  public static String initTransModule = "org/sugarj/init/initTrans";

  public static URI binDir = new File(System.getProperty("user.home") + "/.nix-profile/bin").toURI();
  
  public static void main(String args[]) throws URISyntaxException {
    exists(javaDef);
    exists(sdfDef);
    exists(sdfTbl);
    exists(strategoDef);
    exists(strategoTbl);
    exists(initGrammar);
    exists(initGrammarAtomicImports);
    exists(initGrammarXTBL);
    exists(initTrans);
    exists(stdLibDir);
    exists(binDir);
  }
  
  private static void exists(URI uri) {
    if (new File(uri).exists())
      System.out.println(uri.getPath() + " exists.");
    else
      System.out.println(uri.getPath() + " does not exist.");
  }
}
