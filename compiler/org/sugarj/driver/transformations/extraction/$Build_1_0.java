package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Build_1_0 extends Strategy 
{ 
  public static $Build_1_0 instance = new $Build_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Build_1_0");
    Fail118:
    { 
      IStrategoTerm c_122 = null;
      IStrategoTerm b_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consBuild_1 != ((IStrategoAppl)term).getConstructor())
        break Fail118;
      b_122 = term.getSubterm(0);
      IStrategoList annos94 = term.getAnnotations();
      c_122 = annos94;
      term = w_22.invoke(context, b_122);
      if(term == null)
        break Fail118;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consBuild_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}