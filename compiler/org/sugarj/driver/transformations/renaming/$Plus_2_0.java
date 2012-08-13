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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_29, Strategy b_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Plus_2_0");
    Fail179:
    { 
      IStrategoTerm z_140 = null;
      IStrategoTerm x_140 = null;
      IStrategoTerm y_140 = null;
      IStrategoTerm d_141 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPlus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail179;
      x_140 = term.getSubterm(0);
      y_140 = term.getSubterm(1);
      IStrategoList annos154 = term.getAnnotations();
      z_140 = annos154;
      term = a_29.invoke(context, x_140);
      if(term == null)
        break Fail179;
      d_141 = term;
      term = b_29.invoke(context, y_140);
      if(term == null)
        break Fail179;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPlus_2, new IStrategoTerm[]{d_141, term}), checkListAnnos(termFactory, z_140));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}