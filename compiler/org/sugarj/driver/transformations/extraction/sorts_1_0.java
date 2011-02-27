package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class sorts_1_0 extends Strategy 
{ 
  public static sorts_1_0 instance = new sorts_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sorts_1_0");
    Fail250:
    { 
      IStrategoTerm z_146 = null;
      IStrategoTerm v_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conssorts_1 != ((IStrategoAppl)term).getConstructor())
        break Fail250;
      v_146 = term.getSubterm(0);
      IStrategoList annos206 = term.getAnnotations();
      z_146 = annos206;
      term = c_29.invoke(context, v_146);
      if(term == null)
        break Fail250;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conssorts_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}