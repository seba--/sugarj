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
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.IErrorLogger;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.RelativeSourceLocationPath;
import org.sugarj.driver.sourcefilecontent.ISourceFileContent;
import org.sugarj.stdlib.StdLib;


public abstract class LanguageLib implements Serializable {
	
	public final static int PUBLIC_SUGAR = 1;
	public final static int PRIVATE_SUGAR = 2;

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
	
	protected File ensureFile(String resource) {
		File f = new File(getLibraryDirectory().getPath() + File.separator + resource);
		
		System.out.println("javalib ensure file: " + f);
		
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
		System.out.println("f does not exist, making temp file " + f);
		f.getParentFile().mkdirs();

		try {
			InputStream in = LanguageLib.class.getClassLoader().getResourceAsStream(resource);
			if (in == null)
				return  new File(getLibraryDirectory().getPath() + File.separator + resource);

			FileOutputStream fos = new FileOutputStream(f);
			byte[] bs = new byte[256];
			while (in.read(bs) >= 0)
				fos.write(bs);
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
	public abstract Set<RelativePath> getGeneratedFiles();	// XXX: was: getGeneratedJavaClasses -- is getCompiledFiles a reasonably good name? Probably change to getGeneratedBinFiles?
	  
	
	public abstract boolean isNamespaceDec(IStrategoTerm decl);
	public abstract boolean isLanguageSpecificDec(IStrategoTerm decl);
	public abstract boolean isSugarDec(IStrategoTerm decl);
	public abstract boolean isEditorServiceDec(IStrategoTerm decl);
	public abstract boolean isImportDec(IStrategoTerm decl);
	public abstract boolean isPlainDec(IStrategoTerm decl); // XXX: Decide what to do with "Plain"--leave in the language or create a new "Plain" language
	
	public abstract void processLanguageSpecific(IStrategoTerm toplevelDecl,
	                                              Environment environment, 
	                                              HybridInterpreter interp) throws IOException;
	  
	/**
	 * Pretty prints the content of an AST in some file.
	 * 
	 * @param aterm the name of a file which contains an aterm which encodes an AST
	 * @throws IOException 
	 */
	public abstract String prettyPrint(IStrategoTerm term, HybridInterpreter interp) throws IOException;
	
	  
	
	
	public abstract void setupSourceFile(RelativePath sourceFile, Environment environment);
//	public abstract void checkSourceOutFile(Environment environment, RelativeSourceLocationPath sourceFile);
	
	

	public abstract String getRelativeNamespace();
	
	
//	public abstract void checkNamespace(IStrategoTerm decl, RelativeSourceLocationPath sourceFile, IErrorLogger errorLog);
	public abstract void processNamespaceDec(IStrategoTerm toplevelDecl, Environment environment, HybridInterpreter interp, IErrorLogger errorLog, RelativeSourceLocationPath sourceFile, RelativeSourceLocationPath sourceFileFromResult) throws IOException;

	public abstract LanguageLibFactory getFactoryForLanguage();
	
	public abstract String getImportedModulePath(IStrategoTerm toplevelDecl, HybridInterpreter interp) throws IOException;
	
	
	// from Result
	public void compile(Path outFile, ISourceFileContent source, Path bin, List<Path> path,
			Set<RelativePath> generatedBinFiles,
			Map<Path, Set<RelativePath>> availableGeneratedFilesForSourceFile,
			Map<Path, Map<Path, ISourceFileContent>> deferredSourceFilesForSourceFile,
			Map<Path, Integer> generatedFileHashes,
			HybridInterpreter interp,
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

		writeToFile(generateFiles, generatedFileHashes, outFile, source.getCode(generatedClasses, interp, outFile));
		
		this.compile(javaOutFiles, bin, path, generatedClasses, generatedFileHashes, interp, generateFiles);
	}

	private void writeToFile(boolean generateFiles, Map<Path, Integer> generatedFileHashes, Path file, String content) throws IOException { 
		if (generateFiles) {
			FileCommands.writeToFile(file, content);
			generatedFileHashes.put(file, FileCommands.fileHash(file));
		}
	}

	public abstract void compile(List<Path> outFiles, Path bin, List<Path> path, Set<? extends Path> generatedFiles, Map<Path, Integer> generatedFileHashes, HybridInterpreter interp, boolean generateFiles) throws IOException;

	
	public abstract void addImportModule(IStrategoTerm toplevelDecl, HybridInterpreter interp) throws IOException;
	public abstract void addCheckedImportModule(IStrategoTerm toplevelDecl, HybridInterpreter interp) throws IOException;
	
	
	
	public abstract String getSugarName(IStrategoTerm decl, HybridInterpreter interp) throws IOException;
	public abstract int getSugarAccessibility(IStrategoTerm decl);
	public abstract IStrategoTerm getSugarBody(IStrategoTerm decl);
	

	
	
}