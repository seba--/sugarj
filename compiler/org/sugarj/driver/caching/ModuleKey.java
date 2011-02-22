package org.sugarj.driver.caching;

import java.io.Externalizable;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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

  private boolean checkGet;
  public Map<String, Long> imports;
  public IStrategoTerm body;
  
  /**
   * For deserialization only.
   */
  public ModuleKey() {}
  
  public ModuleKey(Collection<String> dependentFiles, IStrategoTerm module) {
    this.imports = new HashMap<String, Long>();
    this.body = module;
    
    for (String file : dependentFiles)
      imports.put(file, new File(file).lastModified());
  }
  
  public boolean equals(Object o) {
    if (!(o instanceof ModuleKey))
      return false;
    
    ModuleKey k = (ModuleKey) o;
    return body.equals(k.body) && 
      (checkGet ? imports.equals(k.imports) : imports.keySet().equals(k.imports.keySet()));
  }
  
  public int hashCode() {
    return imports.keySet().hashCode() + body.hashCode();
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    imports = new HashMap<String, Long>();
    int entries = in.readInt();
    for (int i = 0; i < entries; i++) {
      imports.put((String) in.readObject(), in.readLong());
    }
    
    body = ATermCommands.atermFromString((String) in.readObject());
  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeInt(imports.size());
    for (Entry<String, Long> entry : imports.entrySet()) {
      out.writeObject(entry.getKey());
      out.writeLong(entry.getValue());
    }
    
    out.writeObject(body.toString());
  }

  void doGet() {
    this.checkGet = true;
  }

  void doPut() {
    this.checkGet = false;
  }
  
}
