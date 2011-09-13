package org.sugarj.util;

import org.sugarj.driver.Result;
import org.sugarj.driver.path.RelativeSourceLocationPath;

/**
 * 
 * @author seba
 */
public interface ProcessingListener {
  public void processingStarts(RelativeSourceLocationPath sourceFile);
  public void processingDone(Result result);
}
