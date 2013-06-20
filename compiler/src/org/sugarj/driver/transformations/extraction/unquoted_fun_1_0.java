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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("unquoted_fun_1_0");
    Fail184:
    { 
      IStrategoTerm n_131 = null;
      IStrategoTerm l_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consunquoted_fun_1 != ((IStrategoAppl)term).getConstructor())
        break Fail184;
      l_131 = term.getSubterm(0);
      IStrategoList annos153 = term.getAnnotations();
      n_131 = annos153;
      term = s_25.invoke(context, l_131);
      if(term == null)
        break Fail184;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consunquoted_fun_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}