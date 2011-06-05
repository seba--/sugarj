package org.sugarj.driver.path;

import org.sugarj.driver.Environment;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class RelativePathBin extends RelativePath {
  private static final long serialVersionUID = -58074597968703177L;

  public RelativePathBin(String relativePath) {
    super(relativePath);
  }
  
  @Override
  public Path getBasePath() {
    return new AbsolutePath(Environment.bin);
  }

}
