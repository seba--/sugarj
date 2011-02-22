package org.sugarj.driver.caching;

import java.io.Serializable;
import java.util.HashMap;

import org.sugarj.driver.Environment;


/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 *
 */
public class Cache<K,V> implements Serializable {

  private static final long serialVersionUID = -2259409096012167237L;

  // TODO replace HasMap by proper cache implementation
  private HashMap<K,V> cache;
  
  public Cache() {
    cache = new HashMap<K,V>();
  }

  public void put(K k, V v) {
    if (!Environment.rocache)
      cache.put(k, v);
  }

  public V get(K k) {
    if (Environment.wocache)
      return null;
    
    return cache.get(k);
  }
  
  public void remove(K k) {
    if (!Environment.rocache)
      cache.remove(k);
  }
  
  public int size() {
    return cache.size();
  }
}
