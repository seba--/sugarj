package org.sugarj.editor;

import org.eclipse.core.runtime.IPath;
import org.eclipse.imp.model.ISourceProject;
import org.eclipse.imp.parser.IMessageHandler;
import org.eclipse.imp.parser.IParseController;
import org.strategoxt.imp.runtime.Environment;
import org.strategoxt.imp.runtime.dynamicloading.BadDescriptorException;
import org.strategoxt.imp.runtime.dynamicloading.Descriptor;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.imp.runtime.parser.SGLRParseController;

public class SugarJParseController extends SugarJParseControllerGenerated {
  
  private static Descriptor descriptor;

  private SugarJParser sugarjParser;
  private String projectPath;
  
  @Override
  public IParseController getWrapped() {
    IParseController result = super.getWrapped();
    if (result instanceof SGLRParseController) {
      JSGLRI parser = ((SGLRParseController) result).getParser();
      if (!(parser instanceof SugarJParser)) {
        sugarjParser = new SugarJParser(parser);

        sugarjParser.setProjectPath(projectPath);
        
        ((SGLRParseController) result).setParser(sugarjParser);
      }
    }
    
    return result;
  }
  
  public static synchronized Descriptor getDescriptor() {
    try {
      if (descriptor == null)
        descriptor = new SugarJDescriptor(SugarJParseControllerGenerated.getDescriptor());
      return descriptor;
    } catch (BadDescriptorException e) {
      Environment.logException("Bad descriptor for " + LANGUAGE + " plugin", e);
      throw new RuntimeException("Bad descriptor for " + LANGUAGE + " plugin", e);
    }
  }
  
  @Override
  public void initialize(IPath filePath, ISourceProject project,
      IMessageHandler handler) {
    super.initialize(filePath, project, handler);
    
    if (project != null)
      projectPath = project.getRawProject().getLocation().toString();
    
    if (sugarjParser != null)
      sugarjParser.setProjectPath(projectPath);
  }
}