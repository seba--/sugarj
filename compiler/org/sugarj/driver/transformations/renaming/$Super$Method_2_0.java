package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Super$Method_2_0 extends Strategy 
{ 
  public static $Super$Method_2_0 instance = new $Super$Method_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_14, Strategy q_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperMethod_2_0");
    Fail21:
    { 
      IStrategoTerm q_100 = null;
      IStrategoTerm o_100 = null;
      IStrategoTerm p_100 = null;
      IStrategoTerm r_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSuperMethod_2 != ((IStrategoAppl)term).getConstructor())
        break Fail21;
      o_100 = term.getSubterm(0);
      p_100 = term.getSubterm(1);
      IStrategoList annos12 = term.getAnnotations();
      q_100 = annos12;
      term = p_14.invoke(context, o_100);
      if(term == null)
        break Fail21;
      r_100 = term;
      term = q_14.invoke(context, p_100);
      if(term == null)
        break Fail21;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSuperMethod_2, new IStrategoTerm[]{r_100, term}), checkListAnnos(termFactory, q_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}