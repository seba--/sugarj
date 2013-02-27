package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rule_3_0 extends Strategy 
{ 
  public static $Rule_3_0 instance = new $Rule_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_11, Strategy g_11, Strategy h_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rule_3_0");
    Fail30:
    { 
      IStrategoTerm t_93 = null;
      IStrategoTerm q_93 = null;
      IStrategoTerm r_93 = null;
      IStrategoTerm s_93 = null;
      IStrategoTerm u_93 = null;
      IStrategoTerm w_93 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail30;
      q_93 = term.getSubterm(0);
      r_93 = term.getSubterm(1);
      s_93 = term.getSubterm(2);
      IStrategoList annos20 = term.getAnnotations();
      t_93 = annos20;
      term = f_11.invoke(context, q_93);
      if(term == null)
        break Fail30;
      u_93 = term;
      term = g_11.invoke(context, r_93);
      if(term == null)
        break Fail30;
      w_93 = term;
      term = h_11.invoke(context, s_93);
      if(term == null)
        break Fail30;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRule_3, new IStrategoTerm[]{u_93, w_93, term}), checkListAnnos(termFactory, t_93));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}