package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assert$Stm_2_0 extends Strategy 
{ 
  public static $Assert$Stm_2_0 instance = new $Assert$Stm_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_34, Strategy i_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssertStm_2_0");
    Fail125:
    { 
      IStrategoTerm p_151 = null;
      IStrategoTerm n_151 = null;
      IStrategoTerm o_151 = null;
      IStrategoTerm q_151 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssertStm_2 != ((IStrategoAppl)term).getConstructor())
        break Fail125;
      n_151 = term.getSubterm(0);
      o_151 = term.getSubterm(1);
      IStrategoList annos98 = term.getAnnotations();
      p_151 = annos98;
      term = h_34.invoke(context, n_151);
      if(term == null)
        break Fail125;
      q_151 = term;
      term = i_34.invoke(context, o_151);
      if(term == null)
        break Fail125;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssertStm_2, new IStrategoTerm[]{q_151, term}), checkListAnnos(termFactory, p_151));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}