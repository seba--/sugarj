/**
 * 
 */
package org.sugarj.common.errors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.sugarj.util.Pair;

/**
 * @author Sebastian Erdweg
 */
public class SourceCodeException extends Exception {

  private static final long serialVersionUID = 7016122139169186870L;
  
  private List<Pair<SourceLocation, String>> errors;
  
  public SourceCodeException(SourceLocation sourceLocation, String msg) {
    super(msg);
    this.errors = Collections.singletonList(Pair.create(sourceLocation, msg));
  }
  
  public SourceCodeException(List<Pair<SourceLocation, String>> errors) {
    this.errors = Collections.unmodifiableList(errors);
  }
  
  public SourceCodeException(Pair<SourceLocation, String>... errors) {
    this.errors = new ArrayList<Pair<SourceLocation,String>>(errors.length);
    for (Pair<SourceLocation, String> error : errors)
      this.errors.add(error);
    this.errors = Collections.unmodifiableList(this.errors);
  }

  public List<Pair<SourceLocation, String>> getErrors() {
    return errors;
  }
}
