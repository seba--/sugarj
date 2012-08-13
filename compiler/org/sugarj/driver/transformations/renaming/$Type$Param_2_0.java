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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_30, Strategy y_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeParam_2_0");
    Fail208:
    { 
      IStrategoTerm o_148 = null;
      IStrategoTerm m_148 = null;
      IStrategoTerm n_148 = null;
      IStrategoTerm p_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeParam_2 != ((IStrategoAppl)term).getConstructor())
        break Fail208;
      m_148 = term.getSubterm(0);
      n_148 = term.getSubterm(1);
      IStrategoList annos182 = term.getAnnotations();
      o_148 = annos182;
      term = x_30.invoke(context, m_148);
      if(term == null)
        break Fail208;
      p_148 = term;
      term = y_30.invoke(context, n_148);
      if(term == null)
        break Fail208;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeParam_2, new IStrategoTerm[]{p_148, term}), checkListAnnos(termFactory, o_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}