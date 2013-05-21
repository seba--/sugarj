package org.sugarj.driver.transformations.primitive;

import java.util.LinkedList;
import java.util.List;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.library.ssl.StrategoHashMap;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.util.Renaming;

/**
 * Primitive for retrieving the current renamings set in the driver's environment.
 * 
 * @author seba
 */
class CurrentRenamings extends AbstractPrimitive {

  private Environment environment;
  private ATermCommands aterm;
  
  public CurrentRenamings(Environment environment, ATermCommands aterm) {
    super("SUGARJ_current_renamings", 0, 0);
    this.environment = environment;
    this.aterm = aterm;
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    List<Renaming> renamings = environment.getRenamings();
    StrategoHashMap map = new StrategoHashMap(renamings.size(), Math.max(1, renamings.size()));
    
    for (Renaming r : renamings) {
      List<IStrategoTerm> qualTerms = new LinkedList<IStrategoTerm>();
      for (String qual : r.pkgs)
        qualTerms.add(aterm.makeString(qual));
      IStrategoTerm quals = aterm.makeList("Qualifiers", qualTerms);
      IStrategoTerm from = aterm.makeString(r.from);
      IStrategoTerm to = aterm.makeString(r.to);
      
      if (!map.containsKey(from))
        map.put(from, to);
      if (!map.containsKey(aterm.makeTuple(quals, from)))
      map.put(aterm.makeTuple(quals, from), to);
    }
    
    context.setCurrent(aterm.makeAppl("Hashtable", "", 1, map));
    return true;
  }
  
}