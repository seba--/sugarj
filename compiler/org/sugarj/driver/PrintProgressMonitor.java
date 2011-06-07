package org.sugarj.driver;

import java.io.PrintStream;
import java.util.Stack;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class PrintProgressMonitor implements IProgressMonitor {

  private PrintStream out;
  private Stack<String> tasks;
  private boolean canceled;
  
  public PrintProgressMonitor(PrintStream out) {
    this.out = out;
  }
  
  @Override
  public void beginTask(String name, int totalWork) {
    tasks.push(name);
    out.print(indent() + "begin " + name);
  }

  @Override
  public void done() {
    out.println("...done " + tasks.pop());
    out.println(indent());
  }

  @Override
  public void internalWorked(double work) {
  }

  @Override
  public boolean isCanceled() {
    return canceled;
  }

  @Override
  public void setCanceled(boolean canceled) {
    this.canceled = canceled;
  }

  @Override
  public void setTaskName(String name) {
    tasks.pop();
    tasks.push(name);
  }

  @Override
  public void subTask(String name) {
    out.println(indent() + "begin " + name);
    tasks.push(name);
  }

  @Override
  public void worked(int work) {
    out.println('.');
  }

  private String indent() {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < tasks.size(); i++)
      builder.append("  ");
    return builder.toString();
  }
}
