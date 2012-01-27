package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Plus_2_0 extends Strategy 
{ 
  public static $Plus_2_0 instance = new $Plus_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_23, Strategy b_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Plus_2_0");
    Fail128:
    { 
      IStrategoTerm i_123 = null;
      IStrategoTerm g_123 = null;
      IStrategoTerm h_123 = null;
      IStrategoTerm j_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPlus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail128;
      g_123 = term.getSubterm(0);
      h_123 = term.getSubterm(1);
      IStrategoList annos113 = term.getAnnotations();
      i_123 = annos113;
      term = a_23.invoke(context, g_123);
      if(term == null)
        break Fail128;
      j_123 = term;
      term = b_23.invoke(context, h_123);
      if(term == null)
        break Fail128;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPlus_2, new IStrategoTerm[]{j_123, term}), checkListAnnos(termFactory, i_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}