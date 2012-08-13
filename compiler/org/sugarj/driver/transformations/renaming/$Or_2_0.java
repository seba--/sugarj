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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_27, Strategy x_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Or_2_0");
    Fail164:
    { 
      IStrategoTerm v_136 = null;
      IStrategoTerm t_136 = null;
      IStrategoTerm u_136 = null;
      IStrategoTerm w_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail164;
      t_136 = term.getSubterm(0);
      u_136 = term.getSubterm(1);
      IStrategoList annos139 = term.getAnnotations();
      v_136 = annos139;
      term = w_27.invoke(context, t_136);
      if(term == null)
        break Fail164;
      w_136 = term;
      term = x_27.invoke(context, u_136);
      if(term == null)
        break Fail164;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consOr_2, new IStrategoTerm[]{w_136, term}), checkListAnnos(termFactory, v_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}