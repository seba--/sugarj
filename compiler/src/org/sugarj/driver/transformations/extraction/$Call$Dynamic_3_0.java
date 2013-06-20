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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_22, Strategy a_23, Strategy b_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallDynamic_3_0");
    Fail135:
    { 
      IStrategoTerm v_122 = null;
      IStrategoTerm s_122 = null;
      IStrategoTerm t_122 = null;
      IStrategoTerm u_122 = null;
      IStrategoTerm w_122 = null;
      IStrategoTerm x_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consCallDynamic_3 != ((IStrategoAppl)term).getConstructor())
        break Fail135;
      s_122 = term.getSubterm(0);
      t_122 = term.getSubterm(1);
      u_122 = term.getSubterm(2);
      IStrategoList annos105 = term.getAnnotations();
      v_122 = annos105;
      term = z_22.invoke(context, s_122);
      if(term == null)
        break Fail135;
      w_122 = term;
      term = a_23.invoke(context, t_122);
      if(term == null)
        break Fail135;
      x_122 = term;
      term = b_23.invoke(context, u_122);
      if(term == null)
        break Fail135;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consCallDynamic_3, new IStrategoTerm[]{w_122, x_122, term}), checkListAnnos(termFactory, v_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}