package org.sugarj.languagelib;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

import org.strategoxt.HybridInterpreter;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.Path;


/**
 * 
 * @author seba
 */
public abstract class SourceFileContent implements Serializable {

  private static final long serialVersionUID = -2315920008188144171L;

  public abstract String getCode(Set<RelativePath> generatedClasses, HybridInterpreter interp, Path outFile) throws ClassNotFoundException, IOException;
  public abstract int hashCode();
  public abstract boolean equals(Object o);
  public abstract boolean isEmpty();
  
  public static Map<Path, Map<Path, Map<Path, SourceFileContent>>> readSourceFileContents(ObjectInputStream ois) throws ClassNotFoundException, IOException {
    return (Map<Path, Map<Path, Map<Path, SourceFileContent>>>) ois.readObject();
  }
}
