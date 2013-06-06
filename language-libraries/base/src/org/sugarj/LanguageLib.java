package org.sugarj;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.HybridInterpreter;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.IErrorLogger;
import org.sugarj.common.StringCommands;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.languagelib.SourceFileContent;
import org.sugarj.util.Pair;

public abstract class LanguageLib implements ILanguageLib, Serializable {

  private static final long serialVersionUID = -6712835686318143995L;

  protected HybridInterpreter interp;

  public void setInterpreter(HybridInterpreter interp) {
    this.interp = interp;
  }
  
  public HybridInterpreter getInterpreter() {
    return interp;
  }

  public String getRelativeNamespaceSep() {
		String rel = getRelativeNamespace();
		if (rel == null || rel.isEmpty())
			return "";
		return rel + Environment.sep;
	}
	
	// Returns true is files were generated or if there were no files to generate
	// Returns false if generation was skipped due to generateFiles being false
	public void compile(
	    Path outFile, 
	    SourceFileContent source, 
	    Path bin,
	    List<Path> path,
			Set<RelativePath> previouslyGeneratedFiles,
			Map<Path, Set<RelativePath>> availableGeneratedFilesForSourceFile,
			Map<Path, Pair<Path, SourceFileContent.Generated>> deferredSourceFilesForSourceFile,
			Map<Path, Integer> generatedFileHashes
			) throws IOException, ClassNotFoundException {
	  Set<RelativePath> generatedFiles = new HashSet<RelativePath>(previouslyGeneratedFiles);
	  for (Set<RelativePath> files: availableGeneratedFilesForSourceFile.values())
      for (RelativePath file : files)
        if (getFactoryForLanguage().getGeneratedFileExtension().equals(FileCommands.getExtension(file)))
          generatedFiles.add(file);

    List<Path> outFiles = new ArrayList<Path>();

    for (Pair<Path, SourceFileContent.Generated> deferredSource : deferredSourceFilesForSourceFile.values()) {
      try { 
        String code = deferredSource.b.code;
        checkRequiredPaths(deferredSource.b.requiredPaths, generatedFiles);
        writeToFile(generatedFileHashes, deferredSource.a, code);
        outFiles.add(deferredSource.a);
      } catch (ClassNotFoundException e) {
        throw new ClassNotFoundException("Unresolved import " + e.getMessage() + " in " + outFile);
      }
    }

    try {
      SourceFileContent.Generated generated = source.getCode(outFile);
      String code = generated.code;
      checkRequiredPaths(generated.requiredPaths, generatedFiles);
      if (!source.isEmpty()) {
        writeToFile(generatedFileHashes, outFile, code);
        outFiles.add(outFile);
      }
    } catch (ClassNotFoundException e) {
      throw new ClassNotFoundException("Unresolved import " + e.getMessage() + " in " + outFile);
    }
    
    if (!outFiles.isEmpty()) {
      List<Path> generatedByCompiler = this.compile(outFiles, bin, path);
      for (Path p : generatedByCompiler)
        generatedFileHashes.put(p, FileCommands.fileHash(p));
    }
    
		for (Path cl : generatedFiles)
			generatedFileHashes.put(cl, FileCommands.fileHash(cl));
	}

	private void checkRequiredPaths(List<String> requiredPaths, Set<RelativePath> generatedFiles) throws ClassNotFoundException {
	  List<String> failed = new LinkedList<String>();
	  for (String requiredPath : requiredPaths) {
	    boolean ok = false;
	    for (RelativePath generatedFile : generatedFiles)
	      if (generatedFile.getRelativePath().equals(requiredPath + "." + getFactoryForLanguage().getGeneratedFileExtension())) {
	        ok = true;
	        break;
	      }
	    if (!ok)
	      failed.add(requiredPath);
	  }
	  
	  if (!failed.isEmpty())
	    throw new ClassNotFoundException(StringCommands.printListSeparated(failed, ", "));
  }

  private void writeToFile(Map<Path, Integer> generatedFileHashes, Path file, String content) throws IOException { 
		FileCommands.writeToFile(file, content);
		generatedFileHashes.put(file, FileCommands.fileHash(file));
	}

  public          String getImportLocalName(IStrategoTerm decl) { return null; }
  public          String getModulePath(IStrategoTerm decl) { return null; }
  public          IStrategoTerm reconstructImport(String modulePath, IStrategoTerm original) { return null; }
	
	protected void setErrorMessage(IStrategoTerm toplevelDecl, String msg, IErrorLogger errorLog) {
	  if (errorLog != null)
	    errorLog.logError(msg);
	  ATermCommands.setErrorMessage(toplevelDecl, msg);
  }

  /**
   * Computes the path of the given transformation application term.
   */
  public String getTransformedModulePath(IStrategoTerm appl) {
    if (ATermCommands.isApplication(appl, "TransApp")) {
      String trans = getTransformedModulePath(appl.getSubterm(0));
      String model = getTransformedModulePath(appl.getSubterm(1));
      return model + "__" + trans.replace('/', '_');
    }
    return getModulePath(appl);
  }
}