package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $All_1_0 extends Strategy 
{ 
  public static $All_1_0 instance = new $All_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("All_1_0");
    Fail99:
    { 
      IStrategoTerm c_107 = null;
      IStrategoTerm b_107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAll_1 != ((IStrategoAppl)term).getConstructor())
        break Fail99;
      b_107 = term.getSubterm(0);
      IStrategoList annos88 = term.getAnnotations();
      c_107 = annos88;
      term = b_16.invoke(context, b_107);
      if(term == null)
        break Fail99;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAll_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_107));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}