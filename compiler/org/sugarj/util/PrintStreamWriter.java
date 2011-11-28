package org.sugarj.util;

import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;
import java.nio.CharBuffer;

/**
 * from: https://svn.strategoxt.org/repos/StrategoXT/spoofax/trunk/spoofax/org.spoofax.interpreter.core/src/java/org/spoofax/interpreter/library/IOAgent.java
 * 
 * A class for writing to a PrintStream.
 * 
 * @author Lennart Kats <lennart add lclnet.nl>
 */
public class PrintStreamWriter extends Writer {

  private final PrintStream stream;

  public PrintStreamWriter(PrintStream stream) {
    this.stream = stream;
  }

  @Override
  public void close() throws IOException {
    stream.close();
  }

  @Override
  public void flush() throws IOException {
    stream.flush();
  }

  @Override
  public void write(char[] cbuf, int off, int len) throws IOException {
    if (off == 0 && len == cbuf.length)
      stream.print(cbuf);
    else
      stream.append(CharBuffer.wrap(cbuf, off, len));
  }

  @Override
  public void write(String str, int off, int len) throws IOException {
    stream.append(str, off, len);
  }

}