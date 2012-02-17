package org.sugarj.driver.transformations.primitive;


import org.spoofax.interpreter.library.AbstractStrategoOperatorRegistry;
import org.sugarj.driver.Environment;

/**
 * Provides primitives for looking up modules. See also org.sugarj.driver.ModuleSystemCommands.
 * 
 * @author seba
 */
public class SugarJPrimitivesLibrary extends AbstractStrategoOperatorRegistry {

  public static final String REGISTRY_NAME = "SUGARJ";
  
  public SugarJPrimitivesLibrary(Environment env) {
    add(new ResolveModel(env));
  }
  
  @Override
  public String getOperatorRegistryName() {
    return REGISTRY_NAME;
  }
}
