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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_16, Strategy w_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Let_2_0");
    Fail111:
    { 
      IStrategoTerm g_109 = null;
      IStrategoTerm e_109 = null;
      IStrategoTerm f_109 = null;
      IStrategoTerm h_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLet_2 != ((IStrategoAppl)term).getConstructor())
        break Fail111;
      e_109 = term.getSubterm(0);
      f_109 = term.getSubterm(1);
      IStrategoList annos98 = term.getAnnotations();
      g_109 = annos98;
      term = v_16.invoke(context, e_109);
      if(term == null)
        break Fail111;
      h_109 = term;
      term = w_16.invoke(context, f_109);
      if(term == null)
        break Fail111;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLet_2, new IStrategoTerm[]{h_109, term}), checkListAnnos(termFactory, g_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}