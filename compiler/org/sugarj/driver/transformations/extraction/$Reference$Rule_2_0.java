package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Reference$Rule_2_0 extends Strategy 
{ 
  public static $Reference$Rule_2_0 instance = new $Reference$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_336, Strategy g_336)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ReferenceRule_2_0");
    Fail781:
    { 
      IStrategoTerm r_430 = null;
      IStrategoTerm p_430 = null;
      IStrategoTerm q_430 = null;
      IStrategoTerm s_430 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consReferenceRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail781;
      p_430 = term.getSubterm(0);
      q_430 = term.getSubterm(1);
      IStrategoList annos45 = term.getAnnotations();
      r_430 = annos45;
      term = f_336.invoke(context, p_430);
      if(term == null)
        break Fail781;
      s_430 = term;
      term = g_336.invoke(context, q_430);
      if(term == null)
        break Fail781;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consReferenceRule_2, new IStrategoTerm[]{s_430, term}), checkListAnnos(termFactory, r_430));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}