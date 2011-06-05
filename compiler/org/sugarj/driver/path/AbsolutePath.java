package org.sugarj.driver.path;

import org.sugarj.driver.Environment;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class AbsolutePath extends Path {
  private static final long serialVersionUID = 5295721717436544187L;

  private String path;
  
  public AbsolutePath(String path) {
    while (path.endsWith(Environment.sep))
      path = path.substring(0, path.length() - 1);
    
    this.path = path;
  }
  
  @Override
  public String getAbsolutePath() {
    return path;
  }
}
