package oneoone;

import java.util.List;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class Department {
  public Manager manager;
  public List<Employee> employees;
  public List<Department> subunits;

  public Department(Manager manager, List<Employee> employees, List<Department> subunits) {
    this.manager = manager;
    this.employees = employees;
    this.subunits = subunits;
  }

}
