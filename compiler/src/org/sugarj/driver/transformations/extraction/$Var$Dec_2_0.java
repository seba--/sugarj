package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var$Dec_2_0 extends Strategy 
{ 
  public static $Var$Dec_2_0 instance = new $Var$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_18, Strategy z_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_2_0");
    Fail77:
    { 
      IStrategoTerm m_111 = null;
      IStrategoTerm k_111 = null;
      IStrategoTerm l_111 = null;
      IStrategoTerm p_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail77;
      k_111 = term.getSubterm(0);
      l_111 = term.getSubterm(1);
      IStrategoList annos50 = term.getAnnotations();
      m_111 = annos50;
      term = y_18.invoke(context, k_111);
      if(term == null)
        break Fail77;
      p_111 = term;
      term = z_18.invoke(context, l_111);
      if(term == null)
        break Fail77;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consVarDec_2, new IStrategoTerm[]{p_111, term}), checkListAnnos(termFactory, m_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}