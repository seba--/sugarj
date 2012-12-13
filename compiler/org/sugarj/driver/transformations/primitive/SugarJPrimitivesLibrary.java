package org.sugarj.driver.transformations.primitive;

import org.spoofax.interpreter.library.AbstractStrategoOperatorRegistry;
import org.sugarj.driver.Driver;

/**
 * Provides Stratego primitives for SugarJ.
 * 
 * @author seba
 */
public class SugarJPrimitivesLibrary extends AbstractStrategoOperatorRegistry {

  public static final String REGISTRY_NAME = "SUGARJ";
  
  public SugarJPrimitivesLibrary(Driver driver) {
    add(new CurrentPackage(driver));
    add(new CurrentModule(driver));
    add(new CurrentImports(driver));
  }
  
  @Override
  public String getOperatorRegistryName() {
    return REGISTRY_NAME;
  }
}
