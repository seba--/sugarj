package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Guarded$L$Choice_3_0 extends Strategy 
{ 
  public static $Guarded$L$Choice_3_0 instance = new $Guarded$L$Choice_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_16, Strategy f_16, Strategy g_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GuardedLChoice_3_0");
    Fail98:
    { 
      IStrategoTerm u_107 = null;
      IStrategoTerm r_107 = null;
      IStrategoTerm s_107 = null;
      IStrategoTerm t_107 = null;
      IStrategoTerm v_107 = null;
      IStrategoTerm w_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consGuardedLChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail98;
      r_107 = term.getSubterm(0);
      s_107 = term.getSubterm(1);
      t_107 = term.getSubterm(2);
      IStrategoList annos91 = term.getAnnotations();
      u_107 = annos91;
      term = e_16.invoke(context, r_107);
      if(term == null)
        break Fail98;
      v_107 = term;
      term = f_16.invoke(context, s_107);
      if(term == null)
        break Fail98;
      w_107 = term;
      term = g_16.invoke(context, t_107);
      if(term == null)
        break Fail98;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consGuardedLChoice_3, new IStrategoTerm[]{v_107, w_107, term}), checkListAnnos(termFactory, u_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}