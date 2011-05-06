package org.sugarj.driver;

import java.util.Stack;

public class Log {
  /**
   * Whether leafs in the task tree should be display in one line
   * instead of two.
   */
  public static final boolean COLLAPSE_LEAF_TASKS = true;
  
  public static final boolean BORING_DONE_MESSAGES = false;
  
  public static final Log log = new Log();

  private Stack<String> tasks = new Stack<String>();
  private Stack<Long> timings = new Stack<Long>();
  private Stack<Boolean> lightweight = new Stack<Boolean>();
  private int silent = -1;
  
  public synchronized void beginTask(String shortText, String longText, boolean inline) {
    if (silent >= 0)
      return;
    
    noLongerLeaf();

    indent();
    System.out.print(longText);
    if (!inline) System.out.println();

    tasks.push(shortText);
    lightweight.push(inline);
    timings.push(System.currentTimeMillis());
  }
  
  public void beginTask(String shortText, String longText) {
    beginTask(shortText, longText, COLLAPSE_LEAF_TASKS);
  }
  
  public void beginTask(String text) {
    beginTask(text, text);
  }
  
  public synchronized void endTask(String error, boolean doneMessage) {
    if (silent >= 0)
      return;
    
    long endTime = System.currentTimeMillis();
    
    if (tasks.isEmpty())
      return;
    
    String shortText = tasks.pop();
    Long startTime = timings.pop();
    long duration = endTime - startTime;
    
    if (lightweight.pop()) {
      System.out.println(" ... " + error + " - " + duration + "ms");
    } else if (doneMessage) {
      log.log(shortText + " " + error + " - " + duration + "ms");
    }
    else 
      log.log(shortText + " " + error + " - " + duration + "ms");
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
  
  public void log(Object o) {
    log(o.toString());
  }
  
  public synchronized void log(String text) {
    if (silent >= 0)
      return;
    
    noLongerLeaf();
    indent();
    System.out.println(text);
  }
  
  public synchronized void logErr(String text) {
    if (silent >= 0)
      return;
    
    noLongerLeaf();
    indent();
    System.err.println(text);
  }
  
  private void noLongerLeaf() {
    if (!lightweight.empty() && lightweight.peek()) {
      lightweight.pop();
      lightweight.push(false);
      System.out.println();
    }
  }

  public void beginExecution(String prefix, String... cmds) {
    if (CommandExecution.FULL_COMMAND_LINE) {
      if (CommandExecution.WRAP_COMMAND_LINE) {
        beginTask("execute " + prefix);
        
        logCommandLine(cmds);
      } 
      else {
        StringBuilder builder = new StringBuilder();
        builder.append("execute");
        for (String cmd : cmds)
          builder.append(' ').append(cmd);
        beginTask("execute " + prefix, builder.toString(), false);
      }
    } else if (!CommandExecution.SUB_SILENT_EXECUTION) {
      beginTask("execute " + prefix);
    } else {
      beginInlineTask("execute " + prefix);
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
  
  public void logCommandLine(String[] cmds) {
    for (int i = 0; i < cmds.length; i++) {
      if (cmds[i].startsWith("-") && i + 1 < cmds.length && !cmds[i+1].startsWith("-")) {
        log(cmds[i] + " " + cmds[i + 1]);
        i++;
      }
      else
        log(cmds[i]);
    }
  }

  public void beginInlineTask(String text) {
    beginTask(text, text, true);
  }

  private void indent() {
    // System.out.print("$$$");
    for (int i = tasks.size(); i > 0; i--)
      System.out.print("  ");
  }

  public void endExecution(int exitValue) {
    endExecution(exitValue, new String[] {});
  }
  
  public void endExecution(int exitValue, String[] errMsg) {
    if (exitValue == 0)
      endTask();
    else {
      for (String err : errMsg)
        log(err);
      
      endTask("failed with exit value " + exitValue);
    }
  }
  
  public void beginSilent() {
    silent++;
  }
  
  public void endSilent() {
    silent--;
  }
}
