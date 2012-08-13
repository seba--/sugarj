package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gt$Eq_2_0 extends Strategy 
{ 
  public static $Gt$Eq_2_0 instance = new $Gt$Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_28, Strategy l_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GtEq_2_0");
    Fail171:
    { 
      IStrategoTerm k_138 = null;
      IStrategoTerm i_138 = null;
      IStrategoTerm j_138 = null;
      IStrategoTerm l_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consGtEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail171;
      i_138 = term.getSubterm(0);
      j_138 = term.getSubterm(1);
      IStrategoList annos146 = term.getAnnotations();
      k_138 = annos146;
      term = k_28.invoke(context, i_138);
      if(term == null)
        break Fail171;
      l_138 = term;
      term = l_28.invoke(context, j_138);
      if(term == null)
        break Fail171;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consGtEq_2, new IStrategoTerm[]{l_138, term}), checkListAnnos(termFactory, k_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}