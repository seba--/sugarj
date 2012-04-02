package org.sugarj.driver;

import static org.sugarj.driver.Log.log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.sugarj.common.FileCommands;

/**
 * Provides methods for calling external commands. Includes input
 * and output stream forwarding to standard in and out.
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class CommandExecution {

  /**
   * silences the main process
   */
  public static boolean SILENT_EXECUTION = false;

  /**
   * silences the sub processes
   */
  public static boolean SUB_SILENT_EXECUTION = true;

  /**
   * displays full command lines
   */
  public static boolean FULL_COMMAND_LINE = false;

  /**
   * Line-wraps command lines (if displayed at all)
   */
  public final static boolean WRAP_COMMAND_LINE = true;

  /**
   * displays caching information
   */
  public static boolean CACHE_INFO = true;

  /**
   * A thread that forwards the stream in to the stream out,
   * prepending a prefix to each line. See
   * http://www.javaworld.com
   * /javaworld/jw-12-2000/jw-1229-traps.html to understand why
   * we need this.
   */
  private static class StreamLogger extends Thread {
    private final InputStream in;
    private String prefix;

    private List<String> msg = new ArrayList<String>();
    
    public StreamLogger(InputStream in, String prefix) {
      this.in = in;
      this.prefix = prefix;
    }

    @Override
    public void run() {
      try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        while ((line = reader.readLine()) != null)
          if (!SILENT_EXECUTION && !SUB_SILENT_EXECUTION)
            log.log(prefix + line);
          else  
            msg.add(prefix + line);
      } catch (IOException ioe) {
        ioe.printStackTrace();
      }
    }
    
    public String[] getUnloggedMsg() {
      return msg.toArray(new String[] {});
    }
  }

  public static class ExecutionError extends Error {
    private static final long serialVersionUID = -4924660269220590175L;
    private final String[] cmds;

    public ExecutionError(String message, String[] cmds) {
      super(message + ": " + log.commandLineAsString(cmds));
      this.cmds = cmds;
    }
    
    public ExecutionError(String message, String[] cmds, Throwable cause) {
      super(message + ": " + log.commandLineAsString(cmds), cause);
      this.cmds = cmds;
    }

    public String[] getCmds() {
      return cmds;
    }
  }

  /**
   * Executes the given command.
   * <p>
   * All paths given to this function have to be treated by
   * {@link FileCommands#toCygwinPath} (if a cygwin program is to
   * be executed) or {@link FileCommands#toWindowsPath} (if a
   * native Windows program is to be executed) as appropriate.
   * <p>
   * The first argument of this method is used as a short name of
   * the command for logging purposes.
   * 
   * @param cmds
   *        the executable and its argument to execute
   * @throws IOException
   *         when something goes wrong
   */
  public static void execute(String... cmds) {
    executeWithPrefix(cmds[0], cmds);
  }

  /**
   * Executes the given command.
   * <p>
   * All paths given to this function have to be treated by
   * {@link FileCommands#toCygwinPath} (if a cygwin program is to
   * be executed) or {@link FileCommands#toWindowsPath} (if a
   * native Windows program is to be executed) as appropriate.
   * 
   * @param prefix
   *        a short version of the command for logging purposes
   * @param cmds
   *        the executable and its argument to execute
   * @throws IOException
   *         when something goes wrong
   */
  public static void executeWithPrefix(String prefix, String... cmds) {
    int exitValue;
    
    try {
      Runtime rt = Runtime.getRuntime();

//      if (!SILENT_EXECUTION) {
//        log.beginExecution(prefix, cmds);
//      }

      Process p = rt.exec(cmds);

      StreamLogger errStreamLogger = new StreamLogger(p.getErrorStream(), "");
      StreamLogger outStreamLogger = new StreamLogger(p.getInputStream(), "");

      // We need to start these threads even if we don't care for
      // the output, because the process will block if we don't
      // read from the streams

      errStreamLogger.start();
      outStreamLogger.start();

      // Wait for the process to finish
      exitValue = p.waitFor();

//      log.endExecution(exitValue, errStreamLogger.getUnloggedMsg());
    } catch (Throwable t) {
      throw new ExecutionError("problems while executing " + prefix + ": "
          + t.getMessage(), cmds, t);
    }
    
    if (exitValue != 0)
      throw new ExecutionError("problems while executing", cmds);
  }
}
