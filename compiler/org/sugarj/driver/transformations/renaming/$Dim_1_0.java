package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dim_1_0 extends Strategy 
{ 
  public static $Dim_1_0 instance = new $Dim_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Dim_1_0");
    Fail78:
    { 
      IStrategoTerm w_114 = null;
      IStrategoTerm v_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDim_1 != ((IStrategoAppl)term).getConstructor())
        break Fail78;
      v_114 = term.getSubterm(0);
      IStrategoList annos59 = term.getAnnotations();
      w_114 = annos59;
      term = a_21.invoke(context, v_114);
      if(term == null)
        break Fail78;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDim_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}