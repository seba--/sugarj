package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Return_1_0 extends Strategy 
{ 
  public static $Return_1_0 instance = new $Return_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Return_1_0");
    Fail81:
    { 
      IStrategoTerm c_114 = null;
      IStrategoTerm b_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consReturn_1 != ((IStrategoAppl)term).getConstructor())
        break Fail81;
      b_114 = term.getSubterm(0);
      IStrategoList annos64 = term.getAnnotations();
      c_114 = annos64;
      term = g_20.invoke(context, b_114);
      if(term == null)
        break Fail81;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consReturn_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}