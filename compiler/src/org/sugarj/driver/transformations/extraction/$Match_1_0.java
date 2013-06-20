package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Match_1_0 extends Strategy 
{ 
  public static $Match_1_0 instance = new $Match_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Match_1_0");
    Fail132:
    { 
      IStrategoTerm q_122 = null;
      IStrategoTerm p_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consMatch_1 != ((IStrategoAppl)term).getConstructor())
        break Fail132;
      p_122 = term.getSubterm(0);
      IStrategoList annos104 = term.getAnnotations();
      q_122 = annos104;
      term = y_22.invoke(context, p_122);
      if(term == null)
        break Fail132;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consMatch_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}