/**
 * 
 */
package org.sugarj.driver;

import java.util.Iterator;
import java.util.List;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class StringCommands {

  public static String printListSeparated(List<String> l, String sep) {
    StringBuilder b = new StringBuilder();
  
    for (Iterator<String> it = l.iterator(); it.hasNext();) {
      b.append(it.next());
      if (it.hasNext())
        b.append(sep);
    }
  
    return b.toString();
  }

}
