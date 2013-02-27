package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call$Dynamic_3_0 extends Strategy 
{ 
  public static $Call$Dynamic_3_0 instance = new $Call$Dynamic_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_16, Strategy q_16, Strategy r_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallDynamic_3_0");
    Fail109:
    { 
      IStrategoTerm t_108 = null;
      IStrategoTerm q_108 = null;
      IStrategoTerm r_108 = null;
      IStrategoTerm s_108 = null;
      IStrategoTerm u_108 = null;
      IStrategoTerm v_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCallDynamic_3 != ((IStrategoAppl)term).getConstructor())
        break Fail109;
      q_108 = term.getSubterm(0);
      r_108 = term.getSubterm(1);
      s_108 = term.getSubterm(2);
      IStrategoList annos96 = term.getAnnotations();
      t_108 = annos96;
      term = p_16.invoke(context, q_108);
      if(term == null)
        break Fail109;
      u_108 = term;
      term = q_16.invoke(context, r_108);
      if(term == null)
        break Fail109;
      v_108 = term;
      term = r_16.invoke(context, s_108);
      if(term == null)
        break Fail109;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCallDynamic_3, new IStrategoTerm[]{u_108, v_108, term}), checkListAnnos(termFactory, t_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}