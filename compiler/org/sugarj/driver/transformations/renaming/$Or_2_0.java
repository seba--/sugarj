package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Or_2_0 extends Strategy 
{ 
  public static $Or_2_0 instance = new $Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_36, Strategy f_36)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Or_2_0");
    Fail154:
    { 
      IStrategoTerm r_159 = null;
      IStrategoTerm p_159 = null;
      IStrategoTerm q_159 = null;
      IStrategoTerm s_159 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail154;
      p_159 = term.getSubterm(0);
      q_159 = term.getSubterm(1);
      IStrategoList annos124 = term.getAnnotations();
      r_159 = annos124;
      term = e_36.invoke(context, p_159);
      if(term == null)
        break Fail154;
      s_159 = term;
      term = f_36.invoke(context, q_159);
      if(term == null)
        break Fail154;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOr_2, new IStrategoTerm[]{s_159, term}), checkListAnnos(termFactory, r_159));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}