package org.sugarj.driver;

import org.strategoxt.lang.Context;
import org.sugarj.driver.caching.StrategoContextCache;

/**
 * Management of Stratego contexts.
 * 
 * @author seba
 */
public class SugarJContexts {
  private SugarJContexts() {
  }

  private static StrategoContextCache ctxCache = new StrategoContextCache();

  public static void releaseContext(Context ctx) {
    if (ctx == null)
      return;
    ctxCache.releaseContext(ctx);
  }

  public static Context makePermissiveContext() {
    return ctxCache.acquireContext(org.strategoxt.permissivegrammars.make_permissive.class);
  }

  public static Context xtcContext() {
    return ctxCache.acquireContext(org.strategoxt.stratego_xtc.stratego_xtc.class);
  }

  public static Context extractionContext() {
    return ctxCache.acquireContext(org.sugarj.driver.transformations.extraction.extraction.class);
  }
  
  public static Context renameRulesContext() {
    return ctxCache.acquireContext(org.sugarj.driver.transformations.renaming.renaming.class);
  }

}
