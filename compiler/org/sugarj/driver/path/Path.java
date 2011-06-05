package org.sugarj.driver.path;

import java.io.File;
import java.io.Serializable;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public abstract class Path implements Serializable {
  private static final long serialVersionUID = -5782096855791671291L;

  public abstract String getAbsolutePath();
  
  public File getFile() {
    return new File(getAbsolutePath());
  }
  
  public String toString() {
    return getAbsolutePath();
  }
  
  public int hashCode() {
    return getAbsolutePath().hashCode();
  }
  
  public boolean equals(Object o) {
    return o instanceof Path && ((Path) o).getAbsolutePath().equals(getAbsolutePath());
  }
}
