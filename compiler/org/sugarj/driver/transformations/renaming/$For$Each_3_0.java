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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_25, Strategy n_25, Strategy o_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ForEach_3_0");
    Fail130:
    { 
      IStrategoTerm z_126 = null;
      IStrategoTerm w_126 = null;
      IStrategoTerm x_126 = null;
      IStrategoTerm y_126 = null;
      IStrategoTerm a_127 = null;
      IStrategoTerm b_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consForEach_3 != ((IStrategoAppl)term).getConstructor())
        break Fail130;
      w_126 = term.getSubterm(0);
      x_126 = term.getSubterm(1);
      y_126 = term.getSubterm(2);
      IStrategoList annos108 = term.getAnnotations();
      z_126 = annos108;
      term = m_25.invoke(context, w_126);
      if(term == null)
        break Fail130;
      a_127 = term;
      term = n_25.invoke(context, x_126);
      if(term == null)
        break Fail130;
      b_127 = term;
      term = o_25.invoke(context, y_126);
      if(term == null)
        break Fail130;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consForEach_3, new IStrategoTerm[]{a_127, b_127, term}), checkListAnnos(termFactory, z_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}