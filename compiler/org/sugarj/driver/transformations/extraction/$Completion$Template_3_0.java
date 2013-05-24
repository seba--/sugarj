package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Completion$Template_3_0 extends Strategy 
{ 
  public static $Completion$Template_3_0 instance = new $Completion$Template_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_335, Strategy r_335, Strategy s_335)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompletionTemplate_3_0");
    Fail773:
    { 
      IStrategoTerm i_429 = null;
      IStrategoTerm f_429 = null;
      IStrategoTerm g_429 = null;
      IStrategoTerm h_429 = null;
      IStrategoTerm j_429 = null;
      IStrategoTerm k_429 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consCompletionTemplate_3 != ((IStrategoAppl)term).getConstructor())
        break Fail773;
      f_429 = term.getSubterm(0);
      g_429 = term.getSubterm(1);
      h_429 = term.getSubterm(2);
      IStrategoList annos39 = term.getAnnotations();
      i_429 = annos39;
      term = q_335.invoke(context, f_429);
      if(term == null)
        break Fail773;
      j_429 = term;
      term = r_335.invoke(context, g_429);
      if(term == null)
        break Fail773;
      k_429 = term;
      term = s_335.invoke(context, h_429);
      if(term == null)
        break Fail773;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consCompletionTemplate_3, new IStrategoTerm[]{j_429, k_429, term}), checkListAnnos(termFactory, i_429));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}