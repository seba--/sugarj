package org.sugarj.driver.declprovider;

import java.util.ArrayList;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.imploder.IToken;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.sugarj.common.ATermCommands;

/**
 * @author jp
 * @author seba
 */
public class TermToplevelDeclarationProvider implements ToplevelDeclarationProvider {

  private List<IStrategoTerm> terms;
  int index;
  private final int hash;
  
  public TermToplevelDeclarationProvider(IStrategoTerm source) {
    IStrategoTerm packageDecOption = ATermCommands.getApplicationSubterm(source, "CompilationUnit", 0);
    IStrategoTerm importDecs = ATermCommands.getApplicationSubterm(source, "CompilationUnit", 1);
    IStrategoTerm bodyDecs = ATermCommands.getApplicationSubterm(source, "CompilationUnit", 2);
    
    index = 0;
    terms = new ArrayList<IStrategoTerm>();
    
    if (ATermCommands.isApplication(packageDecOption, "Some"))
      terms.add(ATermCommands.getApplicationSubterm(packageDecOption, "Some", 0));
    terms.addAll(ATermCommands.getList(importDecs));
    terms.addAll(ATermCommands.getList(bodyDecs));
    
    hash = ATermCommands.atermToString(source).hashCode();
  }
  
  @Override
  public IStrategoTerm getNextToplevelDecl(boolean recovery, boolean lookahead) {
    return terms.get(index++);
  }
  
  @Override
  public boolean hasNextToplevelDecl() {
    return index < terms.size();
  }

  @Override
  public void retract(IStrategoTerm term) {
    if (index <= 0)
      throw new IllegalStateException();
    
    if (terms.get(index - 1).equals(term))
      index--;
    else
      throw new IllegalArgumentException();
  }

  @Override
  public int getSourceHashCode() {
    return hash;
  }

  @Override
  public IToken getStartToken() {
    if (!terms.isEmpty())
      return ImploderAttachment.getLeftToken(terms.get(0));
    return null;
  }
  
}