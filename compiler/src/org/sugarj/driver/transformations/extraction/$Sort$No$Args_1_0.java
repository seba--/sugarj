package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort$No$Args_1_0 extends Strategy 
{ 
  public static $Sort$No$Args_1_0 instance = new $Sort$No$Args_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortNoArgs_1_0");
    Fail151:
    { 
      IStrategoTerm y_125 = null;
      IStrategoTerm x_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSortNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail151;
      x_125 = term.getSubterm(0);
      IStrategoList annos121 = term.getAnnotations();
      y_125 = annos121;
      term = b_24.invoke(context, x_125);
      if(term == null)
        break Fail151;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSortNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}