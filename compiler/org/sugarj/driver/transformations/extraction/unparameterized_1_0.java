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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("unparameterized_1_0");
    Fail215:
    { 
      IStrategoTerm v_137 = null;
      IStrategoTerm u_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consunparameterized_1 != ((IStrategoAppl)term).getConstructor())
        break Fail215;
      u_137 = term.getSubterm(0);
      IStrategoList annos175 = term.getAnnotations();
      v_137 = annos175;
      term = y_26.invoke(context, u_137);
      if(term == null)
        break Fail215;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consunparameterized_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}