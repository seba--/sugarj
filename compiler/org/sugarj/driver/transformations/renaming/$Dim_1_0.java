package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dim_1_0 extends Strategy 
{ 
  public static $Dim_1_0 instance = new $Dim_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Dim_1_0");
    Fail32:
    { 
      IStrategoTerm r_102 = null;
      IStrategoTerm q_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDim_1 != ((IStrategoAppl)term).getConstructor())
        break Fail32;
      q_102 = term.getSubterm(0);
      IStrategoList annos18 = term.getAnnotations();
      r_102 = annos18;
      term = x_15.invoke(context, q_102);
      if(term == null)
        break Fail32;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDim_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}