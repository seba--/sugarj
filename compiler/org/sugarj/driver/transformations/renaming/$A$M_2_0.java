package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $A$M_2_0 extends Strategy 
{ 
  public static $A$M_2_0 instance = new $A$M_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_14, Strategy d_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AM_2_0");
    Fail66:
    { 
      IStrategoTerm t_101 = null;
      IStrategoTerm r_101 = null;
      IStrategoTerm s_101 = null;
      IStrategoTerm u_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAM_2 != ((IStrategoAppl)term).getConstructor())
        break Fail66;
      r_101 = term.getSubterm(0);
      s_101 = term.getSubterm(1);
      IStrategoList annos56 = term.getAnnotations();
      t_101 = annos56;
      term = c_14.invoke(context, r_101);
      if(term == null)
        break Fail66;
      u_101 = term;
      term = d_14.invoke(context, s_101);
      if(term == null)
        break Fail66;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAM_2, new IStrategoTerm[]{u_101, term}), checkListAnnos(termFactory, t_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}