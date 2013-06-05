package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $As_2_0 extends Strategy 
{ 
  public static $As_2_0 instance = new $As_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_24, Strategy l_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("As_2_0");
    Fail160:
    { 
      IStrategoTerm z_126 = null;
      IStrategoTerm x_126 = null;
      IStrategoTerm y_126 = null;
      IStrategoTerm a_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consAs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail160;
      x_126 = term.getSubterm(0);
      y_126 = term.getSubterm(1);
      IStrategoList annos129 = term.getAnnotations();
      z_126 = annos129;
      term = k_24.invoke(context, x_126);
      if(term == null)
        break Fail160;
      a_127 = term;
      term = l_24.invoke(context, y_126);
      if(term == null)
        break Fail160;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consAs_2, new IStrategoTerm[]{a_127, term}), checkListAnnos(termFactory, z_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}