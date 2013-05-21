package org.sugarj.driver.transformations.primitive;

import org.eclipse.core.runtime.IProgressMonitor;
import org.spoofax.interpreter.library.AbstractStrategoOperatorRegistry;
import org.strategoxt.lang.typesmart.GetTypesmartSort;
import org.strategoxt.lang.typesmart.PutTypesmartSort;
import org.strategoxt.lang.typesmart.UnsafeBuild;
import org.sugarj.common.Environment;
import org.sugarj.driver.Driver;
import org.sugarj.driver.Result;

/**
 * Provides Stratego primitives for SugarJ.
 * 
 * @author seba
 */
public class SugarJPrimitivesLibrary extends AbstractStrategoOperatorRegistry {

  public static final String REGISTRY_NAME = "SUGARJ";
  
  public SugarJPrimitivesLibrary(Driver driver, Environment environment, Result driverResult, IProgressMonitor monitor) {
    add(new ATermToString());
    add(new CurrentPackage(driver));
    add(new CurrentModule(driver));
    add(new CurrentImports(driver));
    add(new CurrentRenamings(environment));
    add(new ResolveModel(environment, driverResult));
    add(new CompileTransformed(driver, environment));
    add(new WriteTransformed(driver, environment));
    add(new UnsafeBuild());
    add(new GetTypesmartSort());
    add(new PutTypesmartSort());
  }
  
  @Override
  public String getOperatorRegistryName() {
    return REGISTRY_NAME;
  }
}
