package org.sugarj.driver;

import java.io.Serializable;
import java.util.List;

import org.sugarj.driver.path.Path;

/**
 * @author seba
 */
public class Origin implements Serializable {
  private static final long serialVersionUID = -7561189258577853061L;

  private Path originalModelDep;
  private List<Path> usedTransformationDeps;

  public Origin() {
  }
  
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
}
