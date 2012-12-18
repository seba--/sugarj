package org.sugarj.driver.transformations.primitive;


import java.util.LinkedHashMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.spoofax.interpreter.library.AbstractStrategoOperatorRegistry;
import org.sugarj.driver.Driver;
import org.sugarj.driver.Environment;
import org.sugarj.driver.path.Path;

/**
 * Provides Stratego primitives for SugarJ.
 * 
 * @author seba
 */
public class SugarJPrimitivesLibrary extends AbstractStrategoOperatorRegistry {

  public static final String REGISTRY_NAME = "SUGARJ";
  
  public SugarJPrimitivesLibrary(Driver driver, Environment env, boolean generateFiles, IProgressMonitor monitor, LinkedHashMap<Path, Driver> currentlyProcessing) {
    add(new ResolveModel(env));
    add(new CurrentPackage(driver));
    add(new CompileTransformed(driver, generateFiles, env, monitor, currentlyProcessing));
    add(new WriteTransformed(driver, env, generateFiles));
    add(new RenameMainArgs());
    
    add(new ExecuteCommand());
    add(new TempDir());
    add(new TempFile());
  }
  
  @Override
  public String getOperatorRegistryName() {
    return REGISTRY_NAME;
  }
}
