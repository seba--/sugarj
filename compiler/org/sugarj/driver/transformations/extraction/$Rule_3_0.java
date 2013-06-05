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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_17, Strategy o_17, Strategy p_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rule_3_0");
    Fail55:
    { 
      IStrategoTerm j_107 = null;
      IStrategoTerm e_107 = null;
      IStrategoTerm g_107 = null;
      IStrategoTerm h_107 = null;
      IStrategoTerm k_107 = null;
      IStrategoTerm o_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consRule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail55;
      e_107 = term.getSubterm(0);
      g_107 = term.getSubterm(1);
      h_107 = term.getSubterm(2);
      IStrategoList annos28 = term.getAnnotations();
      j_107 = annos28;
      term = n_17.invoke(context, e_107);
      if(term == null)
        break Fail55;
      k_107 = term;
      term = o_17.invoke(context, g_107);
      if(term == null)
        break Fail55;
      o_107 = term;
      term = p_17.invoke(context, h_107);
      if(term == null)
        break Fail55;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consRule_3, new IStrategoTerm[]{k_107, o_107, term}), checkListAnnos(termFactory, j_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}