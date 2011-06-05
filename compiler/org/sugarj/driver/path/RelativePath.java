package org.sugarj.driver.path;

import org.sugarj.driver.Environment;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class RelativePath extends Path {
  private static final long serialVersionUID = -3853468843909929534L;
  
  private final String relativePath;
  private Path base;
    
  public RelativePath(String relativePath) {
    this.relativePath = relativePath;
  }
  
  public RelativePath(Path base, String relativePath) {
    this.relativePath = relativePath;
    this.base = base;
  }
  
  public String getRelativePath() {
    return relativePath;
  }
  
  public void setBasePath(Path base) {
    this.base = base;
  }
  
  public Path getBasePath() {
    return base;
  }

  @Override
  public String getAbsolutePath() {
    if (getBasePath() == null)
      throw new IllegalStateException("Base of relative path is still open; cannot construct absolute path yet.");
      
    return getBasePath() + Environment.sep + getRelativePath();
  }
}
