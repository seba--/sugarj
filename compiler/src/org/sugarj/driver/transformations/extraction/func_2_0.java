package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class func_2_0 extends Strategy 
{ 
  public static func_2_0 instance = new func_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_27, Strategy w_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("func_2_0");
    Fail232:
    { 
      IStrategoTerm k_142 = null;
      IStrategoTerm x_141 = null;
      IStrategoTerm y_141 = null;
      IStrategoTerm m_142 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consfunc_2 != ((IStrategoAppl)term).getConstructor())
        break Fail232;
      x_141 = term.getSubterm(0);
      y_141 = term.getSubterm(1);
      IStrategoList annos190 = term.getAnnotations();
      k_142 = annos190;
      term = v_27.invoke(context, x_141);
      if(term == null)
        break Fail232;
      m_142 = term;
      term = w_27.invoke(context, y_141);
      if(term == null)
        break Fail232;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consfunc_2, new IStrategoTerm[]{m_142, term}), checkListAnnos(termFactory, k_142));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}