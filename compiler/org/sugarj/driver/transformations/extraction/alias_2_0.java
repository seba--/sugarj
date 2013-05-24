package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class alias_2_0 extends Strategy 
{ 
  public static alias_2_0 instance = new alias_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_348, Strategy f_348)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("alias_2_0");
    Fail986:
    { 
      IStrategoTerm g_461 = null;
      IStrategoTerm e_461 = null;
      IStrategoTerm f_461 = null;
      IStrategoTerm h_461 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consalias_2 != ((IStrategoAppl)term).getConstructor())
        break Fail986;
      e_461 = term.getSubterm(0);
      f_461 = term.getSubterm(1);
      IStrategoList annos226 = term.getAnnotations();
      g_461 = annos226;
      term = e_348.invoke(context, e_461);
      if(term == null)
        break Fail986;
      h_461 = term;
      term = f_348.invoke(context, f_461);
      if(term == null)
        break Fail986;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consalias_2, new IStrategoTerm[]{h_461, term}), checkListAnnos(termFactory, g_461));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}