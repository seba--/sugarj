package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Remain_2_0 extends Strategy 
{ 
  public static $Remain_2_0 instance = new $Remain_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_23, Strategy s_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Remain_2_0");
    Fail132:
    { 
      IStrategoTerm e_124 = null;
      IStrategoTerm c_124 = null;
      IStrategoTerm d_124 = null;
      IStrategoTerm g_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consRemain_2 != ((IStrategoAppl)term).getConstructor())
        break Fail132;
      c_124 = term.getSubterm(0);
      d_124 = term.getSubterm(1);
      IStrategoList annos114 = term.getAnnotations();
      e_124 = annos114;
      term = r_23.invoke(context, c_124);
      if(term == null)
        break Fail132;
      g_124 = term;
      term = s_23.invoke(context, d_124);
      if(term == null)
        break Fail132;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consRemain_2, new IStrategoTerm[]{g_124, term}), checkListAnnos(termFactory, e_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}