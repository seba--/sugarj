package org.sugarj;

import java.util.HashMap;
import java.util.Map;

/**
 * Registry for active language libraries. A language library should register here
 * on activation. The editor and compiler query this registry to receive language
 * libraries.
 * 
 * @author seba
 */
public class LanguageLibRegistry {

  private Map<String, LanguageLibFactory> languageLibs = new HashMap<String, LanguageLibFactory>();

  private static LanguageLibRegistry instance = new LanguageLibRegistry();

  private LanguageLibRegistry() {
  }

  public static LanguageLibRegistry getInstance() {
    return instance;
  }

  public void registerLanguageLib(LanguageLibFactory lib) {
    languageLibs.put(lib.createLanguageLibrary().getSugarFileExtension(), lib);
  }

  public void unregisterLanguageLib(LanguageLibFactory lib) {
    String ext = lib.createLanguageLibrary().getSugarFileExtension();
    LanguageLibFactory reg = languageLibs.get(ext);
    if (reg != null && reg.equals(lib))
      languageLibs.remove(ext);
  }
  
  public LanguageLibFactory getLanguageLib(String extension) {
    return languageLibs.get(extension);
  }
  
  public boolean isRegistered(String extension) {
    return languageLibs.containsKey(extension);
  }
}
