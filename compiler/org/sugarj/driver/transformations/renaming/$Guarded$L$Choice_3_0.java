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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_16, Strategy h_16, Strategy i_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GuardedLChoice_3_0");
    Fail102:
    { 
      IStrategoTerm w_107 = null;
      IStrategoTerm t_107 = null;
      IStrategoTerm u_107 = null;
      IStrategoTerm v_107 = null;
      IStrategoTerm x_107 = null;
      IStrategoTerm y_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consGuardedLChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail102;
      t_107 = term.getSubterm(0);
      u_107 = term.getSubterm(1);
      v_107 = term.getSubterm(2);
      IStrategoList annos91 = term.getAnnotations();
      w_107 = annos91;
      term = g_16.invoke(context, t_107);
      if(term == null)
        break Fail102;
      x_107 = term;
      term = h_16.invoke(context, u_107);
      if(term == null)
        break Fail102;
      y_107 = term;
      term = i_16.invoke(context, v_107);
      if(term == null)
        break Fail102;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consGuardedLChoice_3, new IStrategoTerm[]{x_107, y_107, term}), checkListAnnos(termFactory, w_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}