package org.sugarj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.shared.BadTokenException;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.RelativeSourceLocationPath;
import org.sugarj.driver.sourcefilecontent.ISourceFileContent;
import org.sugarj.util.AppendableObjectOutputStream;

public interface IResult {
/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
  
  /**
   * Path and hash of the disk-stored version of this result.
   * If the result was not stored yet, both variables are null.
   */

  	  
  
  void addFileDependency(Path file) throws IOException;
  void addDependency(Path depFile, Environment env) throws IOException;
  void addDependency(IResult result, Environment env) throws IOException;
  void setGenerationLog(Path file);
  Path getGenerationLog();
  void generateFile(Path file, String content) throws IOException;
  void writeToFile(Path file, String content) throws IOException;
  void appendToFile(Path file, String content) throws IOException;
  void addEditorService(IStrategoTerm service);
  public Set<IStrategoTerm> getEditorServices();
  public boolean hasSourceFileChanged(Path inputFile) throws IOException;
  public boolean isUpToDateShallow(Path inputFile, Environment env) throws IOException;  
  public boolean isUpToDate(Path inputFile, Environment env) throws IOException;
  public boolean isUpToDateShallow(int inputHash, Environment env) throws IOException;
  public boolean isUpToDate(int inputHash, Environment env) throws IOException;	  
  void logError(String error);
  public List<String> getCollectedErrors();
  void logParseError(BadTokenException e);
  public Set<BadTokenException> getParseErrors();
  public void setSugaredSyntaxTree(IStrategoTerm sugaredSyntaxTree);
  public IStrategoTerm getSugaredSyntaxTree();
  public Collection<Path> getFileDependencies(Environment env) throws IOException;

  void delegateCompilation(Path delegate, Path compileFile, ISourceFileContent fileContent, Set<RelativePath> generatedFiles);	  
  boolean hasDelegatedCompilation(Path compileFile);
  
  void registerParseTable(Path tbl);
  
  public Path getParseTable();
  
  void registerEditorDesugarings(Path jarfile) throws IOException;
  
  public Path getDesugaringsFile();
  
  public void writeDependencyFile(Path dep) throws IOException;
  public void setPersistentPath(Path dep) throws IOException;
  void setSourceFile(RelativeSourceLocationPath sourceFile, int sourceFileHash);
  public RelativeSourceLocationPath getSourceFile();
  public boolean hasFailed();
  public void setFailed(boolean hasFailed);
  

  Map<Path, Map<Path, Set<RelativePath>>> getAvailableGeneratedFiles();
  Map<Path, Map<Path, Map<Path, ISourceFileContent>>> getDeferredSourceFiles();
  Map<Path, Integer> getGeneratedFileHashes();
  public boolean getGenerateFiles();
}
