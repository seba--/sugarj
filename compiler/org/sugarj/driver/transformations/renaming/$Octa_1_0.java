package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Octa_1_0 extends Strategy 
{ 
  public static $Octa_1_0 instance = new $Octa_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Octa_1_0");
    Fail241:
    { 
      IStrategoTerm q_151 = null;
      IStrategoTerm p_151 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consOcta_1 != ((IStrategoAppl)term).getConstructor())
        break Fail241;
      p_151 = term.getSubterm(0);
      IStrategoList annos204 = term.getAnnotations();
      q_151 = annos204;
      term = z_31.invoke(context, p_151);
      if(term == null)
        break Fail241;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consOcta_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_151));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}