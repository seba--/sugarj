package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Not$Eq_2_0 extends Strategy 
{ 
  public static $Not$Eq_2_0 instance = new $Not$Eq_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_22, Strategy w_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NotEq_2_0");
    Fail121:
    { 
      IStrategoTerm x_121 = null;
      IStrategoTerm u_121 = null;
      IStrategoTerm w_121 = null;
      IStrategoTerm y_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNotEq_2 != ((IStrategoAppl)term).getConstructor())
        break Fail121;
      u_121 = term.getSubterm(0);
      w_121 = term.getSubterm(1);
      IStrategoList annos103 = term.getAnnotations();
      x_121 = annos103;
      term = v_22.invoke(context, u_121);
      if(term == null)
        break Fail121;
      y_121 = term;
      term = w_22.invoke(context, w_121);
      if(term == null)
        break Fail121;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNotEq_2, new IStrategoTerm[]{y_121, term}), checkListAnnos(termFactory, x_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}