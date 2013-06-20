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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CharCong_1_0");
    Fail82:
    { 
      IStrategoTerm w_104 = null;
      IStrategoTerm v_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCharCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail82;
      v_104 = term.getSubterm(0);
      IStrategoList annos72 = term.getAnnotations();
      w_104 = annos72;
      term = j_15.invoke(context, v_104);
      if(term == null)
        break Fail82;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCharCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}