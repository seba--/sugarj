package org.sugarj.driver.sourcefilecontent;
// TODO: Think of a better package name
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.path.RelativePath;

/**
 * 
 * @author seba
 */
public interface ISourceFileContent extends Serializable {
  
  // TODO: Better method names for non-java languages
  // XXX: This interface was directly created from JavaSourceFileContent.java
  
  public void setPackageDecl(String packageDecl);
  public void addImport(String imp);
  public void addCheckedImport(String imp);
  public void setOptionalImport(boolean isOptional);
  public void addBodyDecl(String bodyDecl);
  public String getCode(Set<RelativePath> generatedClasses) throws ClassNotFoundException;
  public int hashCode();
  public boolean equals(Object o);

  
}
