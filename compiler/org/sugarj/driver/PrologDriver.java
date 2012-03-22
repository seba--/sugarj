package org.sugarj.driver;

import static org.sugarj.driver.ATermCommands.isApplication;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.LanguageDriver;

// TODO: Move to prolog library

public class PrologDriver extends LanguageDriver {

  @Override
  public String getSourcecodeExtension() {
    return ".pro";
  }
  
  @Override
  public boolean isLanguageSpecificDec(IStrategoTerm decl) {
    return isApplication(decl, "Sentence");
  }

  @Override
  public boolean isSugarDec(IStrategoTerm decl) {
    return isApplication(decl, "SugarDec");           // XXX: Add to prolog
  }
  
  @Override
  public boolean isEditorService(IStrategoTerm decl) {
    return isApplication(decl, "EditorServicesDec");    // XXX: Add to prolog
  }

  @Override
  public boolean isImport(IStrategoTerm decl) {
    return isApplication(decl, "ModuleImport");
  }

  @Override
  public boolean isPlain(IStrategoTerm decl) {
    return isApplication(decl, "PlainDec");         // XXX: Add to prolog
  }

}
