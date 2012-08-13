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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DefaultVal_1_0");
    Fail89:
    { 
      IStrategoTerm c_117 = null;
      IStrategoTerm b_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDefaultVal_1 != ((IStrategoAppl)term).getConstructor())
        break Fail89;
      b_117 = term.getSubterm(0);
      IStrategoList annos70 = term.getAnnotations();
      c_117 = annos70;
      term = w_21.invoke(context, b_117);
      if(term == null)
        break Fail89;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDefaultVal_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}