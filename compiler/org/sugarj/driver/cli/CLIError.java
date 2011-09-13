package org.sugarj.driver.cli;

import org.apache.commons.cli.Options;

/**
 * This is thrown when a problem during option processing
 * occurs.
 *  
 * @author rendel@informatik.uni-marburg.de
 */
public class CLIError extends Error {
  private static final long serialVersionUID = -918505242287737113L;

  private final Options options; 
  
  public CLIError(String message, Options options) {
    super(message);
    this.options = options;
  }
  
  public void showUsage() {
    DriverCLI.showUsageMessage(options);
  }
}