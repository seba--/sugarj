package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class natural_1_0 extends Strategy 
{ 
  public static natural_1_0 instance = new natural_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("natural_1_0");
    Fail282:
    { 
      IStrategoTerm c_150 = null;
      IStrategoTerm b_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consnatural_1 != ((IStrategoAppl)term).getConstructor())
        break Fail282;
      b_150 = term.getSubterm(0);
      IStrategoList annos233 = term.getAnnotations();
      c_150 = annos233;
      term = a_30.invoke(context, b_150);
      if(term == null)
        break Fail282;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consnatural_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}