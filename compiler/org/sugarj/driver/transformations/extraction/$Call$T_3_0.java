package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call$T_3_0 extends Strategy 
{ 
  public static $Call$T_3_0 instance = new $Call$T_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_346, Strategy u_346, Strategy v_346)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallT_3_0");
    Fail966:
    { 
      IStrategoTerm t_457 = null;
      IStrategoTerm q_457 = null;
      IStrategoTerm r_457 = null;
      IStrategoTerm s_457 = null;
      IStrategoTerm u_457 = null;
      IStrategoTerm v_457 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consCallT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail966;
      q_457 = term.getSubterm(0);
      r_457 = term.getSubterm(1);
      s_457 = term.getSubterm(2);
      IStrategoList annos208 = term.getAnnotations();
      t_457 = annos208;
      term = t_346.invoke(context, q_457);
      if(term == null)
        break Fail966;
      u_457 = term;
      term = u_346.invoke(context, r_457);
      if(term == null)
        break Fail966;
      v_457 = term;
      term = v_346.invoke(context, s_457);
      if(term == null)
        break Fail966;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consCallT_3, new IStrategoTerm[]{u_457, v_457, term}), checkListAnnos(termFactory, t_457));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}