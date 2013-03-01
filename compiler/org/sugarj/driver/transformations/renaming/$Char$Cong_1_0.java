package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CharCong_1_0");
    Fail318:
    { 
      IStrategoTerm x_188 = null;
      IStrategoTerm w_188 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCharCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail318;
      w_188 = term.getSubterm(0);
      IStrategoList annos264 = term.getAnnotations();
      x_188 = annos264;
      term = s_45.invoke(context, w_188);
      if(term == null)
        break Fail318;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCharCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_188));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}