package org.sugarj;

import java.io.IOException;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.HybridInterpreter;
import org.sugarj.common.Environment;
import org.sugarj.driver.sourcefilecontent.ISourceFileContent;

public abstract class LanguageDriver {
  // TODO: Integrate into languagelib	
  public abstract String getSourcecodeExtension();
  
  
  public abstract ISourceFileContent getSource();

  
  
  public abstract boolean isLanguageSpecificDec(IStrategoTerm decl);
  public abstract boolean isSugarDec(IStrategoTerm decl);
  public abstract boolean isEditorService(IStrategoTerm decl);
  public abstract boolean isImport(IStrategoTerm decl);
  public abstract boolean isPlain(IStrategoTerm decl); // XXX: Decide what to do with "Plain"--leave in the language or create a new "Plain" language

  public abstract void processLanguageSpecific(IStrategoTerm toplevelDecl,
                                                Environment environment, 
                                                HybridInterpreter interp) throws IOException;
  
  /**
   * Pretty prints the content of a Java AST in some file.
   * 
   * @param aterm the name of a file which contains an aterm which encodes a Java AST
   * @throws IOException 
   */
  public abstract String prettyPrint(IStrategoTerm term, HybridInterpreter interp) throws IOException;

  
  public abstract String extractImportedModuleName(IStrategoTerm toplevelDecl, HybridInterpreter interp) throws IOException;

}
