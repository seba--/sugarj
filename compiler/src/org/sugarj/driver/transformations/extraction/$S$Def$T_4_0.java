package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Def$T_4_0 extends Strategy 
{ 
  public static $S$Def$T_4_0 instance = new $S$Def$T_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_19, Strategy n_19, Strategy o_19, Strategy p_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDefT_4_0");
    Fail82:
    { 
      IStrategoTerm y_112 = null;
      IStrategoTerm u_112 = null;
      IStrategoTerm v_112 = null;
      IStrategoTerm w_112 = null;
      IStrategoTerm x_112 = null;
      IStrategoTerm z_112 = null;
      IStrategoTerm a_113 = null;
      IStrategoTerm b_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail82;
      u_112 = term.getSubterm(0);
      v_112 = term.getSubterm(1);
      w_112 = term.getSubterm(2);
      x_112 = term.getSubterm(3);
      IStrategoList annos55 = term.getAnnotations();
      y_112 = annos55;
      term = m_19.invoke(context, u_112);
      if(term == null)
        break Fail82;
      z_112 = term;
      term = n_19.invoke(context, v_112);
      if(term == null)
        break Fail82;
      a_113 = term;
      term = o_19.invoke(context, w_112);
      if(term == null)
        break Fail82;
      b_113 = term;
      term = p_19.invoke(context, x_112);
      if(term == null)
        break Fail82;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSDefT_4, new IStrategoTerm[]{z_112, a_113, b_113, term}), checkListAnnos(termFactory, y_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}