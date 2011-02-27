package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call$Dynamic_3_0 extends Strategy 
{ 
  public static $Call$Dynamic_3_0 instance = new $Call$Dynamic_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_22, Strategy z_22, Strategy a_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallDynamic_3_0");
    Fail122:
    { 
      IStrategoTerm l_122 = null;
      IStrategoTerm i_122 = null;
      IStrategoTerm j_122 = null;
      IStrategoTerm k_122 = null;
      IStrategoTerm o_122 = null;
      IStrategoTerm p_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consCallDynamic_3 != ((IStrategoAppl)term).getConstructor())
        break Fail122;
      i_122 = term.getSubterm(0);
      j_122 = term.getSubterm(1);
      k_122 = term.getSubterm(2);
      IStrategoList annos96 = term.getAnnotations();
      l_122 = annos96;
      term = y_22.invoke(context, i_122);
      if(term == null)
        break Fail122;
      o_122 = term;
      term = z_22.invoke(context, j_122);
      if(term == null)
        break Fail122;
      p_122 = term;
      term = a_23.invoke(context, k_122);
      if(term == null)
        break Fail122;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consCallDynamic_3, new IStrategoTerm[]{o_122, p_122, term}), checkListAnnos(termFactory, l_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}