package org.sugarj.driver;

import aterm.ATerm;

public class IncrementalParseResult {
  private final ATerm toplevelDecl;
  private final String rest;
  
  public IncrementalParseResult(ATerm toplevelDecl, String rest) {
    this.toplevelDecl = toplevelDecl;
    this.rest = rest;
  }
  
  public ATerm getToplevelDecl() {
    return toplevelDecl;
  }
  
  public String getRest() {
    return rest;
  }
  
  public boolean parsingFinished() {
    return rest.isEmpty();
  }
}