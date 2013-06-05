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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("unquoted_fun_1_0");
    Fail183:
    { 
      IStrategoTerm e_131 = null;
      IStrategoTerm c_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consunquoted_fun_1 != ((IStrategoAppl)term).getConstructor())
        break Fail183;
      c_131 = term.getSubterm(0);
      IStrategoList annos152 = term.getAnnotations();
      e_131 = annos152;
      term = q_25.invoke(context, c_131);
      if(term == null)
        break Fail183;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consunquoted_fun_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}