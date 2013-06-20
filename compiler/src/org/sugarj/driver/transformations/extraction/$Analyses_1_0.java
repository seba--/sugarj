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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Analyses_1_0");
    Fail35:
    { 
      IStrategoTerm p_103 = null;
      IStrategoTerm o_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consAnalyses_1 != ((IStrategoAppl)term).getConstructor())
        break Fail35;
      o_103 = term.getSubterm(0);
      IStrategoList annos8 = term.getAnnotations();
      p_103 = annos8;
      term = f_16.invoke(context, o_103);
      if(term == null)
        break Fail35;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consAnalyses_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}