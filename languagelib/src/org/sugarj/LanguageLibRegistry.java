package org.sugarj;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.sugarj.common.Log;

/**
 * Registry for active language libraries. A language library should register here
 * on activation. The editor and compiler query this registry to receive language
 * libraries.
 * 
 * @author seba
 */
public class LanguageLibRegistry {

  private boolean extensionsLoaded = false;
  
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
    if (!extensionsLoaded)
      loadExtensions();
    
    return languageLibs.get(extension);
  }
  
  public boolean isRegistered(String extension) {
    if (!extensionsLoaded)
      loadExtensions();

    return languageLibs.containsKey(extension);
  }
  
  private void loadExtensions() {
    extensionsLoaded = true;
    IExtensionRegistry registry = Platform.getExtensionRegistry();
    IExtensionPoint extensionPoint = registry.getExtensionPoint("org.sugarj.language");
    IConfigurationElement[] members = extensionPoint.getConfigurationElements();
    for (IConfigurationElement conf : members) {
      String clName = conf.getAttribute("activator");
      loadExtension(clName);
    }
  }
  
  public void loadExtension(String activatorClass) {
    try {
      Class<?> activator = getClass().getClassLoader().loadClass(activatorClass);
      activator.newInstance();
    } catch (ClassNotFoundException e) {
      Log.log.logErr("Could not find language library " + activatorClass);
    } catch (InstantiationException e) {
      Log.log.logErr("Could not instantiate language library " + activatorClass);
    } catch (IllegalAccessException e) {
      Log.log.logErr("Could not access language library " + activatorClass);
    }
  }
}
