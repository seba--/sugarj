package org.sugarj.driver.transformations.primitive;


import org.eclipse.core.runtime.IProgressMonitor;
import org.spoofax.interpreter.library.AbstractStrategoOperatorRegistry;
import org.sugarj.driver.Driver;
import org.sugarj.driver.Environment;

/**
 * Provides Stratego primitives for SugarJ.
 * 
 * @author seba
 */
public class SugarJPrimitivesLibrary extends AbstractStrategoOperatorRegistry {

  public static final String REGISTRY_NAME = "SUGARJ";
  
  public SugarJPrimitivesLibrary(Driver driver, Environment env, boolean generateFiles, IProgressMonitor monitor) {
    add(new ResolveModel(env));
    add(new CurrentPackage(driver));
    add(new CompileTransformed(generateFiles, env, monitor));
    add(new TransformModel(env, monitor));
    add(new RenameMainArgs());
  }
  
  @Override
  public String getOperatorRegistryName() {
    return REGISTRY_NAME;
  }
}
