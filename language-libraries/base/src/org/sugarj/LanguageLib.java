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
import org.sugarj.languagelib.SourceFileContent;
import org.sugarj.stdlib.StdLib;

public abstract class LanguageLib implements ILanguageLib, Serializable {

  private static final long serialVersionUID = -6712835686318143995L;

  protected HybridInterpreter interp;

  public void setInterpreter(HybridInterpreter interp) {
    this.interp = interp;
  }
  
  public HybridInterpreter getInterpreter() {
    return interp;
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
  
  protected List<File> getDefaultGrammars() {
    return Arrays.asList(new File[] { StdLib.sdfDef, StdLib.strategoDef, StdLib.editorServicesDef, StdLib.plainDef, StdLib.commonDef });
  }

  public String getRelativeNamespaceSep() {
    String rel = getRelativeNamespace();
    if (rel == null || rel.isEmpty())
      return "";
    return rel + Environment.sep;
  }

  public void compileAll(Path outFile, SourceFileContent source, Path bin, List<Path> path, Set<RelativePath> generatedBinFiles, Map<Path, Set<RelativePath>> availableGeneratedFilesForSourceFile, Map<Path, Map<Path, SourceFileContent>> deferredSourceFilesForSourceFile, Map<Path, Integer> generatedFileHashes, boolean generateFiles) throws IOException, ClassNotFoundException {

    Map<Path, Set<RelativePath>> generatedFiles = availableGeneratedFilesForSourceFile; // result.getAvailableGeneratedFiles().get(result.getSourceFile());
    Set<RelativePath> generatedClasses = new HashSet<RelativePath>(generatedBinFiles);

    if (generatedFiles != null) {
      for (Set<RelativePath> files : generatedFiles.values())
        for (RelativePath file : files)
          if ("class".equals(FileCommands.getExtension(file)))
            generatedClasses.add(file);
    }

    Map<Path, Map<Path, SourceFileContent>> sourceFiles = deferredSourceFilesForSourceFile; // result.getDeferredSourceFiles().get(result.getSourceFile());
    List<Path> javaOutFiles = new ArrayList<Path>();
    javaOutFiles.add(outFile);

    if (sourceFiles != null)
      for (Entry<Path, Map<Path, SourceFileContent>> sources : sourceFiles.entrySet())
        for (Entry<Path, SourceFileContent> currentSource : sources.getValue().entrySet())
          if (currentSource.getValue() instanceof SourceFileContent) {
            SourceFileContent otherSource = (SourceFileContent) currentSource.getValue();
            try {
              writeToFile(generateFiles, generatedFileHashes, currentSource.getKey(), otherSource.getCode(generatedClasses, interp, currentSource.getKey()));

            } catch (ClassNotFoundException e) {
              throw new ClassNotFoundException("Unresolved import " + e.getMessage() + " in " + currentSource.getKey());
            }
          }

    if (source.isEmpty()) // if empty flag ist set, do not compile source
      return;

    writeToFile(generateFiles, generatedFileHashes, outFile, source.getCode(generatedClasses, interp, outFile));

    compile(javaOutFiles, bin, path, generateFiles);
    for (Path cl : generatedClasses)
      generatedFileHashes.put(cl, FileCommands.fileHash(cl));

  }

  private void writeToFile(boolean generateFiles, Map<Path, Integer> generatedFileHashes, Path file, String content) throws IOException {
    if (generateFiles) {
      FileCommands.writeToFile(file, content);
      generatedFileHashes.put(file, FileCommands.fileHash(file));
    }
  }

  protected void setErrorMessage(IStrategoTerm toplevelDecl, String msg, IErrorLogger errorLog) {
    errorLog.logError(msg);
    ATermCommands.setErrorMessage(toplevelDecl, msg);
  }
}