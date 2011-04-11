package org.sugarj.driver;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.shared.BadTokenException;

class PendingResult extends Result {
  final static PendingResult instance = new PendingResult(); 
  
  boolean isUpToDate() {
    return true;
  }
  
  public IStrategoTerm getSugaredSyntaxTree() {
    return null;
  }
  
  public Collection<String> getFileDependencies() {
    return Collections.emptySet();
  }
  
  public Set<IStrategoTerm> getEditorServices() {
    return Collections.emptySet();
  }

  public Set<BadTokenException> getCollectedErrors() {
    return Collections.emptySet();
  }
}