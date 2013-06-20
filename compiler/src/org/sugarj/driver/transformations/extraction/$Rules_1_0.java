package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rules_1_0 extends Strategy 
{ 
  public static $Rules_1_0 instance = new $Rules_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rules_1_0");
    Fail69:
    { 
      IStrategoTerm f_110 = null;
      IStrategoTerm e_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consRules_1 != ((IStrategoAppl)term).getConstructor())
        break Fail69;
      e_110 = term.getSubterm(0);
      IStrategoList annos42 = term.getAnnotations();
      f_110 = annos42;
      term = p_18.invoke(context, e_110);
      if(term == null)
        break Fail69;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consRules_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}