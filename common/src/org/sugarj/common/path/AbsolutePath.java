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
    if (!acceptable(path))
      throw new IllegalArgumentException("AbsolutePath constructed on unacceptable argument: " + path);
    this.path = trimBack(path).replace(File.separatorChar, '/');
  }
  
  @Override
  public String getAbsolutePath() {
    return path;
  }
  
  // cai 24.09.12
  // test whether `path` is an acceptable argument to
  // the constructor of AbsolutePath. A path is acceptable
  // iff
  // 1. it is an absolute path according to Java, or
  // 2. its root is a dot.
  public static boolean acceptable(String path){
    return new File(path).isAbsolute()
        || path.startsWith("./")
        || path.startsWith("." + File.separator)
        || path.equals(".");
  }

}
