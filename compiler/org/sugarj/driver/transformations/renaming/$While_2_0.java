package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $While_2_0 extends Strategy 
{ 
  public static $While_2_0 instance = new $While_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_20, Strategy l_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("While_2_0");
    Fail85:
    { 
      IStrategoTerm e_115 = null;
      IStrategoTerm a_115 = null;
      IStrategoTerm d_115 = null;
      IStrategoTerm f_115 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consWhile_2 != ((IStrategoAppl)term).getConstructor())
        break Fail85;
      a_115 = term.getSubterm(0);
      d_115 = term.getSubterm(1);
      IStrategoList annos70 = term.getAnnotations();
      e_115 = annos70;
      term = k_20.invoke(context, a_115);
      if(term == null)
        break Fail85;
      f_115 = term;
      term = l_20.invoke(context, d_115);
      if(term == null)
        break Fail85;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consWhile_2, new IStrategoTerm[]{f_115, term}), checkListAnnos(termFactory, e_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}