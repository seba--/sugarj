package org.sugarj.util;

import org.sugarj.common.path.RelativePath;
import org.sugarj.driver.Result;

/**
 * 
 * @author seba
 */
public interface ProcessingListener {
  public void processingStarts(RelativePath sourceFile);
  public void processingDone(Result result);
}
