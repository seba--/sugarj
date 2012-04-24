package org.sugarj;

import java.io.IOException;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.HybridInterpreter;
import org.sugarj.common.Environment;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.RelativeSourceLocationPath;
import org.sugarj.driver.sourcefilecontent.ISourceFileContent;

public abstract class LanguageDriver {
  // TODO: Integrate into languagelib	
  public abstract void init();

  public abstract String getSourcecodeExtension();
  
  
  public abstract ISourceFileContent getSource();
  public abstract Path getOutFile();
  public abstract Set<RelativePath> getCompiledFiles();	// XXX: was: getGeneratedJavaClasses -- is getCompiledFiles a reasonably good name? Probably change to getGeneratedBinFiles?
  
  
  public abstract boolean isLanguageSpecificDec(IStrategoTerm decl);
  public abstract boolean isSugarDec(IStrategoTerm decl);
  public abstract boolean isEditorService(IStrategoTerm decl);
  public abstract boolean isImport(IStrategoTerm decl);
  public abstract boolean isPlain(IStrategoTerm decl); // XXX: Decide what to do with "Plain"--leave in the language or create a new "Plain" language

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

  
  // think of a good name
  public abstract String extractImportedModuleName(IStrategoTerm toplevelDecl, HybridInterpreter interp) throws IOException;


  public abstract void setupSourceFile(RelativePath sourceFile, Environment environment);
  public abstract void checkSourceOutFile(Environment environment, IResult driverResult);


  public abstract String getNamespace();
  public abstract String getRelNamespaceSep();

  public abstract void checkNamespace(IStrategoTerm decl, RelativeSourceLocationPath sourceFile, IResult driverResult);
  public abstract void processNamespaceDec(IStrategoTerm toplevelDecl, Environment environment, HybridInterpreter interp, IResult driverResult, String packageName, RelativeSourceLocationPath sourceFile) throws IOException;




  
}

