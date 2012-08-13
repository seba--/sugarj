package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lexical_restrictions_1_0 extends Strategy 
{ 
  public static lexical_restrictions_1_0 instance = new lexical_restrictions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_restrictions_1_0");
    Fail35:
    { 
      IStrategoTerm p_107 = null;
      IStrategoTerm o_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._conslexical_restrictions_1 != ((IStrategoAppl)term).getConstructor())
        break Fail35;
      o_107 = term.getSubterm(0);
      IStrategoList annos17 = term.getAnnotations();
      p_107 = annos17;
      term = n_18.invoke(context, o_107);
      if(term == null)
        break Fail35;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._conslexical_restrictions_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}