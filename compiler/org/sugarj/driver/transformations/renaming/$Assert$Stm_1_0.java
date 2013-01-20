package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assert$Stm_1_0 extends Strategy 
{ 
  public static $Assert$Stm_1_0 instance = new $Assert$Stm_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssertStm_1_0");
    Fail126:
    { 
      IStrategoTerm v_151 = null;
      IStrategoTerm u_151 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssertStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail126;
      u_151 = term.getSubterm(0);
      IStrategoList annos99 = term.getAnnotations();
      v_151 = annos99;
      term = j_34.invoke(context, u_151);
      if(term == null)
        break Fail126;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssertStm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_151));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}