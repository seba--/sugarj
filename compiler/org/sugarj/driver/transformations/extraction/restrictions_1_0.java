package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class restrictions_1_0 extends Strategy 
{ 
  public static restrictions_1_0 instance = new restrictions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("restrictions_1_0");
    Fail258:
    { 
      IStrategoTerm i_146 = null;
      IStrategoTerm h_146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consrestrictions_1 != ((IStrategoAppl)term).getConstructor())
        break Fail258;
      h_146 = term.getSubterm(0);
      IStrategoList annos210 = term.getAnnotations();
      i_146 = annos210;
      term = x_28.invoke(context, h_146);
      if(term == null)
        break Fail258;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consrestrictions_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}