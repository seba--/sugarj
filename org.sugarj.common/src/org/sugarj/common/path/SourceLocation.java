package org.sugarj.common.path;

import java.io.Serializable;

import org.sugarj.common.Environment;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class SourceLocation implements Serializable {
  private static final long serialVersionUID = 108583591484866411L;

  private Path path;
  private Environment env;

  public SourceLocation(Path path, Environment env) {
    this.path = path;
    this.env = env;
  }

  public Path getPath() {
    return path;
  }

  public Environment getEnvironment() {
    return env;
  }
}
