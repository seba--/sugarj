package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Plus_2_0 extends Strategy 
{ 
  public static $Plus_2_0 instance = new $Plus_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_23, Strategy q_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Plus_2_0");
    Fail131:
    { 
      IStrategoTerm y_123 = null;
      IStrategoTerm w_123 = null;
      IStrategoTerm x_123 = null;
      IStrategoTerm z_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPlus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail131;
      w_123 = term.getSubterm(0);
      x_123 = term.getSubterm(1);
      IStrategoList annos113 = term.getAnnotations();
      y_123 = annos113;
      term = p_23.invoke(context, w_123);
      if(term == null)
        break Fail131;
      z_123 = term;
      term = q_23.invoke(context, x_123);
      if(term == null)
        break Fail131;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPlus_2, new IStrategoTerm[]{z_123, term}), checkListAnnos(termFactory, y_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}