package org.sugarj.driver.transformations.primitive;

import java.util.List;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.common.ATermCommands;
import org.sugarj.driver.Driver;

public class CurrentImports extends AbstractPrimitive {
  private Driver driver;
  
  public CurrentImports(Driver driver) {
    super("SUGARJ_current_imports", 0, 0);
    this.driver = driver;
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    List<IStrategoTerm> sugaredImportDecls = null; // XXX

    if (sugaredImportDecls == null)
      return false;
    
    IStrategoTerm imports = ATermCommands.makeList("JavaImportDec*", sugaredImportDecls);
    context.setCurrent(imports);
    return true;
  }
    
}
