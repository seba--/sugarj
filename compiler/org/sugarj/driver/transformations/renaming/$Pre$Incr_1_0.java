package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Pre$Incr_1_0 extends Strategy 
{ 
  public static $Pre$Incr_1_0 instance = new $Pre$Incr_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PreIncr_1_0");
    Fail189:
    { 
      IStrategoTerm w_143 = null;
      IStrategoTerm v_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPreIncr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail189;
      v_143 = term.getSubterm(0);
      IStrategoList annos164 = term.getAnnotations();
      w_143 = annos164;
      term = r_29.invoke(context, v_143);
      if(term == null)
        break Fail189;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPreIncr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}