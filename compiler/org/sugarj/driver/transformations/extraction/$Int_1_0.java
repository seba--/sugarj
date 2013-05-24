package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Int_1_0 extends Strategy 
{ 
  public static $Int_1_0 instance = new $Int_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_346)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Int_1_0");
    Fail959:
    { 
      IStrategoTerm q_456 = null;
      IStrategoTerm p_456 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consInt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail959;
      p_456 = term.getSubterm(0);
      IStrategoList annos201 = term.getAnnotations();
      q_456 = annos201;
      term = j_346.invoke(context, p_456);
      if(term == null)
        break Fail959;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consInt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_456));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}