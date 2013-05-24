package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Table$Provider_1_0 extends Strategy 
{ 
  public static $Table$Provider_1_0 instance = new $Table$Provider_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TableProvider_1_0");
    Fail827:
    { 
      IStrategoTerm s_435 = null;
      IStrategoTerm r_435 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consTableProvider_1 != ((IStrategoAppl)term).getConstructor())
        break Fail827;
      r_435 = term.getSubterm(0);
      IStrategoList annos75 = term.getAnnotations();
      s_435 = annos75;
      term = e_338.invoke(context, r_435);
      if(term == null)
        break Fail827;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consTableProvider_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_435));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}