package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Char$Cong_1_0 extends Strategy 
{ 
  public static $Char$Cong_1_0 instance = new $Char$Cong_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CharCong_1_0");
    Fail906:
    { 
      IStrategoTerm x_448 = null;
      IStrategoTerm w_448 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consCharCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail906;
      w_448 = term.getSubterm(0);
      IStrategoList annos152 = term.getAnnotations();
      x_448 = annos152;
      term = l_343.invoke(context, w_448);
      if(term == null)
        break Fail906;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consCharCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_448));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}