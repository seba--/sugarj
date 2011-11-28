package org.sugarj.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * from: https://svn.strategoxt.org/repos/StrategoXT/spoofax/trunk/spoofax/org.spoofax.interpreter.core/src/java/org/spoofax/interpreter/library/LoggingIOAgent.java
 */
public class LoggingOutputStream extends OutputStream {
  ByteArrayOutputStream bytes = new ByteArrayOutputStream();
  
  OutputStream stream;

  public LoggingOutputStream(OutputStream stream) {
    this.stream = stream;
  }
  
  public String getLog() {
    return bytes.toString();
  }

  @Override
  public void write(int b) throws IOException {
    stream.write(b);
    bytes.write(b);
  }

  @Override
  public void write(byte[] b) throws IOException {
    stream.write(b);
    bytes.write(b);
  }

  @Override
  public void write(byte[] b, int off, int len) throws IOException {
    stream.write(b, off, len);
    bytes.write(b, off, len);
  }

  @Override
  public void flush() throws IOException {
    stream.flush();
  }

  @Override
  public void close() throws IOException {
    // UNDONE: closing console streams is asking for trouble
    // if (stream != System.out && stream != System.err)
    // stream.close();
    stream.flush();
  }
}