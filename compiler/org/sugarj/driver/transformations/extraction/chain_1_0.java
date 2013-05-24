package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class chain_1_0 extends Strategy 
{ 
  public static chain_1_0 instance = new chain_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_350)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_1_0");
    Fail1035:
    { 
      IStrategoTerm p_466 = null;
      IStrategoTerm o_466 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conschain_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1035;
      o_466 = term.getSubterm(0);
      IStrategoList annos262 = term.getAnnotations();
      p_466 = annos262;
      term = e_350.invoke(context, o_466);
      if(term == null)
        break Fail1035;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conschain_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_466));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}