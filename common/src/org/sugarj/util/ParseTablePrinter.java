package org.sugarj.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr.client.Label;
import org.spoofax.jsglr.client.ParseTable;
import org.spoofax.jsglr.client.Priority;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.FileCommands;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */

public class ParseTablePrinter {
  public static void main(String[] args) throws InvalidParseTableException {
    String table = "/Users/seba/projects/SugarHaskell/test-workspace/test-haskell/.sugarjcache/sugarj4850388263278619875.tbl";
    String labs = "/Users/seba/tmp/table.labs";
    String prios = "/Users/seba/tmp/table.prios";
    printTable(table, labs, prios);
    System.out.println("ok");
  }
  
  public static void printTable(String file) throws InvalidParseTableException {
    printTable(file, FileCommands.dropExtension(file) + ".labs", FileCommands.dropExtension(file) + ".prios");
  }
  
  public static void printTable(String file, String labs, String prios) throws InvalidParseTableException {
    BufferedWriter write = null;
    BufferedWriter writePrios = null;
    try {
      write = new BufferedWriter(new FileWriter(labs));
      writePrios = new BufferedWriter(new FileWriter(prios));
      
      ParseTable table = ATermCommands.parseTableManager.loadFromFile(file);

      List<Label> labels = table.getLabels();
      for (int i = 0; i < labels.size(); i++)
        if (labels.get(i) != null) {
          Label lab = labels.get(i);
          write.write(i + ":\t" + lab.getProduction() + "\n");

          for (Priority p : table.getPriorities(lab)) {
            String kind;
            switch (p.type) {
            case Priority.LEFT:
              kind = "left";
              break;
            case Priority.RIGHT:
              kind = "right";
              break;
            case Priority.GTR:
              kind = "gtr";
              break;
            case Priority.NONASSOC:
              kind = "nonassoc";
              break;
            default:
              kind = "unknown";
            }

            writePrios.write(p.left + "  " + p.right + "  " + kind
                + (p.arg == -1 ? "" : "  <" + p.arg + ">") + "\n");
          }

        }
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      if (write != null)
        try {
          write.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      if (writePrios != null)
        try {
          writePrios.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
    }
  }
}
