package org.sugarj.driver.transformations.primitive;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.driver.ATermCommands;

/**
 * Primitive for looking up and loading a model according to the current environment.
 * If successful, this primitive returns the loaded model as a term.
 * 
 * @author seba
 */
class RenameMainArgs extends AbstractPrimitive {

  public RenameMainArgs() {
    super("SUGARJ_rename_main_args", 0, 0);
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    String modelPath = ATermCommands.getString(context.current().getSubterm(0));
    String transPath = ATermCommands.getString(context.current().getSubterm(1));
    
    modelPath = "main-" + modelPath.replace("$", "__").replace("/", "_");
    transPath = "main-" + transPath.replace("$", "__").replace("/", "_");
    
    IStrategoTerm fst = context.getFactory().makeString(modelPath);
    IStrategoTerm snd = context.getFactory().makeString(transPath);
    context.setCurrent(context.getFactory().makeTuple(fst, snd));
    
    return true;
  }
  
}