package org.sugarj.driver.caching;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class ModuleKeyCache<V extends Serializable> implements Serializable {
  private static final long serialVersionUID = 7946929629107155889L;
  
  private final Object lock;
  private final Map<ModuleKey, V> cache;
  
  public ModuleKeyCache(Object lock) {
    this.lock = lock;
    cache = new HashMap<ModuleKey, V>();
  }
  
  public void put(ModuleKey k, V v) {
    synchronized (lock) {
      k.doPut();
      cache.remove(k);
      cache.put(k, v);
      k.doGet();
    }
  }

  public V putGet(ModuleKey k, V v) {
    synchronized (lock) {
      k.doPut();
      V old = cache.get(k);
      cache.remove(k);
      cache.put(k, v);
      return old;
    }
  }

  public V get(ModuleKey k) {
    synchronized (lock) {
      k.doGet();
      return cache.get(k);
    }
  }
}
