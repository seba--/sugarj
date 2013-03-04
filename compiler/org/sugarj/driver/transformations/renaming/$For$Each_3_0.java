package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $For$Each_3_0 extends Strategy 
{ 
  public static $For$Each_3_0 instance = new $For$Each_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_33, Strategy v_33, Strategy w_33)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ForEach_3_0");
    Fail120:
    { 
      IStrategoTerm i_150 = null;
      IStrategoTerm f_150 = null;
      IStrategoTerm g_150 = null;
      IStrategoTerm h_150 = null;
      IStrategoTerm j_150 = null;
      IStrategoTerm k_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consForEach_3 != ((IStrategoAppl)term).getConstructor())
        break Fail120;
      f_150 = term.getSubterm(0);
      g_150 = term.getSubterm(1);
      h_150 = term.getSubterm(2);
      IStrategoList annos93 = term.getAnnotations();
      i_150 = annos93;
      term = u_33.invoke(context, f_150);
      if(term == null)
        break Fail120;
      j_150 = term;
      term = v_33.invoke(context, g_150);
      if(term == null)
        break Fail120;
      k_150 = term;
      term = w_33.invoke(context, h_150);
      if(term == null)
        break Fail120;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consForEach_3, new IStrategoTerm[]{j_150, k_150, term}), checkListAnnos(termFactory, i_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}