package org.sugarj.languagelib;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.sugarj.common.path.Path;


/**
 * 
 * @author seba
 */
public abstract class SourceFileContent {

  public static class Generated implements Serializable {
    private static final long serialVersionUID = 4825873289508089350L;
    /**
     * The generated code.
     */
    public final String code;
    /**
     * The paths required during generation that have not been checked yet.
     */
    public final List<String> requiredPaths;
    public Generated(String code, List<String> requiredPaths) {
      this.code = code;
      this.requiredPaths = requiredPaths;
    }
  }
  
  /**
   * @return resulting code, required paths without file extensions
   */
  public abstract Generated getCode(Path outFile);
  public abstract int hashCode();
  public abstract boolean equals(Object o);
  public abstract boolean isEmpty();
  
  public static Map<Path, Map<Path, Map<Path, SourceFileContent>>> readSourceFileContents(ObjectInputStream ois) throws ClassNotFoundException, IOException {
    return (Map<Path, Map<Path, Map<Path, SourceFileContent>>>) ois.readObject();
  }
}
