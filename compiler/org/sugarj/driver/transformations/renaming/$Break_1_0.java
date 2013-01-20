package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Break_1_0 extends Strategy 
{ 
  public static $Break_1_0 instance = new $Break_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_33)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Break_1_0");
    Fail119:
    { 
      IStrategoTerm d_150 = null;
      IStrategoTerm c_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consBreak_1 != ((IStrategoAppl)term).getConstructor())
        break Fail119;
      c_150 = term.getSubterm(0);
      IStrategoList annos92 = term.getAnnotations();
      d_150 = annos92;
      term = t_33.invoke(context, c_150);
      if(term == null)
        break Fail119;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consBreak_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}