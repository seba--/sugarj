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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_46, Strategy s_46, Strategy t_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GuardedLChoice_3_0");
    Fail336:
    { 
      IStrategoTerm s_191 = null;
      IStrategoTerm p_191 = null;
      IStrategoTerm q_191 = null;
      IStrategoTerm r_191 = null;
      IStrategoTerm w_191 = null;
      IStrategoTerm x_191 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consGuardedLChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail336;
      p_191 = term.getSubterm(0);
      q_191 = term.getSubterm(1);
      r_191 = term.getSubterm(2);
      IStrategoList annos282 = term.getAnnotations();
      s_191 = annos282;
      term = r_46.invoke(context, p_191);
      if(term == null)
        break Fail336;
      w_191 = term;
      term = s_46.invoke(context, q_191);
      if(term == null)
        break Fail336;
      x_191 = term;
      term = t_46.invoke(context, r_191);
      if(term == null)
        break Fail336;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consGuardedLChoice_3, new IStrategoTerm[]{w_191, x_191, term}), checkListAnnos(termFactory, s_191));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}