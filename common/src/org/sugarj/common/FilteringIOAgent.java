package org.sugarj.common;

import java.io.IOException;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import org.spoofax.interpreter.library.IOAgent;

/**
 * @author seba
 */
public class FilteringIOAgent extends IOAgent {
  
  /**
   * Regex exclusion patterns.
   * If any of the patterns matches a given logging message completely, this message is ignored by this IOAgent. 
   */
  private List<Pattern> excludePatterns;
  
  private final Writer outWriter = new FilteringWriter(super.getWriter(CONST_STDOUT));
  private final Writer errWriter = new FilteringWriter(super.getWriter(CONST_STDERR));
  
  public FilteringIOAgent(String... regexs) {
    excludePatterns = new LinkedList<Pattern>();
    for (String regex : regexs)
      addExcludePattern(regex);
  }
  
  @Override
  public Writer getWriter(int fd) {
    switch (fd) {
    case IOAgent.CONST_STDOUT:
      return outWriter;
    case IOAgent.CONST_STDERR:
      return errWriter;
    default:
      return super.getWriter(fd);
    }
  }
  
  /**
   * Adds an exclusion pattern to this filtering IOAgent. Patterns need to match whole lines.
   */
  public void addExcludePattern(String regex) {
    Pattern pat = Pattern.compile(regex, Pattern.DOTALL);
    excludePatterns.add(pat);
  }
  
  
  private class FilteringWriter extends Writer {
    
    private final Writer writer;
    private boolean skip;
    
    public FilteringWriter(Writer writer) {
      this.writer = writer;
      this.skip = false;
    }
    
    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
      String s = new String(cbuf, off, len);

      if (skip) {
        skip = !s.endsWith("\n");
        return;
      }
      
      for (Pattern pat: excludePatterns)
        if (pat.matcher(s).matches()) {
          skip = !s.endsWith("\n");
          return;
        }
      
      writer.write(cbuf, off, len);
    }

    @Override
    public void flush() throws IOException {
      writer.flush();
    }

    @Override
    public void close() throws IOException {
      writer.close();
    }
    
  }

}
