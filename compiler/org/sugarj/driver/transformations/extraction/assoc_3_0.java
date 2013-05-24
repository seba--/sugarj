package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class assoc_3_0 extends Strategy 
{ 
  public static assoc_3_0 instance = new assoc_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_350, Strategy g_350, Strategy h_350)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("assoc_3_0");
    Fail1036:
    { 
      IStrategoTerm u_466 = null;
      IStrategoTerm r_466 = null;
      IStrategoTerm s_466 = null;
      IStrategoTerm t_466 = null;
      IStrategoTerm v_466 = null;
      IStrategoTerm w_466 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consassoc_3 != ((IStrategoAppl)term).getConstructor())
        break Fail1036;
      r_466 = term.getSubterm(0);
      s_466 = term.getSubterm(1);
      t_466 = term.getSubterm(2);
      IStrategoList annos263 = term.getAnnotations();
      u_466 = annos263;
      term = f_350.invoke(context, r_466);
      if(term == null)
        break Fail1036;
      v_466 = term;
      term = g_350.invoke(context, s_466);
      if(term == null)
        break Fail1036;
      w_466 = term;
      term = h_350.invoke(context, t_466);
      if(term == null)
        break Fail1036;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consassoc_3, new IStrategoTerm[]{v_466, w_466, term}), checkListAnnos(termFactory, u_466));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}