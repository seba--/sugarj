package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class seq_2_0 extends Strategy 
{ 
  public static seq_2_0 instance = new seq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_25, Strategy l_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("seq_2_0");
    Fail178:
    { 
      IStrategoTerm g_130 = null;
      IStrategoTerm d_130 = null;
      IStrategoTerm f_130 = null;
      IStrategoTerm h_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consseq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail178;
      d_130 = term.getSubterm(0);
      f_130 = term.getSubterm(1);
      IStrategoList annos147 = term.getAnnotations();
      g_130 = annos147;
      term = k_25.invoke(context, d_130);
      if(term == null)
        break Fail178;
      h_130 = term;
      term = l_25.invoke(context, f_130);
      if(term == null)
        break Fail178;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consseq_2, new IStrategoTerm[]{h_130, term}), checkListAnnos(termFactory, g_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}