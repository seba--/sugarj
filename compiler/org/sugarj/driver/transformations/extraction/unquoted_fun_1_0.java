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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("unquoted_fun_1_0");
    Fail171:
    { 
      IStrategoTerm a_131 = null;
      IStrategoTerm y_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consunquoted_fun_1 != ((IStrategoAppl)term).getConstructor())
        break Fail171;
      y_130 = term.getSubterm(0);
      IStrategoList annos144 = term.getAnnotations();
      a_131 = annos144;
      term = r_25.invoke(context, y_130);
      if(term == null)
        break Fail171;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consunquoted_fun_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}