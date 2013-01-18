package org.sugarj.driver.caching;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.strategoxt.lang.Context;
import org.sugarj.util.Pair;

/**
 * Manages instances of org.strategoxt.lang.Context to enable
 *   reuse and exclusive access.
 * 
 * @author seba
 */
public class StrategoContextCache {

  /**
   * Class represents the actual type of the context,
   * first List denotes currently used contexts,
   * second List denotes currently unused contexts.
   */
  private final Map<Class<?>, Pair<? extends List<Context>, ? extends List<WeakReference<Context>>>> cache
    = new HashMap<Class<?>, Pair<? extends List<Context>,? extends List<WeakReference<Context>>>>();
  
  private final Map<Context, Class<?>> ctxToInit = new HashMap<Context, Class<?>>();
  
  /**
   * Retrieves a free context from the cache or generates a new one.
   * 
   * @param purpose
   * @return a context of the given actual type.
   */
  public synchronized Context acquireContext(Class<?> initType) {
    Pair<? extends List<Context>,? extends List<WeakReference<Context>>> p = cache.get(initType);
    if (p == null) {
      p = Pair.create(new ArrayList<Context>(), new ArrayList<WeakReference<Context>>());
      cache.put(initType, p);
    }
    
    Context fresh = null;
    while (fresh == null && !p.b.isEmpty())
      fresh = p.b.remove(0).get();
    
    if (fresh == null)
      try {
        fresh = (Context) initType.getMethod("init").invoke(initType);
      } catch (IllegalAccessException e) {
        throw new IllegalArgumentException("Illegal actual type " + initType, e);
      } catch (IllegalArgumentException e) {
        throw new IllegalArgumentException("Illegal actual type " + initType, e);
      } catch (InvocationTargetException e) {
        throw new IllegalArgumentException("Illegal actual type " + initType, e);
      } catch (NoSuchMethodException e) {
        throw new IllegalArgumentException("Illegal actual type " + initType, e);
      } catch (SecurityException e) {
        throw new IllegalArgumentException("Illegal actual type " + initType, e);
      }
    
    p.a.add(fresh);
    ctxToInit.put(fresh, initType);
    
    return fresh;
  }
  
  /**
   * Releases a previously acquired context.
   */
  public synchronized void releaseContext(Context ctx) {
    Class<?> initType = ctxToInit.remove(ctx);
    
    Pair<? extends List<Context>,? extends List<WeakReference<Context>>> p = cache.get(initType);
    if (p == null || !p.a.contains(ctx))
      throw new IllegalArgumentException("unknown context from initializer " + initType);
    
    p.a.remove(ctx);
    p.b.add(new WeakReference<Context>(ctx));
  }
}
