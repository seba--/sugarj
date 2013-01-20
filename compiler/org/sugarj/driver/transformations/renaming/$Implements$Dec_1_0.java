package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Implements$Dec_1_0 extends Strategy 
{ 
  public static $Implements$Dec_1_0 instance = new $Implements$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImplementsDec_1_0");
    Fail71:
    { 
      IStrategoTerm f_135 = null;
      IStrategoTerm d_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consImplementsDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail71;
      d_135 = term.getSubterm(0);
      IStrategoList annos47 = term.getAnnotations();
      f_135 = annos47;
      term = n_29.invoke(context, d_135);
      if(term == null)
        break Fail71;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consImplementsDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}