package org.sugarj.driver.sourcefilecontent;

import java.util.LinkedList;
import java.util.List;

import org.sugarj.driver.Environment;
import org.sugarj.driver.FileCommands;
import org.sugarj.driver.path.RelativePath;

/**
 * @author seba
 *
 */
public class JavaSourceFileContent implements ISourceFileContent {

  String packageDecl;
  List<String> imports;
  boolean importsOptional;
  List<String> bodyDecls;
  
  public JavaSourceFileContent() {
  }
  
  public void setPackageDecl(String packageDecl) {
    this.packageDecl = packageDecl;
  }
  
  public void addImport(String imp) {
    if (imports == null)
      imports = new LinkedList<String>();
    imports.add(imp);
  }
  
  public void setOptionalImport(boolean isOptional) {
    this.importsOptional = isOptional;
  }
  
  public void addBodyDecl(String bodyDecl) {
    if (bodyDecls == null)
      bodyDecls = new LinkedList<String>();
    bodyDecls.add(bodyDecl);
  }
  
  public String getCode(List<RelativePath> generatedClasses) throws ClassNotFoundException {
    List<String> classes = new LinkedList<String>();
    for (RelativePath p : generatedClasses)
      classes.add(FileCommands.dropExtension(p.getRelativePath()).replace(Environment.sep, "."));
    
    StringBuilder code = new StringBuilder();
    code.append(packageDecl);
    code.append('\n');
    
    for (String imp : imports)
      if (classes.contains(imp))
        code.append("import ").append(imp).append(";\n");
      else if (!importsOptional)
        throw new ClassNotFoundException(imp);
    
    for (String bodyDecl : bodyDecls)
      code.append(bodyDecl);
    
    return code.toString();
  }
}
