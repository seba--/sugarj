package org.sugarj.common.path;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.sugarj.common.Environment;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class RelativePath extends Path {
  private String relativePath;
  private Path base;
    
  /**
   *  For externalization only.
   */
  public RelativePath() { }
  
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

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeObject(base);
    out.writeObject(relativePath);
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    base = (Path) in.readObject();
    relativePath = (String) in.readObject();
  }
  
  @Override
  public String toString() {
    if (base == null)
      return relativePath;
    return getAbsolutePath();
  }
}
