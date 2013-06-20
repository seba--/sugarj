package org.sugarj.driver.transformations.primitive;

import org.eclipse.core.runtime.IProgressMonitor;
import org.sugarj.common.Environment;
import org.sugarj.driver.Driver;

/**
 * @author seba
 *
 */
public class SugarJPrimitiveContext {
  private Driver driver;
  private Environment environment;
  private boolean generateFiles;
  private IProgressMonitor monitor;
  
  public Driver getDriver() {
    return driver;
  }
  public void setDriver(Driver driver) {
    this.driver = driver;
  }
  public Environment getEnvironment() {
    return environment;
  }
  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }
  public boolean isGenerateFiles() {
    return generateFiles;
  }
  public void setGenerateFiles(boolean generateFiles) {
    this.generateFiles = generateFiles;
  }
  public IProgressMonitor getMonitor() {
    return monitor;
  }
  public void setMonitor(IProgressMonitor monitor) {
    this.monitor = monitor;
  }
}
