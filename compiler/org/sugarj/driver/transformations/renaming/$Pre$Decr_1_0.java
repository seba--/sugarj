package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Pre$Decr_1_0 extends Strategy 
{ 
  public static $Pre$Decr_1_0 instance = new $Pre$Decr_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PreDecr_1_0");
    Fail188:
    { 
      IStrategoTerm s_143 = null;
      IStrategoTerm r_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPreDecr_1 != ((IStrategoAppl)term).getConstructor())
        break Fail188;
      r_143 = term.getSubterm(0);
      IStrategoList annos163 = term.getAnnotations();
      s_143 = annos163;
      term = q_29.invoke(context, r_143);
      if(term == null)
        break Fail188;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPreDecr_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}