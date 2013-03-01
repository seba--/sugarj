package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Let_2_0 extends Strategy 
{ 
  public static $Let_2_0 instance = new $Let_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_47, Strategy h_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Let_2_0");
    Fail345:
    { 
      IStrategoTerm o_193 = null;
      IStrategoTerm j_193 = null;
      IStrategoTerm k_193 = null;
      IStrategoTerm p_193 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLet_2 != ((IStrategoAppl)term).getConstructor())
        break Fail345;
      j_193 = term.getSubterm(0);
      k_193 = term.getSubterm(1);
      IStrategoList annos289 = term.getAnnotations();
      o_193 = annos289;
      term = g_47.invoke(context, j_193);
      if(term == null)
        break Fail345;
      p_193 = term;
      term = h_47.invoke(context, k_193);
      if(term == null)
        break Fail345;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLet_2, new IStrategoTerm[]{p_193, term}), checkListAnnos(termFactory, o_193));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}