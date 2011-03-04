package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Specification_1_0 extends Strategy 
{ 
  public static $Specification_1_0 instance = new $Specification_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Specification_1_0");
    Fail61:
    { 
      IStrategoTerm j_110 = null;
      IStrategoTerm i_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSpecification_1 != ((IStrategoAppl)term).getConstructor())
        break Fail61;
      i_110 = term.getSubterm(0);
      IStrategoList annos37 = term.getAnnotations();
      j_110 = annos37;
      term = s_18.invoke(context, i_110);
      if(term == null)
        break Fail61;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSpecification_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}