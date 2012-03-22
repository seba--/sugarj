package org.sugarj;

import java.io.File;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.driver.path.Path;
import org.sugarj.driver.path.RelativePath;
import org.sugarj.driver.path.SourceLocation;

public interface IEnvironment extends Serializable {
  
  public static Map<Path, IStrategoTerm> terms = new WeakHashMap<Path, IStrategoTerm>();
  
  public static String sep = "/";
  public static String classpathsep = File.pathSeparator;
  
  /*
   * read-only/write-only cache flags.
   */
  public static boolean rocache = false;
  public static boolean wocache = false;

  

  public RelativePath createCachePath(String relativePath);
  public RelativePath createBinPath(String relativePath);
  
  
  public Path getRoot();
  public void setRoot(Path root);
  public Set<SourceLocation> getSourcePath();
  public void setSourcePath(Set<SourceLocation> sourcePath);
  public Path getBin();
  public void setBin(Path bin);
  public Path getCacheDir();
  public void setCacheDir(Path cacheDir);
  public boolean isAtomicImportParsing();
  public void setAtomicImportParsing(boolean atomicImportParsing);
  public boolean isNoChecking();
  public void setNoChecking(boolean noChecking);
  public boolean isGenerateJavaFile();
  public void setGenerateJavaFile(boolean generateJavaFile);
  public Path getTmpDir();
  public void setTmpDir(Path tmpDir);
  public Set<Path> getIncludePath();
  public void setIncludePath(Set<Path> includePath);
  public Long getTick();
  public void setTick(Long tick);
  public void tick();
  public void tack();
  public void tack(String s);

  
}
