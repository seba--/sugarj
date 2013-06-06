package org.sugarj.common;

import java.io.PrintStream;
import java.util.Stack;

import org.sugarj.common.CommandExecution;

public class Log {
  /**
   * Whether leafs in the task tree should be display in one line
   * instead of two.
   */
  public static final boolean COLLAPSE_LEAF_TASKS = true;
  
  public static final boolean BORING_DONE_MESSAGES = false;
  
  public static final int NONE = 0;
  public static final int CORE = 1 << 0;
  public static final int PARSE = 1 << 1;
  public static final int TRANSFORM = 1 << 2;
  public static final int IMPORT = 1 << 3;
  public static final int BASELANG = 1 << 4;
  public static final int CACHING = 1 << 5;
  public static final int DETAIL = 1 << 6;
  public static final int ALWAYS = CORE | PARSE | TRANSFORM | IMPORT | BASELANG | CACHING | DETAIL;
  
  public static final Log log = new Log();
  
  private Stack<String> tasks = new Stack<String>();
  private Stack<Long> timings = new Stack<Long>();
  private Stack<Boolean> lightweight = new Stack<Boolean>();
  private int silent = -1;
  private int loglevel = CORE;
  
  public static PrintStream out = System.out;
  public static PrintStream err = System.err;
  
  public synchronized void beginTask(String shortText, String longText, boolean inline, int tasklevel) {
    if (silent >= 0)
      return;
    
    boolean active = (loglevel & tasklevel) > 0;
    
    if (!active) {
      tasks.push(null);
      return;
    }
      
    noLongerLeaf();

    indent();
    out.print(longText);
    if (!inline) 
      out.println();

    tasks.push(shortText);
    lightweight.push(inline);
    timings.push(System.currentTimeMillis());
  }
  
  public void beginTask(String shortText, String longText, int level) {
    beginTask(shortText, longText, COLLAPSE_LEAF_TASKS, level);
  }
  
  public void beginTask(String text, int level) {
    beginTask(text, text, level);
  }
  
  public synchronized void endTask(String error, boolean doneMessage) {
    if (silent >= 0)
      return;
    
    long endTime = System.currentTimeMillis();
    
    if (tasks.isEmpty())
      return;
    
    String shortText = tasks.pop();
    if (shortText == null)
      return;
    
    Long startTime = timings.pop();
    long duration = endTime - startTime;
    
    if (lightweight.pop()) {
      out.println(" ... " + error + " - " + duration + "ms");
    } else if (doneMessage) {
      log.log(shortText + " " + error + " - " + duration + "ms", Log.ALWAYS);
    }
    else 
      log.log(shortText + " " + error + " - " + duration + "ms", Log.ALWAYS);
  }
  
  public void endTask() {
    endTask("done", BORING_DONE_MESSAGES);
  }
  
  public void endTask(String error) {
    endTask(error, true);
  }
  
  public void endTask(boolean success) {
    endTask(success, "successful", "failed");
  }
  
  public void endTask(boolean success, String good, String bad) {
    if (success)
      endTask(good);
    else
      endTask(bad);
  }
  
  public void log(Object o, int msglevel) {
    log(o.toString(), msglevel);
  }
  
  public synchronized void log(String text, int msglevel) {
    if (silent >= 0)
      return;
    
    if ((loglevel & msglevel) == 0)
      return;
    
    noLongerLeaf();
    indent();
    out.println(text);
  }
  
  public synchronized void logErr(String text, int msglevel) {
    if (silent >= 0)
      return;
    
    if ((loglevel & msglevel) == 0)
      return;
    
    noLongerLeaf();
    indent();
    err.println(text);
  }
  
  private void noLongerLeaf() {
    if (!lightweight.empty() && lightweight.peek()) {
      lightweight.pop();
      lightweight.push(false);
      out.println();
    }
  }

  public void beginExecution(String prefix, int level, String... cmds) {
    if (CommandExecution.FULL_COMMAND_LINE) {
      if (CommandExecution.WRAP_COMMAND_LINE) {
        beginTask("execute " + prefix, level);
        
        logCommandLine(cmds, level);
      } 
      else {
        StringBuilder builder = new StringBuilder();
        builder.append("execute");
        for (String cmd : cmds)
          builder.append(' ').append(cmd);
        beginTask("execute " + prefix, builder.toString(), false, level);
      }
    } else if (!CommandExecution.SUB_SILENT_EXECUTION) {
      beginTask("execute " + prefix, level);
    } else {
      beginInlineTask("execute " + prefix, level);
    }
  }
  
  public String commandLineAsString(String[] cmds) {
    StringBuffer buf = new StringBuffer();
    
    for (int i = 0; i < cmds.length; i++) {
      if (cmds[i] != null && 
          cmds[i].startsWith("-") && 
          i + 1 < cmds.length && 
          (cmds[i+1] == null || !cmds[i+1].startsWith("-"))) {
        buf.append(" ").append(cmds[i]).append(" ").append(cmds[i + 1]);
        i++;
      }
      else if (cmds[i] != null)
        buf.append(" ").append(cmds[i]);
    }
    
    return buf.toString();
  }
  
  public void logCommandLine(String[] cmds, int level) {
    for (int i = 0; i < cmds.length; i++) {
      if (cmds[i].startsWith("-") && i + 1 < cmds.length && !cmds[i+1].startsWith("-")) {
        log(cmds[i] + " " + cmds[i + 1], level);
        i++;
      }
      else
        log(cmds[i], level);
    }
  }

  public void beginInlineTask(String text, int level) {
    beginTask(text, text, true, level);
  }

  private void indent() {
    for (int i = tasks.size(); i > 0; i--)
      out.print("  ");
  }

  public void endExecution(int exitValue) {
    endExecution(exitValue, new String[] {});
  }
  
  public void endExecution(int exitValue, String[] errMsg) {
    endTask();
    if (exitValue != 0)
      for (String err : errMsg)
        log(err, Log.ALWAYS);
  }
  
  public void beginSilent() {
    silent++;
  }
  
  public void endSilent() {
    silent--;
  }
  
  public void setLoggingLevel(int level) {
    this.loglevel = level;
  }

  public int getLoggingLevel() {
    return this.loglevel;
  }
}
