package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_16, Strategy e_16, Strategy f_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GuardedLChoice_3_0");
    Fail102:
    { 
      IStrategoTerm t_107 = null;
      IStrategoTerm q_107 = null;
      IStrategoTerm r_107 = null;
      IStrategoTerm s_107 = null;
      IStrategoTerm u_107 = null;
      IStrategoTerm v_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consGuardedLChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail102;
      q_107 = term.getSubterm(0);
      r_107 = term.getSubterm(1);
      s_107 = term.getSubterm(2);
      IStrategoList annos91 = term.getAnnotations();
      t_107 = annos91;
      term = d_16.invoke(context, q_107);
      if(term == null)
        break Fail102;
      u_107 = term;
      term = e_16.invoke(context, r_107);
      if(term == null)
        break Fail102;
      v_107 = term;
      term = f_16.invoke(context, s_107);
      if(term == null)
        break Fail102;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consGuardedLChoice_3, new IStrategoTerm[]{u_107, v_107, term}), checkListAnnos(termFactory, t_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}