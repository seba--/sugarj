package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Def$T_4_0 extends Strategy 
{ 
  public static $R$Def$T_4_0 instance = new $R$Def$T_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_17, Strategy t_17, Strategy u_17, Strategy v_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDefT_4_0");
    Fail57:
    { 
      IStrategoTerm z_107 = null;
      IStrategoTerm v_107 = null;
      IStrategoTerm w_107 = null;
      IStrategoTerm x_107 = null;
      IStrategoTerm y_107 = null;
      IStrategoTerm a_108 = null;
      IStrategoTerm b_108 = null;
      IStrategoTerm c_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consRDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail57;
      v_107 = term.getSubterm(0);
      w_107 = term.getSubterm(1);
      x_107 = term.getSubterm(2);
      y_107 = term.getSubterm(3);
      IStrategoList annos30 = term.getAnnotations();
      z_107 = annos30;
      term = s_17.invoke(context, v_107);
      if(term == null)
        break Fail57;
      a_108 = term;
      term = t_17.invoke(context, w_107);
      if(term == null)
        break Fail57;
      b_108 = term;
      term = u_17.invoke(context, x_107);
      if(term == null)
        break Fail57;
      c_108 = term;
      term = v_17.invoke(context, y_107);
      if(term == null)
        break Fail57;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consRDefT_4, new IStrategoTerm[]{a_108, b_108, c_108, term}), checkListAnnos(termFactory, z_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}