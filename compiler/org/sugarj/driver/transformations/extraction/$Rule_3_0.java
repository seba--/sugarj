package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_17, Strategy p_17, Strategy q_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rule_3_0");
    Fail44:
    { 
      IStrategoTerm e_107 = null;
      IStrategoTerm b_107 = null;
      IStrategoTerm c_107 = null;
      IStrategoTerm d_107 = null;
      IStrategoTerm g_107 = null;
      IStrategoTerm h_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consRule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail44;
      b_107 = term.getSubterm(0);
      c_107 = term.getSubterm(1);
      d_107 = term.getSubterm(2);
      IStrategoList annos20 = term.getAnnotations();
      e_107 = annos20;
      term = o_17.invoke(context, b_107);
      if(term == null)
        break Fail44;
      g_107 = term;
      term = p_17.invoke(context, c_107);
      if(term == null)
        break Fail44;
      h_107 = term;
      term = q_17.invoke(context, d_107);
      if(term == null)
        break Fail44;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consRule_3, new IStrategoTerm[]{g_107, h_107, term}), checkListAnnos(termFactory, e_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}