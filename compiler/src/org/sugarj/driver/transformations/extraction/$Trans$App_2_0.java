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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_15, Strategy t_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TransApp_2_0");
    Fail27:
    { 
      IStrategoTerm i_102 = null;
      IStrategoTerm g_102 = null;
      IStrategoTerm h_102 = null;
      IStrategoTerm j_102 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consTransApp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      g_102 = term.getSubterm(0);
      h_102 = term.getSubterm(1);
      IStrategoList annos0 = term.getAnnotations();
      i_102 = annos0;
      term = s_15.invoke(context, g_102);
      if(term == null)
        break Fail27;
      j_102 = term;
      term = t_15.invoke(context, h_102);
      if(term == null)
        break Fail27;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consTransApp_2, new IStrategoTerm[]{j_102, term}), checkListAnnos(termFactory, i_102));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}