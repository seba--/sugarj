package oneoone;

import java.util.List;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class Company {
  public List<Department> departments;

  public Company(List<Department> departments) {
    this.departments = departments;
  }
}
