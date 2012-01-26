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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DefaultVal_1_0");
    Fail38:
    { 
      IStrategoTerm w_103 = null;
      IStrategoTerm v_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDefaultVal_1 != ((IStrategoAppl)term).getConstructor())
        break Fail38;
      v_103 = term.getSubterm(0);
      IStrategoList annos29 = term.getAnnotations();
      w_103 = annos29;
      term = w_15.invoke(context, v_103);
      if(term == null)
        break Fail38;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDefaultVal_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}