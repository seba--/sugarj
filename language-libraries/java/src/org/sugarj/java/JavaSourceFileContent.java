package org.sugarj.java;

import java.util.LinkedList;
import java.util.List;

import org.sugarj.common.Environment;
import org.sugarj.common.path.Path;
import org.sugarj.languagelib.SourceFileContent;

/**
 * @author seba
 * 
 */
public class JavaSourceFileContent extends SourceFileContent {
  String packageDecl = "";
  List<String> imports = new LinkedList<String>();
  List<String> checkedImports = new LinkedList<String>();
  List<String> bodyDecls = new LinkedList<String>();

  public JavaSourceFileContent() {
  }

  @Override
  public boolean isEmpty() {
    return bodyDecls.isEmpty();
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

  public void addBodyDecl(String bodyDecl) {
    bodyDecls.add(bodyDecl);
  }

  public SourceFileContent.Generated getCode(Path outFile) {
    List<String> requiredPaths = new LinkedList<String>();

    StringBuilder code = new StringBuilder();
    code.append(packageDecl);
    code.append('\n');

    for (String imp : checkedImports)
      code.append("import ").append(imp).append(";\n");

    for (String imp : imports) {
      code.append("import ").append(imp).append(";\n");
      requiredPaths.add(imp.replace(".", Environment.sep));
    }

    for (String bodyDecl : bodyDecls)
      code.append(bodyDecl);

    return new SourceFileContent.Generated(code.toString(), requiredPaths);
  }

  public int hashCode() {
    return packageDecl.hashCode() + checkedImports.hashCode() + imports.hashCode() + bodyDecls.hashCode();
  }

  public boolean equals(Object o) {
    if (!(o instanceof JavaSourceFileContent))
      return false;

    JavaSourceFileContent other = (JavaSourceFileContent) o;
    return other.packageDecl.equals(packageDecl) && other.checkedImports.equals(checkedImports) && other.imports.equals(imports) && other.bodyDecls.equals(bodyDecls);
  }
}
