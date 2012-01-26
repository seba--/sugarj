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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssertStm_1_0");
    Fail85:
    { 
      IStrategoTerm a_115 = null;
      IStrategoTerm z_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssertStm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail85;
      z_114 = term.getSubterm(0);
      IStrategoList annos73 = term.getAnnotations();
      a_115 = annos73;
      term = b_20.invoke(context, z_114);
      if(term == null)
        break Fail85;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssertStm_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}