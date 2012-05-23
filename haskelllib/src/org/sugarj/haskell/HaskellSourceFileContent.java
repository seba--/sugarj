package org.sugarj.haskell;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.strategoxt.HybridInterpreter;
import org.sugarj.common.FileCommands;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.driver.sourcefilecontent.ISourceFileContent;
import org.sugarj.driver.sourcefilecontent.SourceImport;

public class HaskellSourceFileContent implements ISourceFileContent {

  private static final long serialVersionUID = -1793669825816782903L;

  private String moduleDecl;
  private List<SourceImport> imports = new LinkedList<SourceImport>();
  private List<SourceImport> checkedImports = new LinkedList<SourceImport>();
  private boolean importsOptional = false;
  private List<String> bodyDecls = new LinkedList<String>();
 
  @Override
  public boolean isEmpty() {
    return bodyDecls.isEmpty();
  }
  
  public HaskellSourceFileContent() {
  }

  public void setNamespaceDecl(String moduleDecl) {
    this.moduleDecl = moduleDecl;
  }

  public void addImport(SourceImport imp) {
    imports.add(imp);
  }

  public void addCheckedImport(SourceImport imp) {
    checkedImports.add(imp);
  }

  public void setOptionalImport(boolean isOptional) {
    this.importsOptional = isOptional;
  }

  public void addBodyDecl(String bodyDecl) {
    bodyDecls.add(bodyDecl);
  }

  public String getCode(Set<RelativePath> generatedFiles, HybridInterpreter interp, Path outFile) throws ClassNotFoundException, IOException {
    List<String> modules = new LinkedList<String>();
    for (RelativePath p : generatedFiles)
      modules.add(FileCommands.dropExtension(p.getRelativePath()));
    
    StringBuilder code = new StringBuilder();
    code.append(moduleDecl);
    code.append('\n');

    for (SourceImport imp : checkedImports)
      code.append(imp.getPrettyPrint()).append("\n");

    for (SourceImport imp : imports)
      if (modules.contains(imp.getPath()))
        code.append(imp.getPrettyPrint()).append("\n");
      else if (!importsOptional)
        throw new ClassNotFoundException(imp.getPath());

    for (String bodyDecl : bodyDecls)
      code.append(bodyDecl).append("\n");

    return code.toString();
  }

  public int hashCode() {
    return moduleDecl.hashCode() + checkedImports.hashCode() + imports.hashCode() + bodyDecls.hashCode();
  }

  public boolean equals(Object o) {
    if (!(o instanceof HaskellSourceFileContent))
      return false;

    HaskellSourceFileContent other = (HaskellSourceFileContent) o;
    return other.moduleDecl.equals(moduleDecl) 
        && other.checkedImports.equals(checkedImports)
        && other.imports.equals(imports)
        && other.importsOptional == importsOptional
        && other.bodyDecls.equals(bodyDecls);
  }

}
