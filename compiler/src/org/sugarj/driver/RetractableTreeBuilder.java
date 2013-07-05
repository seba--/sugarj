package org.sugarj.driver;

import org.spoofax.interpreter.terms.ISimpleTerm;
import org.spoofax.jsglr.client.imploder.TermTreeFactory;
import org.spoofax.jsglr.client.imploder.TreeBuilder;
import org.sugarj.common.ATermCommands;

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
  public void reset(int startOffset) {
	// TODO enable resets for disambiguation etc., restoring the startOffset after the last successful piece of parsing.
  }
  
  @Override
  public void initializeInput(String input, String filename) {
    if (getOffset() != 0)
      return;
    
    if (getInput() == null)
      setInput(input);
    
    setTokenizer(new RetractableTokenizer(input, filename, getParseTable().getKeywordRecognizer()));
    isInitialized = true;
  }
  
  public void retract(ISimpleTerm term) {
    assert getTokenizer() instanceof RetractableTokenizer;
    ((RetractableTokenizer) getTokenizer()).retract(term);
    setOffset(getTokenizer().getStartOffset());
  }
  
  public void setOffset(int offset) {
    super.setOffset(offset);
  }
  
  public boolean isInitialized() {
    return isInitialized;
  }
  
  /**
   * Do *not* recreate tree.
   */
  @Override
  protected Object recreateWithAllTokens(Object tree) {
    return tree;
  }
}
