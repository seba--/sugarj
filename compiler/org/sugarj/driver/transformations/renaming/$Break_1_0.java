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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Break_1_0");
    Fail129:
    { 
      IStrategoTerm u_126 = null;
      IStrategoTerm t_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consBreak_1 != ((IStrategoAppl)term).getConstructor())
        break Fail129;
      t_126 = term.getSubterm(0);
      IStrategoList annos107 = term.getAnnotations();
      u_126 = annos107;
      term = l_25.invoke(context, t_126);
      if(term == null)
        break Fail129;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consBreak_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}