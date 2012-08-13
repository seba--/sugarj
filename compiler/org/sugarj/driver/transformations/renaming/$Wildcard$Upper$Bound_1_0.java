package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Wildcard$Upper$Bound_1_0 extends Strategy 
{ 
  public static $Wildcard$Upper$Bound_1_0 instance = new $Wildcard$Upper$Bound_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WildcardUpperBound_1_0");
    Fail210:
    { 
      IStrategoTerm v_148 = null;
      IStrategoTerm u_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consWildcardUpperBound_1 != ((IStrategoAppl)term).getConstructor())
        break Fail210;
      u_148 = term.getSubterm(0);
      IStrategoList annos184 = term.getAnnotations();
      v_148 = annos184;
      term = a_31.invoke(context, u_148);
      if(term == null)
        break Fail210;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consWildcardUpperBound_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}