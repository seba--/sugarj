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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Return_1_0");
    Fail79:
    { 
      IStrategoTerm u_113 = null;
      IStrategoTerm t_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consReturn_1 != ((IStrategoAppl)term).getConstructor())
        break Fail79;
      t_113 = term.getSubterm(0);
      IStrategoList annos64 = term.getAnnotations();
      u_113 = annos64;
      term = y_19.invoke(context, t_113);
      if(term == null)
        break Fail79;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consReturn_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}