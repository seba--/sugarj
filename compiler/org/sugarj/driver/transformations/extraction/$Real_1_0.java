package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Real_1_0 extends Strategy 
{ 
  public static $Real_1_0 instance = new $Real_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_346)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Real_1_0");
    Fail960:
    { 
      IStrategoTerm t_456 = null;
      IStrategoTerm s_456 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consReal_1 != ((IStrategoAppl)term).getConstructor())
        break Fail960;
      s_456 = term.getSubterm(0);
      IStrategoList annos202 = term.getAnnotations();
      t_456 = annos202;
      term = k_346.invoke(context, s_456);
      if(term == null)
        break Fail960;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consReal_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_456));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}