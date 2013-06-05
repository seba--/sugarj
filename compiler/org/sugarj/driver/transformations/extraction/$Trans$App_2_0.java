package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Trans$App_2_0 extends Strategy 
{ 
  public static $Trans$App_2_0 instance = new $Trans$App_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_15, Strategy s_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TransApp_2_0");
    Fail27:
    { 
      IStrategoTerm g_102 = null;
      IStrategoTerm e_102 = null;
      IStrategoTerm f_102 = null;
      IStrategoTerm h_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consTransApp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      e_102 = term.getSubterm(0);
      f_102 = term.getSubterm(1);
      IStrategoList annos0 = term.getAnnotations();
      g_102 = annos0;
      term = r_15.invoke(context, e_102);
      if(term == null)
        break Fail27;
      h_102 = term;
      term = s_15.invoke(context, f_102);
      if(term == null)
        break Fail27;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consTransApp_2, new IStrategoTerm[]{h_102, term}), checkListAnnos(termFactory, g_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}