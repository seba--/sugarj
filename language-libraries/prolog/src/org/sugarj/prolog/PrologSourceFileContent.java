package org.sugarj.prolog;

import java.util.LinkedList;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.HybridInterpreter;
import org.sugarj.PrologLib;
import org.sugarj.common.Environment;
import org.sugarj.common.path.Path;
import org.sugarj.languagelib.SourceFileContent;

public class PrologSourceFileContent extends SourceFileContent {
	public class PrologModuleImport {
		String importName;
		IStrategoTerm productionDecl;
	}
	
	private String moduleDecl;
	private List<PrologModuleImport> imports = new LinkedList<PrologModuleImport>();
	private List<PrologModuleImport> checkedImports = new LinkedList<PrologModuleImport>();
	private List<String> bodyDecls = new LinkedList<String>();
	private List<String> reexports = new LinkedList<String>();
	private PrologLib pLib;
	
	public PrologSourceFileContent(PrologLib prologLib) {
	  pLib = prologLib;
	}

	@Override
	public boolean isEmpty() {
		return true;
	}

	public void setModuleDecl(String moduleDecl) {
		this.moduleDecl = moduleDecl;
	}

	public void addImport(PrologModuleImport imp) {
		imports.add(imp);
	}

	public void addCheckedImport(PrologModuleImport imp) {
		checkedImports.add(imp);
	}

	public void addBodyDecl(String bodyDecl) {
		bodyDecls.add(bodyDecl);
	}

	public void addReexport(String reexport) {
		reexports.add(reexport);
	}
	
	public SourceFileContent.Generated getCode(Path outFile) {
	  List<String> requiredPaths = new LinkedList<String>();

		StringBuilder code = new StringBuilder();
		code.append(moduleDecl);
		code.append('\n');
		
		for (String reexport : reexports) {
			code.append(reexport);
			code.append("\n");
		}
		
		for (PrologModuleImport imp : checkedImports)									
			code.append(getImportedModuleString(imp, pLib.getInterpreter())).append("\n");

		for (PrologModuleImport imp : imports) {
		  code.append(getImportedModuleString(imp, pLib.getInterpreter())).append("\n");
		  requiredPaths.add(imp.importName.replace("/", Environment.sep));
		}

		for (String bodyDecl : bodyDecls) {
			code.append(bodyDecl);
			code.append("\n");
		}
			
		return new SourceFileContent.Generated (code.toString(), requiredPaths);
	}
	
	private String getImportedModuleString(PrologModuleImport module, HybridInterpreter interp) {
		IStrategoTerm trm = module.productionDecl;
		String importString = ":- use_module(";
		importString += module.importName;
		if (trm.getSubtermCount() > 1) { 	// :- use_module(foo, bar/1).
			importString += getImportedModulePredicateList(module);
		}
		return importString + ").";
	}

	private String getImportedModulePredicateList(PrologModuleImport module) {
		if (module.productionDecl == null) 
			return "";
		
    return ", " + pLib.prettyPrint(module.productionDecl.getSubterm(1));
	}
	
	public PrologModuleImport getImport(String importName, IStrategoTerm decl) {
		PrologModuleImport imp = new PrologModuleImport();
		imp.importName = importName.substring(importName.indexOf("/") + 1);	// XXX: hacky, remove first directory. Should be replaced by a more robust implementation.
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
		    other.checkedImports.equals(checkedImports) &&
				other.imports.equals(imports) &&
				other.bodyDecls.equals(bodyDecls);
	}

	
}
