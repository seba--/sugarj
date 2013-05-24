package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Where_1_0 extends Strategy 
{ 
  public static $Where_1_0 instance = new $Where_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Where_1_0");
    Fail898:
    { 
      IStrategoTerm x_447 = null;
      IStrategoTerm w_447 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consWhere_1 != ((IStrategoAppl)term).getConstructor())
        break Fail898;
      w_447 = term.getSubterm(0);
      IStrategoList annos144 = term.getAnnotations();
      x_447 = annos144;
      term = c_343.invoke(context, w_447);
      if(term == null)
        break Fail898;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consWhere_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_447));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}