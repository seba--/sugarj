package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $With$Clause_1_0 extends Strategy 
{ 
  public static $With$Clause_1_0 instance = new $With$Clause_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WithClause_1_0");
    Fail28:
    { 
      IStrategoTerm h_93 = null;
      IStrategoTerm g_93 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consWithClause_1 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      g_93 = term.getSubterm(0);
      IStrategoList annos18 = term.getAnnotations();
      h_93 = annos18;
      term = a_11.invoke(context, g_93);
      if(term == null)
        break Fail28;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consWithClause_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_93));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}