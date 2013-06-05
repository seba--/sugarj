package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rules_1_0 extends Strategy 
{ 
  public static $Rules_1_0 instance = new $Rules_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rules_1_0");
    Fail68:
    { 
      IStrategoTerm a_110 = null;
      IStrategoTerm z_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consRules_1 != ((IStrategoAppl)term).getConstructor())
        break Fail68;
      z_109 = term.getSubterm(0);
      IStrategoList annos41 = term.getAnnotations();
      a_110 = annos41;
      term = n_18.invoke(context, z_109);
      if(term == null)
        break Fail68;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consRules_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}