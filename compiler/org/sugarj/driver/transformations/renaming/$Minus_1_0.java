package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Minus_1_0 extends Strategy 
{ 
  public static $Minus_1_0 instance = new $Minus_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Minus_1_0");
    Fail190:
    { 
      IStrategoTerm z_143 = null;
      IStrategoTerm y_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMinus_1 != ((IStrategoAppl)term).getConstructor())
        break Fail190;
      y_143 = term.getSubterm(0);
      IStrategoList annos165 = term.getAnnotations();
      z_143 = annos165;
      term = s_29.invoke(context, y_143);
      if(term == null)
        break Fail190;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMinus_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}