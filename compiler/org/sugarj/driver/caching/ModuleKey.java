package org.sugarj.driver.caching;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.driver.ATermCommands;

/**
 * The key of some SDF module as needed for caching.
 * 
 * Besides the actual SDF module, also the path for looking up
 * referenced modules is stored here. This way we do not need
 * to store a complete grammar, as represented by SDF definitions. 
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 *
 */
public class ModuleKey implements Externalizable {

  public IStrategoTerm module;
  public String main;
  public String[] paths;
  
  /**
   * For deserialization only.
   */
  public ModuleKey() {}
  
  public ModuleKey(IStrategoTerm module, String main, List<String> paths) {
    this.module = module;
    this.main = main;
    this.paths = paths.toArray(new String[]{});
  }
  
  public ModuleKey(IStrategoTerm module, String main, String... paths) {
    this.module = module;
    this.main = main;
    this.paths = paths;
  }
  
  public boolean equals(Object o) {
    if (!(o instanceof ModuleKey))
      return false;
    
    ModuleKey k = (ModuleKey) o;
    return module.equals(k.module) && main.equals(k.main) && Arrays.equals(paths, k.paths);
  }
  
  public int hashCode() {
    return module.hashCode() + main.hashCode() + Arrays.hashCode(paths);
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    module = ATermCommands.atermFromString((String) in.readObject());
    main = (String) in.readObject();
      
    int len = in.readInt();
    paths = new String[len];
    
    for (int i = 0; i < len; i++)
      paths[i] = (String) in.readObject();
  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeObject(module.toString());
    out.writeObject(main);
    
    out.writeInt(paths.length);
    for (String p : paths)
      out.writeObject(p);
  }
  
}
