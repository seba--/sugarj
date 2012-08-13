package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class restrictions_1_0 extends Strategy 
{ 
  public static restrictions_1_0 instance = new restrictions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("restrictions_1_0");
    Fail36:
    { 
      IStrategoTerm s_107 = null;
      IStrategoTerm r_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consrestrictions_1 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      r_107 = term.getSubterm(0);
      IStrategoList annos18 = term.getAnnotations();
      s_107 = annos18;
      term = o_18.invoke(context, r_107);
      if(term == null)
        break Fail36;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consrestrictions_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}