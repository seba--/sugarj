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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StrCong_1_0");
    Fail903:
    { 
      IStrategoTerm o_448 = null;
      IStrategoTerm n_448 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consStrCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail903;
      n_448 = term.getSubterm(0);
      IStrategoList annos149 = term.getAnnotations();
      o_448 = annos149;
      term = i_343.invoke(context, n_448);
      if(term == null)
        break Fail903;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consStrCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_448));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}