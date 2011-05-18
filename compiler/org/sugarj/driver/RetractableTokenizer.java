package org.sugarj.driver;

import static org.spoofax.jsglr.client.imploder.ImploderAttachment.getTokenizer;

import org.spoofax.interpreter.terms.ISimpleTerm;
import org.spoofax.jsglr.client.KeywordRecognizer;
import org.spoofax.jsglr.client.imploder.IToken;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.jsglr.client.imploder.Tokenizer;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class RetractableTokenizer extends Tokenizer {

  public RetractableTokenizer(String input, String filename, KeywordRecognizer keywords) {
    super(input, filename, keywords);
  }
  
  public void retract(ISimpleTerm node) {
    assert getTokenizer(node) == this;
    retractTo(ImploderAttachment.getLeftToken(node).getIndex());
  }
  
  public void retractTo(int index) {
    IToken tok = getTokenAt(index);
    
    int start = tok.getIndex();
    
    for (int i = getTokenCount() - 1; i >= start; i--)
      removeTokenAt(i);
    
    assert getTokenCount() == start;
    
    setPositions(tok.getLine(), tok.getStartOffset(), tok.getStartOffset() - tok.getColumn());
  }
  
  @Override
  public void setKeywordRecognizer(KeywordRecognizer keywords) {
    super.setKeywordRecognizer(keywords);
  }
}
