package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lt_2_0 extends Strategy 
{ 
  public static $Lt_2_0 instance = new $Lt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_22, Strategy r_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lt_2_0");
    Fail123:
    { 
      IStrategoTerm h_122 = null;
      IStrategoTerm e_122 = null;
      IStrategoTerm f_122 = null;
      IStrategoTerm i_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail123;
      e_122 = term.getSubterm(0);
      f_122 = term.getSubterm(1);
      IStrategoList annos108 = term.getAnnotations();
      h_122 = annos108;
      term = q_22.invoke(context, e_122);
      if(term == null)
        break Fail123;
      i_122 = term;
      term = r_22.invoke(context, f_122);
      if(term == null)
        break Fail123;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLt_2, new IStrategoTerm[]{i_122, term}), checkListAnnos(termFactory, h_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}