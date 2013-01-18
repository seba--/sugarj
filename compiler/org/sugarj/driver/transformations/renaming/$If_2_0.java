package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If_2_0 extends Strategy 
{ 
  public static $If_2_0 instance = new $If_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_34, Strategy o_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("If_2_0");
    Fail128:
    { 
      IStrategoTerm w_152 = null;
      IStrategoTerm q_152 = null;
      IStrategoTerm r_152 = null;
      IStrategoTerm x_152 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consIf_2 != ((IStrategoAppl)term).getConstructor())
        break Fail128;
      q_152 = term.getSubterm(0);
      r_152 = term.getSubterm(1);
      IStrategoList annos101 = term.getAnnotations();
      w_152 = annos101;
      term = n_34.invoke(context, q_152);
      if(term == null)
        break Fail128;
      x_152 = term;
      term = o_34.invoke(context, r_152);
      if(term == null)
        break Fail128;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consIf_2, new IStrategoTerm[]{x_152, term}), checkListAnnos(termFactory, w_152));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}