package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_22, Strategy r_22, Strategy s_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GuardedLChoice_3_0");
    Fail128:
    { 
      IStrategoTerm u_121 = null;
      IStrategoTerm q_121 = null;
      IStrategoTerm s_121 = null;
      IStrategoTerm t_121 = null;
      IStrategoTerm w_121 = null;
      IStrategoTerm x_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consGuardedLChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail128;
      q_121 = term.getSubterm(0);
      s_121 = term.getSubterm(1);
      t_121 = term.getSubterm(2);
      IStrategoList annos100 = term.getAnnotations();
      u_121 = annos100;
      term = q_22.invoke(context, q_121);
      if(term == null)
        break Fail128;
      w_121 = term;
      term = r_22.invoke(context, s_121);
      if(term == null)
        break Fail128;
      x_121 = term;
      term = s_22.invoke(context, t_121);
      if(term == null)
        break Fail128;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consGuardedLChoice_3, new IStrategoTerm[]{w_121, x_121, term}), checkListAnnos(termFactory, u_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}