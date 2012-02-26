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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_20, Strategy a_21, Strategy b_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LocalVarDec_3_0");
    Fail94:
    { 
      IStrategoTerm s_116 = null;
      IStrategoTerm p_116 = null;
      IStrategoTerm q_116 = null;
      IStrategoTerm r_116 = null;
      IStrategoTerm t_116 = null;
      IStrategoTerm u_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLocalVarDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail94;
      p_116 = term.getSubterm(0);
      q_116 = term.getSubterm(1);
      r_116 = term.getSubterm(2);
      IStrategoList annos78 = term.getAnnotations();
      s_116 = annos78;
      term = z_20.invoke(context, p_116);
      if(term == null)
        break Fail94;
      t_116 = term;
      term = a_21.invoke(context, q_116);
      if(term == null)
        break Fail94;
      u_116 = term;
      term = b_21.invoke(context, r_116);
      if(term == null)
        break Fail94;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLocalVarDec_3, new IStrategoTerm[]{t_116, u_116, term}), checkListAnnos(termFactory, s_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}