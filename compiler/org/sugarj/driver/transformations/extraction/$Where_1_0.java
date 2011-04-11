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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Where_1_0");
    Fail105:
    { 
      IStrategoTerm d_119 = null;
      IStrategoTerm c_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consWhere_1 != ((IStrategoAppl)term).getConstructor())
        break Fail105;
      c_119 = term.getSubterm(0);
      IStrategoList annos80 = term.getAnnotations();
      d_119 = annos80;
      term = y_21.invoke(context, c_119);
      if(term == null)
        break Fail105;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consWhere_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}