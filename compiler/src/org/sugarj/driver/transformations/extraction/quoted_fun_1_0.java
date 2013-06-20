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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("quoted_fun_1_0");
    Fail183:
    { 
      IStrategoTerm i_131 = null;
      IStrategoTerm g_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consquoted_fun_1 != ((IStrategoAppl)term).getConstructor())
        break Fail183;
      g_131 = term.getSubterm(0);
      IStrategoList annos152 = term.getAnnotations();
      i_131 = annos152;
      term = r_25.invoke(context, g_131);
      if(term == null)
        break Fail183;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consquoted_fun_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}