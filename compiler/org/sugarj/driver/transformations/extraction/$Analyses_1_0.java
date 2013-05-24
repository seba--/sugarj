package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Analyses_1_0 extends Strategy 
{ 
  public static $Analyses_1_0 instance = new $Analyses_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Analyses_1_0");
    Fail752:
    { 
      IStrategoTerm p_426 = null;
      IStrategoTerm o_426 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consAnalyses_1 != ((IStrategoAppl)term).getConstructor())
        break Fail752;
      o_426 = term.getSubterm(0);
      IStrategoList annos24 = term.getAnnotations();
      p_426 = annos24;
      term = p_334.invoke(context, o_426);
      if(term == null)
        break Fail752;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consAnalyses_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_426));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}