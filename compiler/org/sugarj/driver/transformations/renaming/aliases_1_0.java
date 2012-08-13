package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aliases_1_0 extends Strategy 
{ 
  public static aliases_1_0 instance = new aliases_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aliases_1_0");
    Fail33:
    { 
      IStrategoTerm e_107 = null;
      IStrategoTerm d_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consaliases_1 != ((IStrategoAppl)term).getConstructor())
        break Fail33;
      d_107 = term.getSubterm(0);
      IStrategoList annos15 = term.getAnnotations();
      e_107 = annos15;
      term = l_18.invoke(context, d_107);
      if(term == null)
        break Fail33;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consaliases_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}