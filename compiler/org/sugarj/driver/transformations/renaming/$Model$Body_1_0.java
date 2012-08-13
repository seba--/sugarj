package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Model$Body_1_0 extends Strategy 
{ 
  public static $Model$Body_1_0 instance = new $Model$Body_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ModelBody_1_0");
    Fail57:
    { 
      IStrategoTerm b_111 = null;
      IStrategoTerm v_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consModelBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail57;
      v_110 = term.getSubterm(0);
      IStrategoList annos39 = term.getAnnotations();
      b_111 = annos39;
      term = r_19.invoke(context, v_110);
      if(term == null)
        break Fail57;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consModelBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}