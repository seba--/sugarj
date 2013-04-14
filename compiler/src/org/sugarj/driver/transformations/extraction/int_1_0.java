package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class int_1_0 extends Strategy 
{ 
  public static int_1_0 instance = new int_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("int_1_0");
    Fail266:
    { 
      IStrategoTerm e_149 = null;
      IStrategoTerm d_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consint_1 != ((IStrategoAppl)term).getConstructor())
        break Fail266;
      d_149 = term.getSubterm(0);
      IStrategoList annos220 = term.getAnnotations();
      e_149 = annos220;
      term = t_29.invoke(context, d_149);
      if(term == null)
        break Fail266;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consint_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}