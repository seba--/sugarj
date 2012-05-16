package org.sugarj.driver.sourcefilecontent;
// TODO: Think of a better package name
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
  
  // TODO: Better method names for non-java languages
  // XXX: This interface was directly created from JavaSourceFileContent.java
  
/*  public void setNamespaceDecl(String namespaceDecl);
  public void addImport(String imp);
  public void addCheckedImport(String imp);
  public void setOptionalImport(boolean isOptional);
  public void addBodyDecl(String bodyDecl); */
  public String getCode(Set<RelativePath> generatedClasses, HybridInterpreter interp, Path outFile) throws ClassNotFoundException, IOException;
  public int hashCode();
  public boolean equals(Object o);

  
}
