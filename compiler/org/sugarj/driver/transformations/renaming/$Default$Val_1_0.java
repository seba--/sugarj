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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DefaultVal_1_0");
    Fail43:
    { 
      IStrategoTerm x_104 = null;
      IStrategoTerm w_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDefaultVal_1 != ((IStrategoAppl)term).getConstructor())
        break Fail43;
      w_104 = term.getSubterm(0);
      IStrategoList annos29 = term.getAnnotations();
      x_104 = annos29;
      term = t_16.invoke(context, w_104);
      if(term == null)
        break Fail43;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDefaultVal_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}