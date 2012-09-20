package org.sugarj.common.path;

import java.io.File;

import org.sugarj.common.Environment;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class RelativePath extends Path {
  private static final long serialVersionUID = -3853468843909929534L;
  
  private final String relativePath;
  private Path base;
    
  public RelativePath(String relativePath) {
    this(null, relativePath);
  }
  
  public RelativePath(Path base, String relativePath) {
    this.relativePath = trimFront(trimBack(relativePath)).replace(File.separatorChar, '/');
    this.base = base;
    
    if (relativePath == null || relativePath.isEmpty())
      throw new IllegalArgumentException();
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
