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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Where_1_0");
    Fail116:
    { 
      IStrategoTerm g_119 = null;
      IStrategoTerm f_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consWhere_1 != ((IStrategoAppl)term).getConstructor())
        break Fail116;
      f_119 = term.getSubterm(0);
      IStrategoList annos88 = term.getAnnotations();
      g_119 = annos88;
      term = x_21.invoke(context, f_119);
      if(term == null)
        break Fail116;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consWhere_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}