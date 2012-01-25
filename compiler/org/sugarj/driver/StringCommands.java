/**
 * 
 */
package org.sugarj.driver;

import java.util.Iterator;
import java.util.List;
import org.sugarj.driver.path.RelativePath;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class StringCommands {

  public static String printListSeparated(List<? extends Object> l, String sep) {
    StringBuilder b = new StringBuilder();
  
    for (Iterator<? extends Object> it = l.iterator(); it.hasNext();) {
      b.append(it.next());
      if (it.hasNext())
        b.append(sep);
    }
  
    return b.toString();
  }
  
  public static String printModuleList(List<RelativePath> l, String sep) {
    StringBuilder b = new StringBuilder();
  
    for (Iterator<RelativePath> it = l.iterator(); it.hasNext();) {
      b.append(FileCommands.dropExtension(it.next().getRelativePath()));
      if (it.hasNext())
        b.append(sep);
    }
  
    return b.toString();
  }
}
