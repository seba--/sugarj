package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class isect_2_0 extends Strategy 
{ 
  public static isect_2_0 instance = new isect_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_25, Strategy w_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("isect_2_0");
    Fail186:
    { 
      IStrategoTerm d_132 = null;
      IStrategoTerm b_132 = null;
      IStrategoTerm c_132 = null;
      IStrategoTerm e_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consisect_2 != ((IStrategoAppl)term).getConstructor())
        break Fail186;
      b_132 = term.getSubterm(0);
      c_132 = term.getSubterm(1);
      IStrategoList annos155 = term.getAnnotations();
      d_132 = annos155;
      term = v_25.invoke(context, b_132);
      if(term == null)
        break Fail186;
      e_132 = term;
      term = w_25.invoke(context, c_132);
      if(term == null)
        break Fail186;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consisect_2, new IStrategoTerm[]{e_132, term}), checkListAnnos(termFactory, d_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}