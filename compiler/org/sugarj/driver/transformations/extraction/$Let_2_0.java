package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Let_2_0 extends Strategy 
{ 
  public static $Let_2_0 instance = new $Let_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_23, Strategy f_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Let_2_0");
    Fail124:
    { 
      IStrategoTerm a_123 = null;
      IStrategoTerm y_122 = null;
      IStrategoTerm z_122 = null;
      IStrategoTerm b_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consLet_2 != ((IStrategoAppl)term).getConstructor())
        break Fail124;
      y_122 = term.getSubterm(0);
      z_122 = term.getSubterm(1);
      IStrategoList annos98 = term.getAnnotations();
      a_123 = annos98;
      term = e_23.invoke(context, y_122);
      if(term == null)
        break Fail124;
      b_123 = term;
      term = f_23.invoke(context, z_122);
      if(term == null)
        break Fail124;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consLet_2, new IStrategoTerm[]{b_123, term}), checkListAnnos(termFactory, a_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}