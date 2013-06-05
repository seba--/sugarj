package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class iter_1_0 extends Strategy 
{ 
  public static iter_1_0 instance = new iter_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("iter_1_0");
    Fail236:
    { 
      IStrategoTerm c_143 = null;
      IStrategoTerm b_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consiter_1 != ((IStrategoAppl)term).getConstructor())
        break Fail236;
      b_143 = term.getSubterm(0);
      IStrategoList annos194 = term.getAnnotations();
      c_143 = annos194;
      term = c_28.invoke(context, b_143);
      if(term == null)
        break Fail236;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consiter_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}