package org.sugarj.driver.caching;


/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class ModuleKeyCache<V> extends Cache<ModuleKey, V> {
  private static final long serialVersionUID = 7946929629107155889L;
  
  public void put(ModuleKey k, V v) {
    k.doPut();
    super.remove(k);
    super.put(k, v);
  }

  public V get(ModuleKey k) {
    k.doGet();
    
    return super.get(k);
  }
}
