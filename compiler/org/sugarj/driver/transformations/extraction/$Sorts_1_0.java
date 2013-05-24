package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sorts_1_0 extends Strategy 
{ 
  public static $Sorts_1_0 instance = new $Sorts_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sorts_1_0");
    Fail945:
    { 
      IStrategoTerm r_454 = null;
      IStrategoTerm q_454 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSorts_1 != ((IStrategoAppl)term).getConstructor())
        break Fail945;
      q_454 = term.getSubterm(0);
      IStrategoList annos188 = term.getAnnotations();
      r_454 = annos188;
      term = q_345.invoke(context, q_454);
      if(term == null)
        break Fail945;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSorts_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_454));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}