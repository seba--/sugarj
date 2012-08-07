package org.sugarj.common.path;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import org.sugarj.common.Environment;

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

  protected String trimFront(String path) {
    while (path.startsWith(Environment.sep))
      path = path.substring(1, path.length());
    return path;
  }
  
  protected String trimBack(String path) {
    while (path.endsWith(Environment.sep))
      path = path.substring(0, path.length() - 1);
    return path;
  }

  
  public static Path readPath(ObjectInputStream ois, Environment env) throws IOException, ClassNotFoundException {
    return readPath(ois, env, true);
  }
  
  public static Path readPath(ObjectInputStream ois, Environment env, boolean reallocate) throws IOException, ClassNotFoundException {
    Path p = (Path) ois.readObject();
    return reallocate ? reallocate(p, env) : p;
  }
  
  public static Path reallocate(Path p, Environment env) {
    // TODO: Uncomment
/*    if (p instanceof RelativePathBin)
      return env.new RelativePathBin(((RelativePath) p).getRelativePath(), env);
    
    if (p instanceof RelativePathCache)
      return env.new RelativePathCache(((RelativePath) p).getRelativePath(), env);
    */
    return p;
  }
}
