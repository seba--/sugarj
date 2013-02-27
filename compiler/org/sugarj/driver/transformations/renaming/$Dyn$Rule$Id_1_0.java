package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Id_1_0 extends Strategy 
{ 
  public static $Dyn$Rule$Id_1_0 instance = new $Dyn$Rule$Id_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleId_1_0");
    Fail16:
    { 
      IStrategoTerm c_90 = null;
      IStrategoTerm a_90 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail16;
      a_90 = term.getSubterm(0);
      IStrategoList annos6 = term.getAnnotations();
      c_90 = annos6;
      term = d_10.invoke(context, a_90);
      if(term == null)
        break Fail16;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleId_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_90));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}