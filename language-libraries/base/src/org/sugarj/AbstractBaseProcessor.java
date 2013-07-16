package org.sugarj;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.HybridInterpreter;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.errors.SourceCodeException;
import org.sugarj.common.path.Path;
import org.sugarj.util.Pair;

public abstract class AbstractBaseProcessor implements IBaseProcessor, Serializable {

  private static final long serialVersionUID = -6712835686318143995L;

  protected HybridInterpreter interp;

  public void setInterpreter(HybridInterpreter interp) {
    this.interp = interp;
  }
  
  public HybridInterpreter getInterpreter() {
    return interp;
  }

  public String getRelativeNamespaceSep() {
		String rel = getNamespace();
		if (rel == null || rel.isEmpty())
			return "";
		return rel + Environment.sep;
	}
	
	// Returns true is files were generated or if there were no files to generate
	// Returns false if generation was skipped due to generateFiles being false
	public void compile(
	    Path outFile, 
	    String source, 
	    Path bin,
	    List<Path> path,
			Map<Path, Pair<Path, String>> deferredSourceFilesForSourceFile,
			Map<Path, Integer> generatedFileHashes
			) throws IOException, ClassNotFoundException, SourceCodeException {
	  
	  
    List<Path> outFiles = new ArrayList<Path>();

    for (Pair<Path, String> deferredSource : deferredSourceFilesForSourceFile.values()) {
      String code = deferredSource.b;
      writeToFile(generatedFileHashes, deferredSource.a, code);
      outFiles.add(deferredSource.a);
    }

    if (!source.isEmpty()) {
      writeToFile(generatedFileHashes, outFile, source);
      outFiles.add(outFile);
    }
    
    if (!outFiles.isEmpty()) {
      List<Path> generatedByCompiler = compile(outFiles, bin, path);
      for (Path p : generatedByCompiler)
        generatedFileHashes.put(p, FileCommands.fileHash(p));
    }
 	}

  private void writeToFile(Map<Path, Integer> generatedFileHashes, Path file, String content) throws IOException { 
		FileCommands.writeToFile(file, content);
		generatedFileHashes.put(file, FileCommands.fileHash(file));
	}

  public          String getImportLocalName(IStrategoTerm decl) { return null; }
  public          String getModulePath(IStrategoTerm decl) { return null; }
  public          IStrategoTerm reconstructImport(String modulePath, IStrategoTerm original) { return null; }
	
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