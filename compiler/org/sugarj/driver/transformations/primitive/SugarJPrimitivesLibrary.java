package org.sugarj.driver.transformations.primitive;

import org.eclipse.core.runtime.IProgressMonitor;
import org.spoofax.interpreter.library.AbstractStrategoOperatorRegistry;
import org.sugarj.common.Environment;
import org.sugarj.driver.Driver;

/**
 * Provides Stratego primitives for SugarJ.
 * 
 * @author seba
 */
public class SugarJPrimitivesLibrary extends AbstractStrategoOperatorRegistry {

  public static final String REGISTRY_NAME = "SUGARJ";
  
  public SugarJPrimitivesLibrary(Driver driver, Environment environment, IProgressMonitor monitor) {
    add(new CurrentRenamings(environment));
  }
  
  @Override
  public String getOperatorRegistryName() {
    return REGISTRY_NAME;
  }
}
