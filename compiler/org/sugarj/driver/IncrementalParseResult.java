package org.sugarj.driver;

import org.spoofax.interpreter.terms.IStrategoTerm;

public class IncrementalParseResult {
  private final IStrategoTerm toplevelDecl;
  private final String rest;
  
  public IncrementalParseResult(IStrategoTerm toplevelDecl, String rest) {
    this.toplevelDecl = toplevelDecl;
    this.rest = rest;
  }
  
  public IStrategoTerm getToplevelDecl() {
    return toplevelDecl;
  }
  
  public String getRest() {
    return rest;
  }
  
  public boolean parsingFinished() {
    return rest.isEmpty();
  }
}