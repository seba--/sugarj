package org.sugarj.driver.sourcefilecontent;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.path.RelativePath;

public class PrologSourceFileContent implements ISourceFileContent {
  

	private static final long serialVersionUID = -1793669825816782903L;
	
	private class PrologModuleImport {
		String importName;
		List<String> importedProductions;
	}
	
	String moduleDecl;
	List<PrologModuleImport> imports = new LinkedList<PrologModuleImport>();
	List<PrologModuleImport> checkedImports = new LinkedList<PrologModuleImport>();
	//List<String> imports = new LinkedList<String>();
	//List<String> checkedImports = new LinkedList<String>();
	boolean importsOptional;
	List<String> bodyDecls = new LinkedList<String>();

	public PrologSourceFileContent() {
	}

	public void setNamespaceDecl(String moduleDecl) {
		this.moduleDecl = moduleDecl;
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

	public String getCode(Set<RelativePath> generatedClasses) throws ClassNotFoundException {
		// TODO: Add reexports!
		List<String> classes = new LinkedList<String>();
		for (RelativePath p : generatedClasses)
			classes.add(FileCommands.dropExtension(p.getRelativePath()).replace(Environment.sep, "."));

		StringBuilder code = new StringBuilder();
		code.append(moduleDecl);
		code.append('\n');

		for (String imp : checkedImports)									// XXX: What does this do?
			code.append(":- use_module(").append(imp).append(").\n");

		for (String imp : imports)
			if (classes.contains(imp))
				code.append(":- use_module( ").append(imp).append(",").append(arg0).append(").\n");
			else if (!importsOptional)
				throw new ClassNotFoundException(imp);

		for (String bodyDecl : bodyDecls)
			code.append(bodyDecl);

		return code.toString();
	}

	public int hashCode() {
		return moduleDecl.hashCode() + imports.hashCode() + bodyDecls.hashCode();
	}

	public boolean equals(Object o) {
		if (!(o instanceof PrologSourceFileContent))
			return false;

		PrologSourceFileContent other = (PrologSourceFileContent) o;
		return other.moduleDecl.equals(moduleDecl) &&
				other.imports.equals(imports) &&
				other.importsOptional == importsOptional &&
				other.bodyDecls.equals(bodyDecls);
	}
}
