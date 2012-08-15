package org.sugarj.driver;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.sugarj.driver.path.AbsolutePath;
import org.sugarj.driver.path.Path;

/**
 * @author seba
 */
public class Origin {
  private Path originalModelDep;
  private List<Path> usedTransformationDeps;

  public Origin(Path originalModelDep, List<Path> usedTransformationDeps) {
    this.originalModelDep = originalModelDep;
    this.usedTransformationDeps = usedTransformationDeps;
  }
  
  public boolean isGenerated() {
    return originalModelDep != null && usedTransformationDeps != null;
  }

  public Path getOriginalModel() {
    return originalModelDep;
  }
  
  public List<Path> getUsedTransformations() {
    return usedTransformationDeps;
  }
  
  @Override
  public int hashCode() {
    return (originalModelDep == null ? 0 : originalModelDep.hashCode())
         + (usedTransformationDeps == null ? 0 : usedTransformationDeps.hashCode());
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Origin) {
      Origin o = (Origin) obj;
      if (originalModelDep == null && o.originalModelDep == null ||
          originalModelDep != null && originalModelDep.equals(o.originalModelDep))
        ;
      else
        return false;
      if (usedTransformationDeps == null && o.usedTransformationDeps == null ||
          usedTransformationDeps != null && usedTransformationDeps.equals(o.usedTransformationDeps))
        ;
      else
        return false;
      
      return true;
    }
    return false;
  }
  
  public String writeString() {
    StringBuilder builder = new StringBuilder();
    builder.append(originalModelDep == null ? "null" : originalModelDep.getAbsolutePath()).append('\n');
    
    if (usedTransformationDeps != null)
      for (Path trans : usedTransformationDeps)
        builder.append(trans.getAbsolutePath()).append('\n');
    
    return builder.toString();
  }
  
  public void write(Path p) throws IOException {
    FileCommands.writeToFile(p, toString());
  }
  
  public static Origin read(Path p) throws IOException {
    String s = FileCommands.readFileAsString(p);
    String[] paths = s.split("\n");
    if (paths.length < 1)
      throw new IllegalStateException("Ill-formed origin file");
    
    Path originalModelDep = null;
    if (!paths[0].equals("null"))
      originalModelDep = new AbsolutePath(paths[0]);
    List<Path> usedTransformationDeps = new LinkedList<Path>();
    for (int i = 1; i < paths.length; i++)
      usedTransformationDeps.add(new AbsolutePath(paths[i]));
    
    return new Origin(originalModelDep, usedTransformationDeps);
  }
  
  public String toString() {
    return writeString();
  }
}
