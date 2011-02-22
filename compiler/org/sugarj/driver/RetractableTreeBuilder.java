package org.sugarj.driver;

import org.spoofax.PushbackStringIterator;
import org.spoofax.interpreter.terms.ISimpleTerm;
import org.spoofax.jsglr.client.imploder.TermTreeFactory;
import org.spoofax.jsglr.client.imploder.TreeBuilder;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class RetractableTreeBuilder extends TreeBuilder {
  
  private boolean isInitialized;
  
  public RetractableTreeBuilder() {
    super(new TermTreeFactory(ATermCommands.factory));
  }
  
  @Override
  public void reset() {
    // TODO enable resets for disambiguation etc., restoring the startOffset after the last successful piece of parsing. 
  }
  
  @Override
  public void initializeInput(String input, String filename) {
    if (getOffset() != 0)
      return;
    
    if (getInput() == null)
      setInput(input);
    
    setTokenizer(new RetractableTokenizer(input, filename, getTable().getKeywordRecognizer()));
    setStringIterator(new PushbackStringIterator(input));
    isInitialized = true;
  }
  
  public void retract(ISimpleTerm term) {
    assert getTokenizer() instanceof RetractableTokenizer;
    ((RetractableTokenizer) getTokenizer()).unbindAstNode(term);
    setOffset(getTokenizer().getStartOffset());
  }
  
  public boolean isInitialized() {
    return isInitialized;
  }
}
