package org.sugarj.driver;

import static org.sugarj.driver.Log.log;

import java.io.File;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.eclipse.ant.StrategoJarAntPropertyProvider;
import org.sugarj.driver.path.AbsolutePath;
import org.sugarj.driver.path.Path;
import org.sugarj.driver.path.RelativePath;
import org.sugarj.driver.path.SourceLocation;
import org.sugarj.stdlib.StdLib;
import org.sugarj.util.Renaming;


/**
 * Shared execution environment.
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class Environment implements Serializable {
  
  private static final long serialVersionUID = -8403625415393122607L;

  public static Map<Path, IStrategoTerm> terms = new WeakHashMap<Path, IStrategoTerm>();
  
  public static String sep = "/";
  public static String classpathsep = File.pathSeparator;

  /*
   * read-only/write-only cache flags.
   */
  public static boolean rocache = false;
  public static boolean wocache = false;
  
  
  
  private Path cacheDir = null;
  
  private Path root = new AbsolutePath(".");
  
  public Path bin = new AbsolutePath(".");
  
  
  /* 
   * parse all imports simultaneously, i.e., not one after the other
   */
  private boolean atomicImportParsing = false;
  
  /*
   * don't check resulting sdf and stratego files after splitting
   */
  private boolean noChecking = false;

  private boolean generateJavaFile = false;
  
  
  private Path tmpDir = new AbsolutePath(System.getProperty("java.io.tmpdir"));
  
  private Set<SourceLocation> sourcePath = new HashSet<SourceLocation>();
  private Set<Path> includePath = new HashSet<Path>();
  
  /**
   * List of renamings that need to be applied during compilation.
   */
  private List<Renaming> renamings = new LinkedList<Renaming>();

  
  /**
   * @author Sebastian Erdweg <seba at informatik uni-marburg de>
   */
  public class RelativePathBin extends RelativePath {
    private static final long serialVersionUID = -4418944917032203709L;

    public RelativePathBin(String relativePath) {
      super(relativePath);
    }
    
    @Override
    public Path getBasePath() {
      return bin;
    }
  }
  
  /**
   * @author Sebastian Erdweg <seba at informatik uni-marburg de>
   */
  public class RelativePathCache extends RelativePath {
    private static final long serialVersionUID = -6347244639940662095L;

    public RelativePathCache(String relativePath) {
      super(relativePath);
    }
    
    @Override
    public Path getBasePath() {
      return cacheDir;
    }
  }


  
  
  
  public Environment() {
    includePath.add(bin);
    includePath.add(new AbsolutePath(StdLib.stdLibDir.getPath()));
    includePath.add(new AbsolutePath(new StrategoJarAntPropertyProvider().getAntPropertyValue("")));
  }

  public Path getRoot() {
    return root;
  }

  public void setRoot(Path root) {
    this.root = root;
  }

  public Set<SourceLocation> getSourcePath() {
    return sourcePath;
  }

  public void setSourcePath(Set<SourceLocation> sourcePath) {
    this.sourcePath = sourcePath;
  }

  public Path getBin() {
    return bin;
  }

  public void setBin(Path bin) {
    if (this.bin!=null)
      includePath.remove(this.bin);
    this.bin = bin;
    includePath.add(bin);
  }

  public Path getCacheDir() {
    return cacheDir;
  }

  public void setCacheDir(Path cacheDir) {
    this.cacheDir = cacheDir;
  }

  public boolean isAtomicImportParsing() {
    return atomicImportParsing;
  }

  public void setAtomicImportParsing(boolean atomicImportParsing) {
    this.atomicImportParsing = atomicImportParsing;
  }

  public boolean isNoChecking() {
    return noChecking;
  }

  public void setNoChecking(boolean noChecking) {
    this.noChecking = noChecking;
  }

  public boolean isGenerateJavaFile() {
    return generateJavaFile;
  }

  public void setGenerateJavaFile(boolean generateJavaFile) {
    this.generateJavaFile = generateJavaFile;
  }

  public Path getTmpDir() {
    return tmpDir;
  }

  public void setTmpDir(Path tmpDir) {
    this.tmpDir = tmpDir;
  }

  public Set<Path> getIncludePath() {
    return includePath;
  }

  public void setIncludePath(Set<Path> includePath) {
    this.includePath = includePath;
  }

  public Long getTick() {
    return tick;
  }

  public void setTick(Long tick) {
    this.tick = tick;
  }

  private Long tick;
  
  public void tick() {
    tick = System.currentTimeMillis();
  }
  
  public void tack() {
    tack("");
  }
  
  public void tack(String s) {
    log.log(s + " " + (System.currentTimeMillis() - tick) + "ms");
    tick();
  }

  public List<Renaming> getRenamings() {
    return renamings;
  }
  
  public void setRenamings(List<Renaming> renamings) {
    this.renamings = renamings;
  }

}
