package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class production_2_0 extends Strategy 
{ 
  public static production_2_0 instance = new production_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_27, Strategy h_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("production_2_0");
    Fail220:
    { 
      IStrategoTerm x_138 = null;
      IStrategoTerm s_138 = null;
      IStrategoTerm w_138 = null;
      IStrategoTerm y_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consproduction_2 != ((IStrategoAppl)term).getConstructor())
        break Fail220;
      s_138 = term.getSubterm(0);
      w_138 = term.getSubterm(1);
      IStrategoList annos180 = term.getAnnotations();
      x_138 = annos180;
      term = g_27.invoke(context, s_138);
      if(term == null)
        break Fail220;
      y_138 = term;
      term = h_27.invoke(context, w_138);
      if(term == null)
        break Fail220;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consproduction_2, new IStrategoTerm[]{y_138, term}), checkListAnnos(termFactory, x_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}