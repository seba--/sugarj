package org.sugarj.driver;

import static org.spoofax.jsglr.client.imploder.ImploderAttachment.getLeftToken;
import static org.spoofax.jsglr.client.imploder.ImploderAttachment.getRightToken;
import static org.spoofax.jsglr.client.imploder.ImploderAttachment.getTokenizer;

import org.spoofax.interpreter.terms.ISimpleTerm;
import org.spoofax.jsglr.client.KeywordRecognizer;
import org.spoofax.jsglr.client.imploder.IToken;
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
    
    if (currentToken().getKind() == IToken.TK_EOF)
      removeTokenAt(getTokenCount() - 1);
    
    IToken tok = getLeftToken(node);
    
    int start = tok.getIndex();
    int end = getRightToken(node).getIndex();

    int lastIndex = getTokenCount() - 1;
    assert end == lastIndex;
    
    setPositions(tok.getLine(), tok.getStartOffset(), tok.getStartOffset() - tok.getColumn());
    
    for (int i = end; i >= start; i--)
      removeTokenAt(i);
    
  }
  
  @Override
  public void setKeywordRecognizer(KeywordRecognizer keywords) {
    super.setKeywordRecognizer(keywords);
  }
}
