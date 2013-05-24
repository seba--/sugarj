package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class module_3_0 extends Strategy 
{ 
  public static module_3_0 instance = new module_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_351, Strategy c_351, Strategy d_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("module_3_0");
    Fail1049:
    { 
      IStrategoTerm z_468 = null;
      IStrategoTerm w_468 = null;
      IStrategoTerm x_468 = null;
      IStrategoTerm y_468 = null;
      IStrategoTerm a_469 = null;
      IStrategoTerm b_469 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consmodule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail1049;
      w_468 = term.getSubterm(0);
      x_468 = term.getSubterm(1);
      y_468 = term.getSubterm(2);
      IStrategoList annos276 = term.getAnnotations();
      z_468 = annos276;
      term = b_351.invoke(context, w_468);
      if(term == null)
        break Fail1049;
      a_469 = term;
      term = c_351.invoke(context, x_468);
      if(term == null)
        break Fail1049;
      b_469 = term;
      term = d_351.invoke(context, y_468);
      if(term == null)
        break Fail1049;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consmodule_3, new IStrategoTerm[]{a_469, b_469, term}), checkListAnnos(termFactory, z_468));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}