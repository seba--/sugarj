package org.sugarj.common.path;

import java.io.File;


/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class AbsolutePath extends Path {
  private static final long serialVersionUID = 5295721717436544187L;

  private String path;
  
  public AbsolutePath(String path) {
    this.path = trimBack(path).replace(File.separatorChar, '/');
  }
  
  @Override
  public String getAbsolutePath() {
    return path;
  }
}
