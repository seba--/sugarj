package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Semantic$Provider_1_0 extends Strategy 
{ 
  public static $Semantic$Provider_1_0 instance = new $Semantic$Provider_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SemanticProvider_1_0");
    Fail816:
    { 
      IStrategoTerm h_434 = null;
      IStrategoTerm g_434 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSemanticProvider_1 != ((IStrategoAppl)term).getConstructor())
        break Fail816;
      g_434 = term.getSubterm(0);
      IStrategoList annos64 = term.getAnnotations();
      h_434 = annos64;
      term = r_337.invoke(context, g_434);
      if(term == null)
        break Fail816;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSemanticProvider_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_434));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}