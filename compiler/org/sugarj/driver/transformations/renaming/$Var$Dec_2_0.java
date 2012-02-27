package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_21, Strategy o_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_2_0");
    Fail100:
    { 
      IStrategoTerm o_117 = null;
      IStrategoTerm m_117 = null;
      IStrategoTerm n_117 = null;
      IStrategoTerm p_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail100;
      m_117 = term.getSubterm(0);
      n_117 = term.getSubterm(1);
      IStrategoList annos81 = term.getAnnotations();
      o_117 = annos81;
      term = n_21.invoke(context, m_117);
      if(term == null)
        break Fail100;
      p_117 = term;
      term = o_21.invoke(context, n_117);
      if(term == null)
        break Fail100;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consVarDec_2, new IStrategoTerm[]{p_117, term}), checkListAnnos(termFactory, o_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}