package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Real$Cong_1_0 extends Strategy 
{ 
  public static $Real$Cong_1_0 instance = new $Real$Cong_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RealCong_1_0");
    Fail905:
    { 
      IStrategoTerm u_448 = null;
      IStrategoTerm t_448 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consRealCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail905;
      t_448 = term.getSubterm(0);
      IStrategoList annos151 = term.getAnnotations();
      u_448 = annos151;
      term = k_343.invoke(context, t_448);
      if(term == null)
        break Fail905;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consRealCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_448));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}