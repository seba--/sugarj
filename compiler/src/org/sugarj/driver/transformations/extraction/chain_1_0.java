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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_1_0");
    Fail201:
    { 
      IStrategoTerm f_136 = null;
      IStrategoTerm d_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conschain_1 != ((IStrategoAppl)term).getConstructor())
        break Fail201;
      d_136 = term.getSubterm(0);
      IStrategoList annos165 = term.getAnnotations();
      f_136 = annos165;
      term = l_26.invoke(context, d_136);
      if(term == null)
        break Fail201;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conschain_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}