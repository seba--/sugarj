package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Var_1_0 extends Strategy 
{ 
  public static $S$Var_1_0 instance = new $S$Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SVar_1_0");
    Fail112:
    { 
      IStrategoTerm h_109 = null;
      IStrategoTerm g_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail112;
      g_109 = term.getSubterm(0);
      IStrategoList annos99 = term.getAnnotations();
      h_109 = annos99;
      term = u_16.invoke(context, g_109);
      if(term == null)
        break Fail112;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}