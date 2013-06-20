package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class quoted_1_0 extends Strategy 
{ 
  public static quoted_1_0 instance = new quoted_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("quoted_1_0");
    Fail182:
    { 
      IStrategoTerm c_131 = null;
      IStrategoTerm a_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consquoted_1 != ((IStrategoAppl)term).getConstructor())
        break Fail182;
      a_131 = term.getSubterm(0);
      IStrategoList annos151 = term.getAnnotations();
      c_131 = annos151;
      term = q_25.invoke(context, a_131);
      if(term == null)
        break Fail182;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consquoted_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}