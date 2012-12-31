package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Default$Val_1_0 extends Strategy 
{ 
  public static $Default$Val_1_0 instance = new $Default$Val_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DefaultVal_1_0");
    Fail79:
    { 
      IStrategoTerm r_137 = null;
      IStrategoTerm q_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDefaultVal_1 != ((IStrategoAppl)term).getConstructor())
        break Fail79;
      q_137 = term.getSubterm(0);
      IStrategoList annos55 = term.getAnnotations();
      r_137 = annos55;
      term = e_30.invoke(context, q_137);
      if(term == null)
        break Fail79;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDefaultVal_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}