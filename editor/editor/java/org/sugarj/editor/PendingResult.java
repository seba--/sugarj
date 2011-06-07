/**
 * 
 */
package org.sugarj.editor;

import org.sugarj.driver.Result;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class PendingResult extends Result {
  private Result result;
  
  public PendingResult(Result result) {
    this.result = result;
  }
  
  public Result getResult() {
    return result;
  }
  
  public boolean isUpToDate(int hash) {
    return false;
  }
}
