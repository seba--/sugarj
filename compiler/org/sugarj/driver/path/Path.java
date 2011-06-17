package org.sugarj.driver.path;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import org.sugarj.driver.Environment;
import org.sugarj.driver.Environment.RelativePathBin;
import org.sugarj.driver.Environment.RelativePathCache;

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
  
  public static Path readPath(ObjectInputStream ois, Environment env) throws IOException, ClassNotFoundException {
    Path p = (Path) ois.readObject();
    return reallocate(p, env);
  }
  
  public static Path reallocate(Path p, Environment env) {
    if (p instanceof RelativePathBin)
      return env.new RelativePathBin(((RelativePath) p).getRelativePath());
    
    if (p instanceof RelativePathCache)
      return env.new RelativePathCache(((RelativePath) p).getRelativePath());
    
    return p;
  }
}
