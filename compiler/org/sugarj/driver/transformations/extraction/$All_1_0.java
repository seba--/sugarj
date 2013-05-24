package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_347)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("All_1_0");
    Fail981:
    { 
      IStrategoTerm o_460 = null;
      IStrategoTerm n_460 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consAll_1 != ((IStrategoAppl)term).getConstructor())
        break Fail981;
      n_460 = term.getSubterm(0);
      IStrategoList annos221 = term.getAnnotations();
      o_460 = annos221;
      term = y_347.invoke(context, n_460);
      if(term == null)
        break Fail981;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consAll_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_460));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}