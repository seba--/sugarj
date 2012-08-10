package org.sugarj.driver.cli;

import java.io.File;
import org.sugarj.LanguageLibFactory;
import org.sugarj.common.FileCommands;
import org.sugarj.common.Log;

import org.sugarj.JavaLibFactory;
import org.sugarj.HaskellLibFactory;
import org.sugarj.PrologLibFactory;

/* Platform-Independent Language Library resolution
 *
 * Matches code files to the correct LanguageLibFactory
 */
public class PILL {
  public static LanguageLibFactory resolve(File source){
    String ext = FileCommands.getExtension(source);
    if("sugj".equals(ext))  return JavaLibFactory.getInstance();
    // cai 09.08.12 TODO recognise extension of SugarHaskell and SugarProlog
    Log.log.logErr("No language library found for source-file extension " + ext);
    return null;
  }
}
