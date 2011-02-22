package org.sugarj.editor;

import org.eclipse.imp.parser.IParseController;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.imp.runtime.parser.SGLRParseController;

public class SugarJParseController extends SugarJParseControllerGenerated {

  @Override
  public IParseController getWrapped() {
    IParseController result = super.getWrapped();
    if (result instanceof SGLRParseController) {
      JSGLRI parser = ((SGLRParseController) result).getParser();
      if (!(parser instanceof SugarJParser)) {
        ((SGLRParseController) result).setParser(new SugarJParser(parser));
      }
    }
    
    return result;
  }
}