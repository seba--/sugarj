package org.sugarj.driver.sourcefilecontent;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.HybridInterpreter;
import org.sugarj.PrologLib;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.path.RelativePath;

public class PrologSourceFileContent implements ISourceFileContent {
  

	private static final long serialVersionUID = -1793669825816782903L;
	
	public class PrologModuleImport {
		String importName;
		IStrategoTerm productionDecl;
	}
	
	String moduleDecl;
	List<PrologModuleImport> imports = new LinkedList<PrologModuleImport>();
	List<PrologModuleImport> checkedImports = new LinkedList<PrologModuleImport>();
	//List<String> imports = new LinkedList<String>();
	//List<String> checkedImports = new LinkedList<String>();
	boolean importsOptional;
	List<String> bodyDecls = new LinkedList<String>();
	PrologLib pLib;
	

	public PrologSourceFileContent(PrologLib prologLib) {
		pLib = prologLib;
	}

	public void setNamespaceDecl(String moduleDecl) {
		this.moduleDecl = moduleDecl;
	}

	public void addImport(PrologModuleImport imp) {
		imports.add(imp);
	}

	public void addCheckedImport(PrologModuleImport imp) {
		checkedImports.add(imp);
	}

	public void setOptionalImport(boolean isOptional) {
		this.importsOptional = isOptional;
	}

	public void addBodyDecl(String bodyDecl) {
		bodyDecls.add(bodyDecl);
	}

	public String getCode(Set<RelativePath> generatedFiles, HybridInterpreter interp) throws ClassNotFoundException, IOException {
		// TODO: Add reexports!
		List<String> files = new LinkedList<String>();
		for (RelativePath p : generatedFiles)
			files.add(FileCommands.dropExtension(p.getRelativePath()).replace(Environment.sep, "/"));

		StringBuilder code = new StringBuilder();
		code.append(moduleDecl);
		code.append('\n');

		for (PrologModuleImport imp : checkedImports)									// XXX: What does this do?
			//code.append(":- use_module(").append(imp.importName).append(getImportedModulePredicateList(imp, interp)).append(").\n");
			code.append(getImportedModuleString(imp, interp)).append("\n");

		for (PrologModuleImport imp : imports)
			if (files.contains(imp.importName))
				//code.append(":- use_module(").append(imp).append(",").append(arg0).append(").\n");
				//code.append(":- use_module(").append(imp.importName).append(getImportedModulePredicateList(imp, interp)).append(").\n");
				code.append(getImportedModuleString(imp, interp)).append("\n");
			else if (!importsOptional)
				throw new ClassNotFoundException(imp.importName);

		for (String bodyDecl : bodyDecls) {
			code.append(bodyDecl);
			code.append("\n");
		}
			
		return code.toString();
	}
	
	private String getImportedModuleString(PrologModuleImport module, HybridInterpreter interp) throws IOException {
		IStrategoTerm trm = module.productionDecl;
		String importString = ":- use_module(";
		importString += module.importName;
		int cnt = trm.getSubtermCount();
		if (trm.getSubtermCount() > 1) { 	// :- use_module(foo, bar/1).
			importString += getImportedModulePredicateList(module, interp);
		}
		return importString + ").";
	}

	private String getImportedModulePredicateList(PrologModuleImport module, HybridInterpreter interp) throws IOException {
		if (module.productionDecl == null) 
			return "";
		
		String code = ", " + pLib.prettyPrint(module.productionDecl.getSubterm(1), interp);
		
		// XXX: return something here (pretty-printed string!)
		return code;
	}
	
	public PrologModuleImport getImport(String importName, IStrategoTerm decl) {
		PrologModuleImport imp = new PrologModuleImport();
		imp.importName = importName;
		imp.productionDecl = decl;
		
		return imp;
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
