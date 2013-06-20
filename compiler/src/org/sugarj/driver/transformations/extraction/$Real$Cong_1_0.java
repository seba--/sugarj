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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RealCong_1_0");
    Fail110:
    { 
      IStrategoTerm o_118 = null;
      IStrategoTerm n_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consRealCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail110;
      n_118 = term.getSubterm(0);
      IStrategoList annos82 = term.getAnnotations();
      o_118 = annos82;
      term = r_21.invoke(context, n_118);
      if(term == null)
        break Fail110;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consRealCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}