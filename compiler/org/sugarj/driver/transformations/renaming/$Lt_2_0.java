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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_23, Strategy o_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lt_2_0");
    Fail128:
    { 
      IStrategoTerm h_123 = null;
      IStrategoTerm f_123 = null;
      IStrategoTerm g_123 = null;
      IStrategoTerm i_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail128;
      f_123 = term.getSubterm(0);
      g_123 = term.getSubterm(1);
      IStrategoList annos108 = term.getAnnotations();
      h_123 = annos108;
      term = n_23.invoke(context, f_123);
      if(term == null)
        break Fail128;
      i_123 = term;
      term = o_23.invoke(context, g_123);
      if(term == null)
        break Fail128;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLt_2, new IStrategoTerm[]{i_123, term}), checkListAnnos(termFactory, h_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}