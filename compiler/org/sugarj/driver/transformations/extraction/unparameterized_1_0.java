package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class unparameterized_1_0 extends Strategy 
{ 
  public static unparameterized_1_0 instance = new unparameterized_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("unparameterized_1_0");
    Fail204:
    { 
      IStrategoTerm s_137 = null;
      IStrategoTerm r_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consunparameterized_1 != ((IStrategoAppl)term).getConstructor())
        break Fail204;
      r_137 = term.getSubterm(0);
      IStrategoList annos167 = term.getAnnotations();
      s_137 = annos167;
      term = z_26.invoke(context, r_137);
      if(term == null)
        break Fail204;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consunparameterized_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}