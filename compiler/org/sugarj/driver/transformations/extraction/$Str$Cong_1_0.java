package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Str$Cong_1_0 extends Strategy 
{ 
  public static $Str$Cong_1_0 instance = new $Str$Cong_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StrCong_1_0");
    Fail111:
    { 
      IStrategoTerm p_118 = null;
      IStrategoTerm o_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consStrCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail111;
      o_118 = term.getSubterm(0);
      IStrategoList annos83 = term.getAnnotations();
      p_118 = annos83;
      term = r_21.invoke(context, o_118);
      if(term == null)
        break Fail111;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consStrCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}