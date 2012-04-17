package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call$No$Args_1_0 extends Strategy 
{ 
  public static $Call$No$Args_1_0 instance = new $Call$No$Args_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallNoArgs_1_0");
    Fail89:
    { 
      IStrategoTerm y_116 = null;
      IStrategoTerm x_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consCallNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail89;
      x_116 = term.getSubterm(0);
      IStrategoList annos65 = term.getAnnotations();
      y_116 = annos65;
      term = d_21.invoke(context, x_116);
      if(term == null)
        break Fail89;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consCallNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}