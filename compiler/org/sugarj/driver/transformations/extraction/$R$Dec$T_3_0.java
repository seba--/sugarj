package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Dec$T_3_0 extends Strategy 
{ 
  public static $R$Dec$T_3_0 instance = new $R$Dec$T_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_16, Strategy g_16, Strategy h_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDecT_3_0");
    Fail36:
    { 
      IStrategoTerm s_103 = null;
      IStrategoTerm p_103 = null;
      IStrategoTerm q_103 = null;
      IStrategoTerm r_103 = null;
      IStrategoTerm t_103 = null;
      IStrategoTerm u_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consRDecT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      p_103 = term.getSubterm(0);
      q_103 = term.getSubterm(1);
      r_103 = term.getSubterm(2);
      IStrategoList annos9 = term.getAnnotations();
      s_103 = annos9;
      term = f_16.invoke(context, p_103);
      if(term == null)
        break Fail36;
      t_103 = term;
      term = g_16.invoke(context, q_103);
      if(term == null)
        break Fail36;
      u_103 = term;
      term = h_16.invoke(context, r_103);
      if(term == null)
        break Fail36;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consRDecT_3, new IStrategoTerm[]{t_103, u_103, term}), checkListAnnos(termFactory, s_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}