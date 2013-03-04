package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $A$M_2_0 extends Strategy 
{ 
  public static $A$M_2_0 instance = new $A$M_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_44, Strategy p_44)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AM_2_0");
    Fail301:
    { 
      IStrategoTerm y_185 = null;
      IStrategoTerm w_185 = null;
      IStrategoTerm x_185 = null;
      IStrategoTerm z_185 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAM_2 != ((IStrategoAppl)term).getConstructor())
        break Fail301;
      w_185 = term.getSubterm(0);
      x_185 = term.getSubterm(1);
      IStrategoList annos248 = term.getAnnotations();
      y_185 = annos248;
      term = o_44.invoke(context, w_185);
      if(term == null)
        break Fail301;
      z_185 = term;
      term = p_44.invoke(context, x_185);
      if(term == null)
        break Fail301;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAM_2, new IStrategoTerm[]{z_185, term}), checkListAnnos(termFactory, y_185));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}