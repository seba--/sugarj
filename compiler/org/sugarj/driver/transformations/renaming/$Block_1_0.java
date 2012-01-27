package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Block_1_0 extends Strategy 
{ 
  public static $Block_1_0 instance = new $Block_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Block_1_0");
    Fail67:
    { 
      IStrategoTerm r_111 = null;
      IStrategoTerm q_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consBlock_1 != ((IStrategoAppl)term).getConstructor())
        break Fail67;
      q_111 = term.getSubterm(0);
      IStrategoList annos56 = term.getAnnotations();
      r_111 = annos56;
      term = v_18.invoke(context, q_111);
      if(term == null)
        break Fail67;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consBlock_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}