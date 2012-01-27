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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_19, Strategy a_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssertStm_2_0");
    Fail84:
    { 
      IStrategoTerm w_114 = null;
      IStrategoTerm t_114 = null;
      IStrategoTerm v_114 = null;
      IStrategoTerm x_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssertStm_2 != ((IStrategoAppl)term).getConstructor())
        break Fail84;
      t_114 = term.getSubterm(0);
      v_114 = term.getSubterm(1);
      IStrategoList annos72 = term.getAnnotations();
      w_114 = annos72;
      term = z_19.invoke(context, t_114);
      if(term == null)
        break Fail84;
      x_114 = term;
      term = a_20.invoke(context, v_114);
      if(term == null)
        break Fail84;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssertStm_2, new IStrategoTerm[]{x_114, term}), checkListAnnos(termFactory, w_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}