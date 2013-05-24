package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Union_3_0 extends Strategy 
{ 
  public static $Dyn$Rule$Union_3_0 instance = new $Dyn$Rule$Union_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_341, Strategy m_341, Strategy n_341)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleUnion_3_0");
    Fail878:
    { 
      IStrategoTerm x_443 = null;
      IStrategoTerm u_443 = null;
      IStrategoTerm v_443 = null;
      IStrategoTerm w_443 = null;
      IStrategoTerm y_443 = null;
      IStrategoTerm z_443 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consDynRuleUnion_3 != ((IStrategoAppl)term).getConstructor())
        break Fail878;
      u_443 = term.getSubterm(0);
      v_443 = term.getSubterm(1);
      w_443 = term.getSubterm(2);
      IStrategoList annos124 = term.getAnnotations();
      x_443 = annos124;
      term = l_341.invoke(context, u_443);
      if(term == null)
        break Fail878;
      y_443 = term;
      term = m_341.invoke(context, v_443);
      if(term == null)
        break Fail878;
      z_443 = term;
      term = n_341.invoke(context, w_443);
      if(term == null)
        break Fail878;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consDynRuleUnion_3, new IStrategoTerm[]{y_443, z_443, term}), checkListAnnos(termFactory, x_443));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}