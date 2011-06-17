package org.sugarj.driver.caching;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 *
 */
public class Cache<K extends Serializable,V extends Serializable> implements Serializable {

  private static final long serialVersionUID = -2259409096012167237L;

  // TODO replace HasMap by proper cache implementation
  private HashMap<K,V> cache;
  
  public Cache() {
    cache = new HashMap<K,V>();
  }

  public void put(K k, V v) {
    cache.put(k, v);
  }

  public V get(K k) {
    return cache.get(k);
  }
  
  public void remove(K k) {
    cache.remove(k);
  }
  
  public int size() {
    return cache.size();
  }
  
  public Set<Entry<K, V>> entrySet() {
    return cache.entrySet();
  }
}
