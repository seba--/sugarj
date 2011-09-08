/**
 * 
 */
package org.sugarj.editor;

import org.sugarj.driver.Environment;
import org.sugarj.driver.Result;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class PendingResult extends Result {
  private Result result;

  public PendingResult(Result result) {
    super(true);
    this.result = result;
  }

  public Result getResult() {
    return result;
  }

  public boolean isUpToDateShallow(int h, Environment env) {
    return false;
  }

  public boolean isUpToDate(int hash) {
    return false;
  }
}
