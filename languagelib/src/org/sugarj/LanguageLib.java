package org.sugarj;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.HybridInterpreter;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.IErrorLogger;
import org.sugarj.common.Log;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.RelativeSourceLocationPath;
import org.sugarj.languagelib.ISourceFileContent;
import org.sugarj.stdlib.StdLib;


public abstract class LanguageLib implements Serializable {
	
	public final static int PUBLIC_SUGAR = 1;
	public final static int PRIVATE_SUGAR = 2;
	
	protected HybridInterpreter interp;
	public void setInterpreter(HybridInterpreter interp) {
		this.interp = interp;
	}
	
	public HybridInterpreter getInterpreter() {
		return interp;
	}
	
  private static final long serialVersionUID = -6712835686318143995L;

  public List<File> getGrammars() {
		return Arrays.asList(new File[]{StdLib.sdfDef, StdLib.strategoDef, StdLib.editorServicesDef, StdLib.plainDef, StdLib.commonDef});
	}
	
	public abstract File getInitGrammar();   
	public abstract String getInitGrammarModule();
	public abstract File getInitTrans();
	public abstract String getInitTransModule();
	public abstract File getInitEditor();
	public abstract String getInitEditorModule();
	
	public abstract File getLibraryDirectory();
	
	private transient File libTmpDir;
	
	public abstract String getLanguageName();
	
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
			  Log.log.logErr("Could not load resource " + resource);
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
	
	
	public abstract String getGeneratedFileExtension();
	public abstract String getSugarFileExtension();
	
	
	// ----------------
	// stuff from LanguageDriver here:

	public abstract ISourceFileContent getSource();
	public abstract Path getOutFile();
	public abstract Set<RelativePath> getGeneratedFiles();	
	
	public abstract boolean isNamespaceDec(IStrategoTerm decl);
	public abstract boolean isLanguageSpecificDec(IStrategoTerm decl);
	public abstract boolean isSugarDec(IStrategoTerm decl);
	public abstract boolean isEditorServiceDec(IStrategoTerm decl);
	public abstract boolean isImportDec(IStrategoTerm decl);
	public abstract boolean isPlainDec(IStrategoTerm decl); // XXX: Decide what to do with "Plain"--leave in the language or create a new "Plain" language
	
	public abstract void processLanguageSpecific(IStrategoTerm toplevelDecl,
	                                              Environment environment) throws IOException;
	  
	/**
	 * Pretty prints the content of an AST in some file.
	 * 
	 * @param aterm the name of a file which contains an aterm which encodes an AST
	 * @throws IOException 
	 */
	public abstract String prettyPrint(IStrategoTerm term) throws IOException;
	
	  
	
	
	public abstract void setupSourceFile(RelativePath sourceFile, Environment environment);
//	public abstract void checkSourceOutFile(Environment environment, RelativeSourceLocationPath sourceFile);
	
	

	public abstract String getRelativeNamespace();
	
	public String getRelativeNamespaceSep() {
		String rel = getRelativeNamespace();
		if (rel == null || rel.isEmpty())
			return rel;
		return rel + Environment.sep;
	}
	
	
//	public abstract void checkNamespace(IStrategoTerm decl, RelativeSourceLocationPath sourceFile, IErrorLogger errorLog);
	public abstract void processNamespaceDec(IStrategoTerm toplevelDecl, Environment environment, IErrorLogger errorLog, RelativeSourceLocationPath sourceFile, RelativeSourceLocationPath sourceFileFromResult) throws IOException;

	public abstract LanguageLibFactory getFactoryForLanguage();
	
	public abstract String getImportedModulePath(IStrategoTerm toplevelDecl) throws IOException;
	
	
	// from Result
	public void compile(Path outFile, ISourceFileContent source, Path bin, List<Path> path,
			Set<RelativePath> generatedBinFiles,
			Map<Path, Set<RelativePath>> availableGeneratedFilesForSourceFile,
			Map<Path, Map<Path, ISourceFileContent>> deferredSourceFilesForSourceFile,
			Map<Path, Integer> generatedFileHashes,
			boolean generateFiles
			) throws IOException, ClassNotFoundException {

		
		Map<Path, Set<RelativePath>> generatedFiles = availableGeneratedFilesForSourceFile; //result.getAvailableGeneratedFiles().get(result.getSourceFile());
		Set<RelativePath> generatedClasses = new HashSet<RelativePath>(generatedBinFiles);

		if (generatedFiles != null) {
			for (Set<RelativePath> files: generatedFiles.values())
				for (RelativePath file : files)
					if ("class".equals(FileCommands.getExtension(file)))
						generatedClasses.add(file);
		}

		Map<Path, Map<Path, ISourceFileContent>> sourceFiles = deferredSourceFilesForSourceFile; //result.getDeferredSourceFiles().get(result.getSourceFile());
		List<Path> javaOutFiles = new ArrayList<Path>();
		javaOutFiles.add(outFile);

		if (sourceFiles != null)
			for (Entry<Path, Map<Path, ISourceFileContent>> sources : sourceFiles.entrySet())
				for (Entry<Path, ISourceFileContent> currentSource : sources.getValue().entrySet())
					if (currentSource.getValue() instanceof ISourceFileContent) {
						ISourceFileContent otherSource = (ISourceFileContent) currentSource.getValue();
						try {
							//result.writeToFile(source.getKey(), otherJavaSource.getCode(generatedClasses));
							writeToFile(generateFiles, generatedFileHashes, currentSource.getKey(), otherSource.getCode(generatedClasses, interp, currentSource.getKey()));


						} catch (ClassNotFoundException e) {
							throw new ClassNotFoundException("Unresolved import " + e.getMessage() + " in " + currentSource.getKey());
						}
					}

		
		if (source.isEmpty())	// if empty flag ist set, do not compile source
			return;
		
		writeToFile(generateFiles, generatedFileHashes, outFile, source.getCode(generatedClasses, interp, outFile));
		
		this.compile(javaOutFiles, bin, path, generateFiles);
		for (Path cl : generatedClasses)
			generatedFileHashes.put(cl, FileCommands.fileHash(cl));

	}

	private void writeToFile(boolean generateFiles, Map<Path, Integer> generatedFileHashes, Path file, String content) throws IOException { 
		if (generateFiles) {
			FileCommands.writeToFile(file, content);
			generatedFileHashes.put(file, FileCommands.fileHash(file));
		}
	}

	protected abstract void compile(List<Path> outFiles, Path bin, List<Path> path, boolean generateFiles) throws IOException;

	
	public abstract void addImportModule(IStrategoTerm toplevelDecl, boolean checked) throws IOException;
	
	
	public abstract String getSugarName(IStrategoTerm decl) throws IOException;
	public abstract int getSugarAccessibility(IStrategoTerm decl);
	public abstract IStrategoTerm getSugarBody(IStrategoTerm decl);
	
	public abstract String getEditorName(IStrategoTerm decl) throws IOException;
	public abstract int getEditorAccessibility(IStrategoTerm decl);
	public abstract IStrategoTerm getEditorServices(IStrategoTerm decl);

	protected void setErrorMessage(IStrategoTerm toplevelDecl, String msg, IErrorLogger errorLog) {
	  errorLog.logError(msg);
	  ATermCommands.setErrorMessage(toplevelDecl, msg);
    }

	public abstract boolean isModuleResolvable(String relModulePath);
}