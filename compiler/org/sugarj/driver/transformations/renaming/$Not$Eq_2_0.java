package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Not$Eq_2_0 extends Strategy 
{ 
  public static $Not$Eq_2_0 instance = new $Not$Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_23, Strategy e_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NotEq_2_0");
    Fail123:
    { 
      IStrategoTerm f_122 = null;
      IStrategoTerm d_122 = null;
      IStrategoTerm e_122 = null;
      IStrategoTerm h_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNotEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail123;
      d_122 = term.getSubterm(0);
      e_122 = term.getSubterm(1);
      IStrategoList annos103 = term.getAnnotations();
      f_122 = annos103;
      term = d_23.invoke(context, d_122);
      if(term == null)
        break Fail123;
      h_122 = term;
      term = e_23.invoke(context, e_122);
      if(term == null)
        break Fail123;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNotEq_2, new IStrategoTerm[]{h_122, term}), checkListAnnos(termFactory, f_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}