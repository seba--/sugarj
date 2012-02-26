package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lt$Eq_2_0 extends Strategy 
{ 
  public static $Lt$Eq_2_0 instance = new $Lt$Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_23, Strategy c_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LtEq_2_0");
    Fail124:
    { 
      IStrategoTerm p_122 = null;
      IStrategoTerm l_122 = null;
      IStrategoTerm o_122 = null;
      IStrategoTerm q_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLtEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail124;
      l_122 = term.getSubterm(0);
      o_122 = term.getSubterm(1);
      IStrategoList annos106 = term.getAnnotations();
      p_122 = annos106;
      term = b_23.invoke(context, l_122);
      if(term == null)
        break Fail124;
      q_122 = term;
      term = c_23.invoke(context, o_122);
      if(term == null)
        break Fail124;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLtEq_2, new IStrategoTerm[]{q_122, term}), checkListAnnos(termFactory, p_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}