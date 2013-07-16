package org.sugarj.common.errors;

import org.sugarj.common.path.Path;

/**
 * @author Sebastian Erdweg
 */
public class SourceLocation {
  public Path file;
  public int lineStart;
  public int lineEnd;
  public int columnStart;
  public int columnEnd;

  public SourceLocation(Path file, int lineStart, int lineEnd, int columnStart, int columnEnd) {
    this.file = file;
    this.lineStart = lineStart;
    this.lineEnd = lineEnd;
    this.columnStart = columnStart;
    this.columnEnd = columnEnd;
  }  
}
