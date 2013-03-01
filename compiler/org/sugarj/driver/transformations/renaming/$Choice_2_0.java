package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Choice_2_0 extends Strategy 
{ 
  public static $Choice_2_0 instance = new $Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_45, Strategy d_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Choice_2_0");
    Fail307:
    { 
      IStrategoTerm i_187 = null;
      IStrategoTerm g_187 = null;
      IStrategoTerm h_187 = null;
      IStrategoTerm j_187 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail307;
      g_187 = term.getSubterm(0);
      h_187 = term.getSubterm(1);
      IStrategoList annos254 = term.getAnnotations();
      i_187 = annos254;
      term = c_45.invoke(context, g_187);
      if(term == null)
        break Fail307;
      j_187 = term;
      term = d_45.invoke(context, h_187);
      if(term == null)
        break Fail307;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consChoice_2, new IStrategoTerm[]{j_187, term}), checkListAnnos(termFactory, i_187));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}