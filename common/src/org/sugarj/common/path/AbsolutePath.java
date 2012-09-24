package org.sugarj.common.path;

import java.io.File;


/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class AbsolutePath extends Path {
  private static final long serialVersionUID = 5295721717436544187L;

  private String path;
  
  // cai 23.09.12
  // when constructed given a relative path,
  // this object assumes JVM's PWD to be the base.
  public AbsolutePath(String path) {
    // TODO
    // 1. Incorporate discussion
    // 2. Trace cause of
    //    org.strategoxt.lang.StrategoErrorExit: pack-sdf: error: file ./C:/Users/cai/Ap
    //    pData/Local/Temp/sugarj5620452099082416616.sdf does not exis
    try{
      this.path = (new File(path)).getCanonicalPath();
    } catch (java.io.IOException e) {
      throw new RuntimeException(e);
    }
  }
  
  @Override
  public String getAbsolutePath() {
    return path;
  }

}
