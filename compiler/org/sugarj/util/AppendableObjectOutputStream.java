package org.sugarj.util;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * copied from http://stackoverflow.com/questions/1194656/appending-to-an-objectoutputstream/1195078#1195078
 */
public class AppendableObjectOutputStream extends ObjectOutputStream {

  public AppendableObjectOutputStream(OutputStream out) throws IOException {
    super(out);
  }

  @Override
  protected void writeStreamHeader() throws IOException {
    // do not write a header
  }

}
