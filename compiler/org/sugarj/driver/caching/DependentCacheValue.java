package org.sugarj.driver.caching;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.sugarj.driver.FileCommands;
import org.sugarj.driver.path.Path;


/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class DependentCacheValue<V extends Serializable> implements Serializable {
  private static final long serialVersionUID = 7946929629107155889L;
  
  private final Map<Path, Integer> dependencies;
  
  private final V value;
  
  public DependentCacheValue(Collection<Path> dependencies, V value) throws IOException {
    this.dependencies = new HashMap<Path, Integer>();
    for (Path dep : dependencies)
      this.dependencies.put(dep, FileCommands.fileHash(dep));
    this.value = value;
  }
  
  public V get() throws IOException {
    for (Map.Entry<Path, Integer> entry : dependencies.entrySet())
      if (FileCommands.fileHash(entry.getKey()) != entry.getValue())
        return null;
    
    return value;
  }
  
  /**
   * @return true if a DependentCacheValue with 'other' dependencies can replace this value.
   */
  public boolean canReplace(Collection<Path> other) {
    return this.dependencies.keySet().containsAll(other);
  }
  
  public static Path lookupPathInList(List<DependentCacheValue<Path>> list) throws IOException {
    for (Iterator<DependentCacheValue<Path>> it = list.iterator(); it.hasNext(); ) {
      DependentCacheValue<Path> d = it.next();
      Path p = d.get();
      if (p == null || !FileCommands.exists(p)) {
        it.remove();
        if (FileCommands.exists(d.value))
          FileCommands.delete(d.value);
      }
      else
        return p;
    }
    return null;
  }
}
