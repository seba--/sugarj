package org.sugarj.driver.sourcefilecontent;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.strategoxt.HybridInterpreter;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.path.RelativePath;

/**
 * @author seba
 *
 */
public class JavaSourceFileContent implements ISourceFileContent {
  private static final long serialVersionUID = -3684457648615950708L;
  
  String packageDecl;
  List<String> imports = new LinkedList<String>();
  List<String> checkedImports = new LinkedList<String>();
  boolean importsOptional;
  List<String> bodyDecls = new LinkedList<String>();
  
  public JavaSourceFileContent() {
  }
  
  public void setNamespaceDecl(String packageDecl) {
    this.packageDecl = packageDecl;
  }
  
  public void addImport(String imp) {
    imports.add(imp);
  }
  
  public void addCheckedImport(String imp) {
    checkedImports.add(imp);
  }
  
  public void setOptionalImport(boolean isOptional) {
    this.importsOptional = isOptional;
  }
  
  public void addBodyDecl(String bodyDecl) {
    bodyDecls.add(bodyDecl);
  }
  
  public String getCode(Set<RelativePath> generatedClasses, HybridInterpreter interp) throws ClassNotFoundException {
    List<String> classes = new LinkedList<String>();
    for (RelativePath p : generatedClasses)
      classes.add(FileCommands.dropExtension(p.getRelativePath()).replace(Environment.sep, "."));
    
    StringBuilder code = new StringBuilder();
    code.append(packageDecl);
    code.append('\n');
    
    for (String imp : checkedImports)
      code.append("import ").append(imp).append(";\n");
    
    for (String imp : imports)
      if (classes.contains(imp))
        code.append("import ").append(imp).append(";\n");
      else if (!importsOptional)
        throw new ClassNotFoundException(imp);
    
    for (String bodyDecl : bodyDecls)
      code.append(bodyDecl);
    
    return code.toString();
  }
  
  public int hashCode() {
    return packageDecl.hashCode() + imports.hashCode() + bodyDecls.hashCode();
  }
  
  public boolean equals(Object o) {
    if (!(o instanceof JavaSourceFileContent))
      return false;
    
    JavaSourceFileContent other = (JavaSourceFileContent) o;
    return other.packageDecl.equals(packageDecl) &&
           other.imports.equals(imports) &&
           other.importsOptional == importsOptional &&
           other.bodyDecls.equals(bodyDecls);
  }
}
