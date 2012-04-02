package org.sugarj.util;

import org.sugarj.common.path.RelativeSourceLocationPath;
import org.sugarj.Result;

/**
 * 
 * @author seba
 */
public interface ProcessingListener {
  public void processingStarts(RelativeSourceLocationPath sourceFile);
  public void processingDone(Result result);
}
