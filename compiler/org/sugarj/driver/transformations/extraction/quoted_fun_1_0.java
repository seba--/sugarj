package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class quoted_fun_1_0 extends Strategy 
{ 
  public static quoted_fun_1_0 instance = new quoted_fun_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_348)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("quoted_fun_1_0");
    Fail999:
    { 
      IStrategoTerm t_462 = null;
      IStrategoTerm s_462 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consquoted_fun_1 != ((IStrategoAppl)term).getConstructor())
        break Fail999;
      s_462 = term.getSubterm(0);
      IStrategoList annos236 = term.getAnnotations();
      t_462 = annos236;
      term = t_348.invoke(context, s_462);
      if(term == null)
        break Fail999;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consquoted_fun_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_462));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}