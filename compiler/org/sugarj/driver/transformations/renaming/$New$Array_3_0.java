package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $New$Array_3_0 extends Strategy 
{ 
  public static $New$Array_3_0 instance = new $New$Array_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_21, Strategy d_21, Strategy e_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NewArray_3_0");
    Fail80:
    { 
      IStrategoTerm g_115 = null;
      IStrategoTerm d_115 = null;
      IStrategoTerm e_115 = null;
      IStrategoTerm f_115 = null;
      IStrategoTerm h_115 = null;
      IStrategoTerm i_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNewArray_3 != ((IStrategoAppl)term).getConstructor())
        break Fail80;
      d_115 = term.getSubterm(0);
      e_115 = term.getSubterm(1);
      f_115 = term.getSubterm(2);
      IStrategoList annos61 = term.getAnnotations();
      g_115 = annos61;
      term = c_21.invoke(context, d_115);
      if(term == null)
        break Fail80;
      h_115 = term;
      term = d_21.invoke(context, e_115);
      if(term == null)
        break Fail80;
      i_115 = term;
      term = e_21.invoke(context, f_115);
      if(term == null)
        break Fail80;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNewArray_3, new IStrategoTerm[]{h_115, i_115, term}), checkListAnnos(termFactory, g_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}