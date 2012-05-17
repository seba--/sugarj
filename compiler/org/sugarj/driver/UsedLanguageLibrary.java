package org.sugarj.driver;

import org.sugarj.JavaLib;
import org.sugarj.LanguageLib;

public class UsedLanguageLibrary {
  // TODO: Remove this class
  /**
   *  This class is only used for development purposes and will be removed
   *  as soon as the editor supports multiple language in a more convenient way.
   *  
   *   This is implemented as a method to enable switching the language library while debugging.
   */
  public static LanguageLib getFreshLanguageLibrary() {
    return new JavaLib();
  }
}
