package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Real_1_0 extends Strategy 
{ 
  public static $Real_1_0 instance = new $Real_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Real_1_0");
    Fail144:
    { 
      IStrategoTerm y_114 = null;
      IStrategoTerm x_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consReal_1 != ((IStrategoAppl)term).getConstructor())
        break Fail144;
      x_114 = term.getSubterm(0);
      IStrategoList annos131 = term.getAnnotations();
      y_114 = annos131;
      term = u_18.invoke(context, x_114);
      if(term == null)
        break Fail144;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consReal_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}