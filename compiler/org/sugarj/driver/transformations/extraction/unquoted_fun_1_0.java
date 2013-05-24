package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class unquoted_fun_1_0 extends Strategy 
{ 
  public static unquoted_fun_1_0 instance = new unquoted_fun_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_348)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("unquoted_fun_1_0");
    Fail998:
    { 
      IStrategoTerm q_462 = null;
      IStrategoTerm p_462 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consunquoted_fun_1 != ((IStrategoAppl)term).getConstructor())
        break Fail998;
      p_462 = term.getSubterm(0);
      IStrategoList annos235 = term.getAnnotations();
      q_462 = annos235;
      term = s_348.invoke(context, p_462);
      if(term == null)
        break Fail998;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consunquoted_fun_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_462));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}