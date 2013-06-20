package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class iter_sep_2_0 extends Strategy 
{ 
  public static iter_sep_2_0 instance = new iter_sep_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_28, Strategy c_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("iter_sep_2_0");
    Fail235:
    { 
      IStrategoTerm a_143 = null;
      IStrategoTerm y_142 = null;
      IStrategoTerm z_142 = null;
      IStrategoTerm b_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consiter_sep_2 != ((IStrategoAppl)term).getConstructor())
        break Fail235;
      y_142 = term.getSubterm(0);
      z_142 = term.getSubterm(1);
      IStrategoList annos193 = term.getAnnotations();
      a_143 = annos193;
      term = b_28.invoke(context, y_142);
      if(term == null)
        break Fail235;
      b_143 = term;
      term = c_28.invoke(context, z_142);
      if(term == null)
        break Fail235;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consiter_sep_2, new IStrategoTerm[]{b_143, term}), checkListAnnos(termFactory, a_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}