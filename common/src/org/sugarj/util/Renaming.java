package org.sugarj.util;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.path.RelativePath;

/**
 * @author seba
 */
public class Renaming implements Serializable {
  private static final long serialVersionUID = -3707638775569347652L;

  public List<String> pkgs;
  public String from;
  public String to;
  
  public Renaming(List<String> pkgs, String from, String to) {
    this.pkgs = pkgs;
    this.from = from;
    this.to = to;
  }

  public Renaming(RelativePath fromPath, RelativePath toPath) {
    this(fromPath.getRelativePath(), toPath.getRelativePath());
  }
  
  public Renaming(String fromPath, String toPath) {
    this.from = FileCommands.fileName(fromPath).replace("-", "$");
    this.to = FileCommands.fileName(toPath).replace("-", "$");
    this.pkgs = new LinkedList<String>();
    for (String pkg : fromPath.split(Environment.sep))
      this.pkgs.add(pkg);
    this.pkgs.remove(this.pkgs.size() - 1);
  }
}
