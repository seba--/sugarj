package org.sugarj.driver.path;

import org.sugarj.driver.Environment;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class RelativePathCache extends RelativePath {
  private static final long serialVersionUID = -6512026699902719579L;

  public RelativePathCache(String relativePath) {
    super(relativePath);
  }
  
  @Override
  public Path getBasePath() {
    return new AbsolutePath(Environment.cacheDir);
  }
}
