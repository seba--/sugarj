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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CharCong_1_0");
    Fail97:
    { 
      IStrategoTerm d_118 = null;
      IStrategoTerm c_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consCharCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail97;
      c_118 = term.getSubterm(0);
      IStrategoList annos72 = term.getAnnotations();
      d_118 = annos72;
      term = p_21.invoke(context, c_118);
      if(term == null)
        break Fail97;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consCharCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}