package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Array$Type_1_0 extends Strategy 
{ 
  public static $Array$Type_1_0 instance = new $Array$Type_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArrayType_1_0");
    Fail200:
    { 
      IStrategoTerm r_146 = null;
      IStrategoTerm q_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consArrayType_1 != ((IStrategoAppl)term).getConstructor())
        break Fail200;
      q_146 = term.getSubterm(0);
      IStrategoList annos174 = term.getAnnotations();
      r_146 = annos174;
      term = k_30.invoke(context, q_146);
      if(term == null)
        break Fail200;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consArrayType_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}