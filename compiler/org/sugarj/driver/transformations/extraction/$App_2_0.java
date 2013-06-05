package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $App_2_0 extends Strategy 
{ 
  public static $App_2_0 instance = new $App_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_24, Strategy f_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("App_2_0");
    Fail156:
    { 
      IStrategoTerm j_126 = null;
      IStrategoTerm h_126 = null;
      IStrategoTerm i_126 = null;
      IStrategoTerm k_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consApp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail156;
      h_126 = term.getSubterm(0);
      i_126 = term.getSubterm(1);
      IStrategoList annos125 = term.getAnnotations();
      j_126 = annos125;
      term = e_24.invoke(context, h_126);
      if(term == null)
        break Fail156;
      k_126 = term;
      term = f_24.invoke(context, i_126);
      if(term == null)
        break Fail156;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consApp_2, new IStrategoTerm[]{k_126, term}), checkListAnnos(termFactory, j_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}