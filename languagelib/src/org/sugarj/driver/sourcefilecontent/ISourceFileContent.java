package org.sugarj.driver.sourcefilecontent;
import java.io.IOException;
import java.io.Serializable;
import java.util.Set;

import org.strategoxt.HybridInterpreter;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.Path;


/**
 * 
 * @author seba
 */
public interface ISourceFileContent extends Serializable {
  
  public String getCode(Set<RelativePath> generatedClasses, HybridInterpreter interp, Path outFile) throws ClassNotFoundException, IOException;
  public int hashCode();
  public boolean equals(Object o);
  public boolean isEmpty();
  
}
