package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cast$Prim_2_0 extends Strategy 
{ 
  public static $Cast$Prim_2_0 instance = new $Cast$Prim_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_24, Strategy c_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CastPrim_2_0");
    Fail137:
    { 
      IStrategoTerm n_125 = null;
      IStrategoTerm l_125 = null;
      IStrategoTerm m_125 = null;
      IStrategoTerm o_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCastPrim_2 != ((IStrategoAppl)term).getConstructor())
        break Fail137;
      l_125 = term.getSubterm(0);
      m_125 = term.getSubterm(1);
      IStrategoList annos119 = term.getAnnotations();
      n_125 = annos119;
      term = b_24.invoke(context, l_125);
      if(term == null)
        break Fail137;
      o_125 = term;
      term = c_24.invoke(context, m_125);
      if(term == null)
        break Fail137;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCastPrim_2, new IStrategoTerm[]{o_125, term}), checkListAnnos(termFactory, n_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}