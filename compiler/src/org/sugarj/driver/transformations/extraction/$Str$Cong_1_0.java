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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StrCong_1_0");
    Fail112:
    { 
      IStrategoTerm u_118 = null;
      IStrategoTerm t_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consStrCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail112;
      t_118 = term.getSubterm(0);
      IStrategoList annos84 = term.getAnnotations();
      u_118 = annos84;
      term = t_21.invoke(context, t_118);
      if(term == null)
        break Fail112;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consStrCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}