package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Where_1_0");
    Fail326:
    { 
      IStrategoTerm y_189 = null;
      IStrategoTerm x_189 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consWhere_1 != ((IStrategoAppl)term).getConstructor())
        break Fail326;
      x_189 = term.getSubterm(0);
      IStrategoList annos272 = term.getAnnotations();
      y_189 = annos272;
      term = b_46.invoke(context, x_189);
      if(term == null)
        break Fail326;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consWhere_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_189));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}