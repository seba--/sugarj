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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_17, Strategy u_17, Strategy v_17, Strategy w_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDefT_4_0");
    Fail46:
    { 
      IStrategoTerm w_107 = null;
      IStrategoTerm s_107 = null;
      IStrategoTerm t_107 = null;
      IStrategoTerm u_107 = null;
      IStrategoTerm v_107 = null;
      IStrategoTerm x_107 = null;
      IStrategoTerm y_107 = null;
      IStrategoTerm z_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consRDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail46;
      s_107 = term.getSubterm(0);
      t_107 = term.getSubterm(1);
      u_107 = term.getSubterm(2);
      v_107 = term.getSubterm(3);
      IStrategoList annos22 = term.getAnnotations();
      w_107 = annos22;
      term = t_17.invoke(context, s_107);
      if(term == null)
        break Fail46;
      x_107 = term;
      term = u_17.invoke(context, t_107);
      if(term == null)
        break Fail46;
      y_107 = term;
      term = v_17.invoke(context, u_107);
      if(term == null)
        break Fail46;
      z_107 = term;
      term = w_17.invoke(context, v_107);
      if(term == null)
        break Fail46;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consRDefT_4, new IStrategoTerm[]{x_107, y_107, z_107, term}), checkListAnnos(termFactory, w_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}