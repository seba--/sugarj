package org.sugarj.editor;

import org.eclipse.core.runtime.IPath;
import org.eclipse.imp.model.ISourceProject;
import org.eclipse.imp.parser.IMessageHandler;
import org.eclipse.imp.parser.IParseController;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.imp.runtime.parser.SGLRParseController;

public class SugarJParseController extends SugarJParseControllerGenerated {

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