package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $L$Rule_1_0 extends Strategy 
{ 
  public static $L$Rule_1_0 instance = new $L$Rule_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LRule_1_0");
    Fail88:
    { 
      IStrategoTerm v_116 = null;
      IStrategoTerm u_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consLRule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail88;
      u_116 = term.getSubterm(0);
      IStrategoList annos64 = term.getAnnotations();
      v_116 = annos64;
      term = c_21.invoke(context, u_116);
      if(term == null)
        break Fail88;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consLRule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}