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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_22, Strategy y_22, Strategy z_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallDynamic_3_0");
    Fail134:
    { 
      IStrategoTerm q_122 = null;
      IStrategoTerm l_122 = null;
      IStrategoTerm o_122 = null;
      IStrategoTerm p_122 = null;
      IStrategoTerm r_122 = null;
      IStrategoTerm s_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consCallDynamic_3 != ((IStrategoAppl)term).getConstructor())
        break Fail134;
      l_122 = term.getSubterm(0);
      o_122 = term.getSubterm(1);
      p_122 = term.getSubterm(2);
      IStrategoList annos104 = term.getAnnotations();
      q_122 = annos104;
      term = x_22.invoke(context, l_122);
      if(term == null)
        break Fail134;
      r_122 = term;
      term = y_22.invoke(context, o_122);
      if(term == null)
        break Fail134;
      s_122 = term;
      term = z_22.invoke(context, p_122);
      if(term == null)
        break Fail134;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consCallDynamic_3, new IStrategoTerm[]{r_122, s_122, term}), checkListAnnos(termFactory, q_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}