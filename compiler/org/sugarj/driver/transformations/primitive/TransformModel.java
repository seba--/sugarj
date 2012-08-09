package org.sugarj.driver.transformations.primitive;

import java.util.LinkedHashMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.driver.ATermCommands;
import org.sugarj.driver.Driver;
import org.sugarj.driver.Environment;
import org.sugarj.driver.Result;
import org.sugarj.driver.path.Path;
import org.sugarj.driver.path.RelativeSourceLocationPath;
import org.sugarj.driver.path.SourceLocation;

/**
 * Primitive for looking up and loading a model according to the current environment.
 * If successful, this primitive returns the loaded model as a term.
 * 
 * @author seba
 */
class TransformModel extends AbstractPrimitive {

  private Environment environment;
  private IProgressMonitor monitor;
  
  public TransformModel(Environment environment, IProgressMonitor monitor) {
    super("SUGARJ_transform_model", 1, 2);
    this.environment = environment;
    this.monitor = monitor;
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    Strategy transformation = svars[0];
    String modelPath = ATermCommands.getString(tvars[0]);
    String transformationPath = ATermCommands.getString(tvars[1]);
    
    IStrategoTerm model = context.current();
    context.setCurrent(model);
    boolean ok = transformation.evaluate(context);
    if (!ok)
      return false;
    IStrategoTerm transformedModel = context.current();
    
    RelativeSourceLocationPath source = new RelativeSourceLocationPath(new SourceLocation(environment.bin, environment), 
                                                                       modelPath + "$" + transformationPath.replace('/', '_') + ".model");
    
    Result res;
    try {
      res = Driver.compile(transformedModel, source, monitor, new LinkedHashMap<Path, Driver>());
    } catch (Exception e) {
      return false;
    }
    
    if (res == null || !res.getCollectedErrors().isEmpty() || !res.getParseErrors().isEmpty())
      return false;
    
    return true;
  }
  
}