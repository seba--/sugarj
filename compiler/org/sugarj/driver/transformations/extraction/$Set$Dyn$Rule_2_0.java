package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Set$Dyn$Rule_2_0 extends Strategy 
{ 
  public static $Set$Dyn$Rule_2_0 instance = new $Set$Dyn$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_339, Strategy a_340)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRule_2_0");
    Fail859:
    { 
      IStrategoTerm f_440 = null;
      IStrategoTerm d_440 = null;
      IStrategoTerm e_440 = null;
      IStrategoTerm g_440 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSetDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail859;
      d_440 = term.getSubterm(0);
      e_440 = term.getSubterm(1);
      IStrategoList annos105 = term.getAnnotations();
      f_440 = annos105;
      term = z_339.invoke(context, d_440);
      if(term == null)
        break Fail859;
      g_440 = term;
      term = a_340.invoke(context, e_440);
      if(term == null)
        break Fail859;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSetDynRule_2, new IStrategoTerm[]{g_440, term}), checkListAnnos(termFactory, f_440));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}