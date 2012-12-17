package org.sugarj.driver.transformations.primitive;

import java.io.IOException;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.sugarj.driver.ATermCommands;
import org.sugarj.driver.Driver;
import org.sugarj.driver.Environment;
import org.sugarj.driver.FileCommands;
import org.sugarj.driver.ModuleSystemCommands;
import org.sugarj.driver.Origin;
import org.sugarj.driver.path.AbsolutePath;
import org.sugarj.driver.path.Path;
import org.sugarj.driver.path.RelativePath;
import org.sugarj.driver.path.RelativeSourceLocationPath;
import org.sugarj.util.Renaming;

/**
 * Primitive for looking up and loading a model according to the current environment.
 * If successful, this primitive returns the loaded model as a term.
 * 
 * @author seba
 */
class WriteTransformed extends AbstractPrimitive {

  private Driver driver;
  private Environment environment;
  private boolean generateFiles;
  
  public WriteTransformed(Driver driver, Environment environment, boolean generateFiles) {
    super("SUGARJ_write", 0, 2);
    this.driver = driver;
    this.environment = environment;
    this.generateFiles = generateFiles;
  }

  @Override
  public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars) throws InterpreterException {
    IStrategoTerm generatedModel = context.current();
    
    String modelPath = ATermCommands.getString(tvars[0]);
    
    IStrategoTerm transformationsTerm = tvars[1];
    RelativePath transformationPath = new RelativePath(ATermCommands.getString(transformationsTerm));
    
    RelativeSourceLocationPath source = ModuleSystemCommands.getTransformedModelSourceFilePath(modelPath, transformationPath, environment);
    try {
      Renaming ren = new Renaming(modelPath, source.getRelativePath());
      generatedModel = ATermCommands.renameDeclarations(generatedModel, ren, driver.getRenamingContext());

      if (generateFiles)
        ATermCommands.atermToFile(generatedModel, source);
    } catch (IOException e) {
      driver.setErrorMessage(e.getLocalizedMessage());
    } catch (InvalidParseTableException e) {
      driver.setErrorMessage(e.getLocalizedMessage());
    }
    
    try {
      RelativePath model = ModuleSystemCommands.searchFile(modelPath, ".model", environment);
      Origin origin = ModuleSystemCommands.markGenerated(source, environment, model, transformationPath);
      if (generateFiles) {
        Path p = new AbsolutePath(FileCommands.dropExtension(source.getAbsolutePath()) + ".origin");
        origin.write(p);
      }
    } catch (IOException e) {
      driver.setErrorMessage(e.getLocalizedMessage());
    } catch (ClassNotFoundException e) {
      driver.setErrorMessage(e.getLocalizedMessage());
    }
    
    return true;
  }
  
}