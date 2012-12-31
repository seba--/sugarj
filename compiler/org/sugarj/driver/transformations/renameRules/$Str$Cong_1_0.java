package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StrCong_1_0");
    Fail82:
    { 
      IStrategoTerm a_105 = null;
      IStrategoTerm z_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consStrCong_1 != ((IStrategoAppl)term).getConstructor())
        break Fail82;
      z_104 = term.getSubterm(0);
      IStrategoList annos75 = term.getAnnotations();
      a_105 = annos75;
      term = h_15.invoke(context, z_104);
      if(term == null)
        break Fail82;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consStrCong_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}