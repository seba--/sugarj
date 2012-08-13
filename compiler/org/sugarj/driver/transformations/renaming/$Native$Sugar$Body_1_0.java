package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Native$Sugar$Body_1_0 extends Strategy 
{ 
  public static $Native$Sugar$Body_1_0 instance = new $Native$Sugar$Body_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NativeSugarBody_1_0");
    Fail18:
    { 
      IStrategoTerm q_104 = null;
      IStrategoTerm p_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNativeSugarBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail18;
      p_104 = term.getSubterm(0);
      IStrategoList annos0 = term.getAnnotations();
      q_104 = annos0;
      term = n_17.invoke(context, p_104);
      if(term == null)
        break Fail18;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNativeSugarBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}