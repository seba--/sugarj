package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Local$Var$Dec_3_0 extends Strategy 
{ 
  public static $Local$Var$Dec_3_0 instance = new $Local$Var$Dec_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_26, Strategy l_26, Strategy m_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LocalVarDec_3_0");
    Fail142:
    { 
      IStrategoTerm r_129 = null;
      IStrategoTerm l_129 = null;
      IStrategoTerm o_129 = null;
      IStrategoTerm q_129 = null;
      IStrategoTerm s_129 = null;
      IStrategoTerm t_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLocalVarDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail142;
      l_129 = term.getSubterm(0);
      o_129 = term.getSubterm(1);
      q_129 = term.getSubterm(2);
      IStrategoList annos119 = term.getAnnotations();
      r_129 = annos119;
      term = k_26.invoke(context, l_129);
      if(term == null)
        break Fail142;
      s_129 = term;
      term = l_26.invoke(context, o_129);
      if(term == null)
        break Fail142;
      t_129 = term;
      term = m_26.invoke(context, q_129);
      if(term == null)
        break Fail142;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLocalVarDec_3, new IStrategoTerm[]{s_129, t_129, term}), checkListAnnos(termFactory, r_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}