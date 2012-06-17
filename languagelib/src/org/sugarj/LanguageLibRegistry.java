package org.sugarj;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;
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

  public synchronized void registerLanguageLib(LanguageLibFactory lib) {
    languageLibs.put(lib.createLanguageLibrary().getSugarFileExtension(), lib);
  }

  public synchronized void unregisterLanguageLib(LanguageLibFactory lib) {
    String ext = lib.createLanguageLibrary().getSugarFileExtension();
    LanguageLibFactory reg = languageLibs.get(ext);
    if (reg != null && reg.equals(lib))
      languageLibs.remove(ext);
  }
  
  public synchronized LanguageLibFactory getLanguageLib(String extension) {
    if (!extensionsLoaded)
      loadExtensions();
    
    return languageLibs.get(extension);
  }
  
  public synchronized boolean isRegistered(String extension) {
    if (!extensionsLoaded)
      loadExtensions();

    return languageLibs.containsKey(extension);
  }
  
  private synchronized void loadExtensions() {
    extensionsLoaded = true;
    IExtensionRegistry registry = Platform.getExtensionRegistry();
    IExtensionPoint extensionPoint = registry.getExtensionPoint("org.sugarj.language");
    IConfigurationElement[] members = extensionPoint.getConfigurationElements();
    for (IConfigurationElement activatorConf : members) {
      String pluginId = activatorConf.getAttribute("id");
      loadLanguagePlugin(pluginId);
    }
  }
  
  public synchronized Bundle loadLanguagePlugin(String pluginId) {
    Bundle bundle = Platform.getBundle(pluginId);
    if (bundle == null)
      Log.log.logErr("Could not load language plugin " + pluginId);
    else
      try {
        bundle.start();
      } catch (BundleException e) {
        Log.log.logErr("Could not start language plugin " + pluginId);
      }
    return bundle;
  }
}
