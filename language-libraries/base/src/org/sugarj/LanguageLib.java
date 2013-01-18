package org.sugarj;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
import org.sugarj.common.Log;
import org.sugarj.common.StringCommands;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.languagelib.SourceFileContent;
import org.sugarj.stdlib.StdLib;
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

  public List<File> getDefaultGrammars() {
    return StdLib.stdGrammars();
  }
  
  private transient File libTmpDir;
  protected File ensureFile(String resource) {
    File f = new File(getLibraryDirectory().getPath() + File.separator + resource);

    if (f.exists())
      return f;

    if (libTmpDir == null) {
      try {
        libTmpDir = File.createTempFile(FileCommands.fileName(getLibraryDirectory().getAbsolutePath()), "");
        libTmpDir.delete();
        libTmpDir.mkdir();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    f = new File(libTmpDir.getPath() + "/" + resource);
    f.getParentFile().mkdirs();

    try {
      InputStream in = this.getClass().getClassLoader().getResourceAsStream(resource);
      if (in == null) {
        Log.log.logErr("Could not load resource " + resource, Log.ALWAYS);
        return new File(getLibraryDirectory().getPath() + File.separator + resource);
      }

      FileOutputStream fos = new FileOutputStream(f);
      int len = -1;
      byte[] bs = new byte[256];
      while ((len = in.read(bs)) >= 0)
        fos.write(bs, 0, len);
      fos.close();
      in.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return f;
  }
  
  public          boolean isModelDec(IStrategoTerm decl) { return false; }
	public          boolean isTransformationDec(IStrategoTerm decl) { return false; }
	public          boolean isTransformationImportDec(IStrategoTerm decl) { return false; }
	
	public String getRelativeNamespaceSep() {
		String rel = getRelativeNamespace();
		if (rel == null || rel.isEmpty())
			return "";
		return rel + Environment.sep;
	}
	
	
	public void compile(
	    Path outFile, 
	    SourceFileContent source, 
	    Path bin,
	    List<Path> path,
			Set<RelativePath> previouslyGeneratedFiles,
			Map<Path, Set<RelativePath>> availableGeneratedFilesForSourceFile,
			Map<Path, Pair<Path, SourceFileContent.Generated>> deferredSourceFilesForSourceFile,
			Map<Path, Integer> generatedFileHashes,
			boolean generateFiles
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
        writeToFile(generateFiles, generatedFileHashes, deferredSource.a, code);
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
        writeToFile(generateFiles, generatedFileHashes, outFile, code);
        outFiles.add(outFile);
      }
    } catch (ClassNotFoundException e) {
      throw new ClassNotFoundException("Unresolved import " + e.getMessage() + " in " + outFile);
    }
    
    if (!outFiles.isEmpty())
      this.compile(outFiles, bin, path, generateFiles);
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

  private void writeToFile(boolean generateFiles, Map<Path, Integer> generatedFileHashes, Path file, String content) throws IOException { 
		if (generateFiles) {
			FileCommands.writeToFile(file, content);
			generatedFileHashes.put(file, FileCommands.fileHash(file));
		}
	}

  public          String getImportLocalName(IStrategoTerm decl) { return null; }
  public          boolean isTransformationApplication(IStrategoTerm decl) { return false; }
  public          IStrategoTerm getTransformationApplication(IStrategoTerm decl) { return null; }
  public          String getModulePath(IStrategoTerm decl) { return null; }
  public          IStrategoTerm reconstructImport(String modulePath, IStrategoTerm original) { return null; }
	
	public          String getModelName(IStrategoTerm decl) throws IOException { return null; }
	public          String getTransformationName(IStrategoTerm decl) throws IOException { return null; }
  public          IStrategoTerm getTransformationBody(IStrategoTerm decl) { return null; }
  
	protected void setErrorMessage(IStrategoTerm toplevelDecl, String msg, IErrorLogger errorLog) {
	  errorLog.logError(msg);
	  ATermCommands.setErrorMessage(toplevelDecl, msg);
  }

	public abstract boolean isModuleResolvable(String relModulePath);

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