package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Param_2_0 extends Strategy 
{ 
  public static $Type$Param_2_0 instance = new $Type$Param_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_25, Strategy n_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeParam_2_0");
    Fail160:
    { 
      IStrategoTerm q_129 = null;
      IStrategoTerm o_129 = null;
      IStrategoTerm p_129 = null;
      IStrategoTerm r_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeParam_2 != ((IStrategoAppl)term).getConstructor())
        break Fail160;
      o_129 = term.getSubterm(0);
      p_129 = term.getSubterm(1);
      IStrategoList annos141 = term.getAnnotations();
      q_129 = annos141;
      term = m_25.invoke(context, o_129);
      if(term == null)
        break Fail160;
      r_129 = term;
      term = n_25.invoke(context, p_129);
      if(term == null)
        break Fail160;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeParam_2, new IStrategoTerm[]{r_129, term}), checkListAnnos(termFactory, q_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}