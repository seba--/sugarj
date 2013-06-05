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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Int_1_0");
    Fail171:
    { 
      IStrategoTerm u_128 = null;
      IStrategoTerm t_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consInt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail171;
      t_128 = term.getSubterm(0);
      IStrategoList annos140 = term.getAnnotations();
      u_128 = annos140;
      term = a_25.invoke(context, t_128);
      if(term == null)
        break Fail171;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consInt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}