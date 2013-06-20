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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Specification_1_0");
    Fail73:
    { 
      IStrategoTerm r_110 = null;
      IStrategoTerm q_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSpecification_1 != ((IStrategoAppl)term).getConstructor())
        break Fail73;
      q_110 = term.getSubterm(0);
      IStrategoList annos46 = term.getAnnotations();
      r_110 = annos46;
      term = t_18.invoke(context, q_110);
      if(term == null)
        break Fail73;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSpecification_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}