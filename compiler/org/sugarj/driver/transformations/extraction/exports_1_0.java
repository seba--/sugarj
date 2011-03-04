package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class exports_1_0 extends Strategy 
{ 
  public static exports_1_0 instance = new exports_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("exports_1_0");
    Fail206:
    { 
      IStrategoTerm b_138 = null;
      IStrategoTerm a_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consexports_1 != ((IStrategoAppl)term).getConstructor())
        break Fail206;
      a_138 = term.getSubterm(0);
      IStrategoList annos169 = term.getAnnotations();
      b_138 = annos169;
      term = b_27.invoke(context, a_138);
      if(term == null)
        break Fail206;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consexports_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_138));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}