package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Literal_1_0 extends Strategy 
{ 
  public static $Literal_1_0 instance = new $Literal_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Literal_1_0");
    Fail792:
    { 
      IStrategoTerm v_432 = null;
      IStrategoTerm u_432 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consLiteral_1 != ((IStrategoAppl)term).getConstructor())
        break Fail792;
      u_432 = term.getSubterm(0);
      IStrategoList annos56 = term.getAnnotations();
      v_432 = annos56;
      term = c_337.invoke(context, u_432);
      if(term == null)
        break Fail792;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consLiteral_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_432));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}