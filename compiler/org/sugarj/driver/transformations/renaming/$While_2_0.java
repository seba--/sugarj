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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_34, Strategy e_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("While_2_0");
    Fail123:
    { 
      IStrategoTerm c_151 = null;
      IStrategoTerm a_151 = null;
      IStrategoTerm b_151 = null;
      IStrategoTerm f_151 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consWhile_2 != ((IStrategoAppl)term).getConstructor())
        break Fail123;
      a_151 = term.getSubterm(0);
      b_151 = term.getSubterm(1);
      IStrategoList annos96 = term.getAnnotations();
      c_151 = annos96;
      term = d_34.invoke(context, a_151);
      if(term == null)
        break Fail123;
      f_151 = term;
      term = e_34.invoke(context, b_151);
      if(term == null)
        break Fail123;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consWhile_2, new IStrategoTerm[]{f_151, term}), checkListAnnos(termFactory, c_151));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}