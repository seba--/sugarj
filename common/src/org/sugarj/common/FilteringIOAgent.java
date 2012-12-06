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
  
  /**
   * Always log messages if the active logging level matches `includeLogLevel`.
   */
  private int includeLogLevel;
  
  private final Writer outWriter = new FilteringWriter(new org.sugarj.util.PrintStreamWriter(Log.out));
  private final Writer errWriter = new FilteringWriter(new org.sugarj.util.PrintStreamWriter(Log.err));
  
  public FilteringIOAgent(String... regexs) {
    this(Log.NONE, regexs);
  }
  
  public FilteringIOAgent(int level, String... regexs) {
    includeLogLevel = level;
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
    private String msg;
    
    public FilteringWriter(Writer writer) {
      this.writer = writer;
      this.skip = false;
      this.msg = new String();
    }
    
    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
      String s = new String(cbuf, off, len);
      msg += s;
      if (skip) {
        skip = !s.endsWith("\n");
        pushMessageToLog();
        return;
      }
      
      for (Pattern pat: excludePatterns)
        if (pat.matcher(s).matches()) {
          skip = !s.endsWith("\n");
          msg = new String();
          return;
        }
      
      if ((Log.log.getLoggingLevel() & includeLogLevel) > 0)
        writer.write(cbuf, off, len);
    }
    
    private void pushMessageToLog() {
      if (msg.endsWith("\n")) {
        if (msg.length() > 2)
          Log.log.log(msg.substring(0, msg.length() - 1), includeLogLevel);
        msg = new String();
      }
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
