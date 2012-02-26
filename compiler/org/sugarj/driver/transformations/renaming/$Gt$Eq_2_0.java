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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_22, Strategy a_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("GtEq_2_0");
    Fail123:
    { 
      IStrategoTerm i_122 = null;
      IStrategoTerm f_122 = null;
      IStrategoTerm h_122 = null;
      IStrategoTerm j_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consGtEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail123;
      f_122 = term.getSubterm(0);
      h_122 = term.getSubterm(1);
      IStrategoList annos105 = term.getAnnotations();
      i_122 = annos105;
      term = z_22.invoke(context, f_122);
      if(term == null)
        break Fail123;
      j_122 = term;
      term = a_23.invoke(context, h_122);
      if(term == null)
        break Fail123;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consGtEq_2, new IStrategoTerm[]{j_122, term}), checkListAnnos(termFactory, i_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}