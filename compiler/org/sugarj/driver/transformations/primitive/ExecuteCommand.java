package org.sugarj.driver.transformations.primitive;

import java.util.List;

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
class ExecuteCommand extends AbstractPrimitive {

  public ExecuteCommand() {
    super("SUGARJ_execute_command", 0, 0);
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    IStrategoTerm cmds = context.current();
    
    if (!ATermCommands.isList(cmds))
      return false;
    List<IStrategoTerm> cmdList = ATermCommands.getList(cmds);
    
    String[] cmdStrings = new String[cmdList.size()];
    for (int i = 0; i < cmdList.size(); i++) {
      if (!ATermCommands.isString(cmdList.get(i)))
        return false;
      cmdStrings[i] = ATermCommands.getString(cmdList.get(i));
    }
    
    String[][] output = new org.sugarj.driver.CommandExecution(true).execute(cmdStrings);
    
    IStrategoTerm[] okOutput = new IStrategoTerm[output[0].length];
    IStrategoTerm[] errOutput = new IStrategoTerm[output[1].length];
    
    for (int i = 0; i < output[0].length; i++)
      okOutput[i] = ATermCommands.makeString(output[0][i], null);
    for (int i = 0; i < output[1].length; i++)
      errOutput[i] = ATermCommands.makeString(output[1][i], null);
    
    IStrategoTerm res = 
      ATermCommands.makeTuple(ATermCommands.makeList("", okOutput), 
                              ATermCommands.makeList("", errOutput));
    context.setCurrent(res);
    return true;
  }
  
}