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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DefaultVal_1_0");
    Fail41:
    { 
      IStrategoTerm p_104 = null;
      IStrategoTerm o_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDefaultVal_1 != ((IStrategoAppl)term).getConstructor())
        break Fail41;
      o_104 = term.getSubterm(0);
      IStrategoList annos29 = term.getAnnotations();
      p_104 = annos29;
      term = l_16.invoke(context, o_104);
      if(term == null)
        break Fail41;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDefaultVal_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}