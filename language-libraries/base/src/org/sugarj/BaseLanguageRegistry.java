package org.sugarj;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;
import org.sugarj.common.Log;

/**
 * Registry for active base languages. A base language should register here
 * on activation. The editor and compiler query this registry to receive language
 * libraries.
 * 
 * @author seba
 */
public class BaseLanguageRegistry {

  private boolean extensionsLoaded = false;
  
  private Map<String, AbstractBaseLanguage> baseLanguages = new HashMap<String, AbstractBaseLanguage>();

  private static BaseLanguageRegistry instance = new BaseLanguageRegistry();

  private BaseLanguageRegistry() {
  }

  public static BaseLanguageRegistry getInstance() {
    return instance;
  }

  public synchronized void registerBaseLanguage(AbstractBaseLanguage baseLang) {
    baseLanguages.put(baseLang.getSugarFileExtension(), baseLang);
    if (baseLang.getBaseFileExtension() != null)
      baseLanguages.put(baseLang.getBaseFileExtension(), baseLang);
  }

  public synchronized void unregisterBaseLanguage(AbstractBaseLanguage baseLang) {
    AbstractBaseLanguage reg = baseLanguages.get(baseLang.getSugarFileExtension());
    if (reg != null && reg.equals(baseLang))
      baseLanguages.remove(baseLang.getSugarFileExtension());
    
    if (baseLang.getBaseFileExtension() != null) {
      reg = baseLanguages.get(baseLang.getBaseFileExtension());
      if (reg != null && reg.equals(baseLang))
        baseLanguages.remove(baseLang.getBaseFileExtension());
    }
  }
  
  public synchronized AbstractBaseLanguage getBaseLanguage(String extension) {
    if (!extensionsLoaded)
      loadExtensions();
    
    return baseLanguages.get(extension);
  }
  
  public synchronized AbstractBaseLanguage getBaseLanguageByName(String languageName) {
    if (!extensionsLoaded)
      loadExtensions();
    
    for(AbstractBaseLanguage language : baseLanguages.values()) {
      if(language.getLanguageName().equals(languageName)) 
        return language;
    }
    return null;
  }
  
  public synchronized boolean isRegistered(String extension) {
    if (!extensionsLoaded)
      loadExtensions();

    return baseLanguages.containsKey(extension);
  }
  
  private synchronized void loadExtensions() {
    extensionsLoaded = true;

    if (!Platform.isRunning())
      return;
   
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
      Log.log.logErr("Could not load language plugin " + pluginId, Log.ALWAYS);
    else if (bundle.getState() != Bundle.ACTIVE)
      try {
        bundle.start();
      } catch (BundleException e) {
        Log.log.logErr("Could not start language plugin " + pluginId, Log.ALWAYS);
      }
    return bundle;
  }
  
  public synchronized List<String> getRegisteredFileExtensions() {
    if (!extensionsLoaded)
      loadExtensions();

    List<String> list = new LinkedList<String>();
    for (Entry<String, AbstractBaseLanguage> entry : baseLanguages.entrySet())
      if (entry.getKey().equals(entry.getValue().getSugarFileExtension()))
        list.add(entry.getValue().getSugarFileExtension());
    return list;
  }
}
