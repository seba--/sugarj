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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_334)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sorts_1_0");
    Fail738:
    { 
      IStrategoTerm z_424 = null;
      IStrategoTerm y_424 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._conssorts_1 != ((IStrategoAppl)term).getConstructor())
        break Fail738;
      y_424 = term.getSubterm(0);
      IStrategoList annos10 = term.getAnnotations();
      z_424 = annos10;
      term = b_334.invoke(context, y_424);
      if(term == null)
        break Fail738;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._conssorts_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_424));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}