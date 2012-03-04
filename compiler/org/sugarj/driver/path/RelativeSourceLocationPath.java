package org.sugarj.driver.path;

import org.sugarj.driver.Environment;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class RelativeSourceLocationPath extends RelativePath {
  private static final long serialVersionUID = -7966865805323269655L;

  private SourceLocation sourceLocation;
  
  public RelativeSourceLocationPath(SourceLocation loc, String relativePath) {
    super(loc.getPath(), relativePath);
    this.sourceLocation = loc;
  }
  
  public RelativeSourceLocationPath(SourceLocation loc, RelativePath p) {
    super(loc.getPath(), p.getRelativePath());
    if (!loc.getPath().equals(p.getBasePath()))
      throw new IllegalArgumentException("Given path is not part of the given source location");
    this.sourceLocation = loc;
  }
  
  public RelativeSourceLocationPath(RelativePath p, Environment environment) {
    super(p.getBasePath(), p.getRelativePath());
    this.sourceLocation = new SourceLocation(p.getBasePath(), environment);
  }
  
  public SourceLocation getSourceLocation() {
    return sourceLocation;
  }
}
