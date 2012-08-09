package org.sugarj.driver.transformations.primitive;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.driver.ATermCommands;
import org.sugarj.driver.Driver;
import org.sugarj.driver.Environment;
import org.sugarj.driver.ModuleSystemCommands;
import org.sugarj.driver.Result;
import org.sugarj.driver.path.Path;
import org.sugarj.driver.path.RelativePath;
import org.sugarj.driver.path.RelativeSourceLocationPath;

/**
 * Primitive for looking up and loading a model according to the current environment.
 * If successful, this primitive returns the loaded model as a term.
 * 
 * @author seba
 */
class CompileTransformed extends AbstractPrimitive {

  private Environment environment;
  
  public CompileTransformed(Environment environment) {
    super("SUGARJ_compile", 0, 3);
    this.environment = environment;
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    IStrategoTerm generatedModel = tvars[0];
    String modelPath = ATermCommands.getString(tvars[1]);
    
    List<RelativePath> transformationPaths = new LinkedList<RelativePath>(); 
    for (IStrategoTerm pathTerm : ATermCommands.getList(tvars[2])) {
      String transPath = ATermCommands.getString(pathTerm);
      transformationPaths.add(new RelativePath(transPath));
    }
    
    RelativeSourceLocationPath source = ModuleSystemCommands.getTransformedModelSourceFilePath(modelPath, transformationPaths, environment);
    
    Result res;
    try {
      res = Driver.compile(generatedModel, source, null, new LinkedHashMap<Path, Driver>());
    } catch (Exception e) {
      return false;
    }
    
    if (res == null || !res.getCollectedErrors().isEmpty() || !res.getParseErrors().isEmpty())
      return false;
    
    return true;
  }
  
}