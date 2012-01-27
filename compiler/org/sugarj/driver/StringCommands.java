/**
 * 
 */
package org.sugarj.driver;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.sugarj.driver.path.RelativePath;
import org.sugarj.util.Renaming;

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
  
  public static String rename(String in, Renaming ren) {
    if (in.equals(ren.from))
      return ren.to;
    
    String prefix = printListSeparated(ren.pkgs, Environment.sep);
    if (in.equals(prefix + ren.from))
      return prefix + ren.to;
    
    return in;
  }
  
  public static List<String> renameAll(List<? extends Object> in, List<Renaming> renamings) {
    List<String> res = new LinkedList<String>();
    for (Object o : in) {
      String s = o.toString();
      for (Renaming ren : renamings)
        s = rename(s, ren);
      res.add(s);
    }
    return res;
  }
}
