package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Implements$Dec_1_0 extends Strategy 
{ 
  public static $Implements$Dec_1_0 instance = new $Implements$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImplementsDec_1_0");
    Fail35:
    { 
      IStrategoTerm e_103 = null;
      IStrategoTerm d_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consImplementsDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail35;
      d_103 = term.getSubterm(0);
      IStrategoList annos21 = term.getAnnotations();
      e_103 = annos21;
      term = c_16.invoke(context, d_103);
      if(term == null)
        break Fail35;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consImplementsDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}