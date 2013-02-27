package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_13, Strategy i_13, Strategy j_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleUnion_3_0");
    Fail58:
    { 
      IStrategoTerm x_99 = null;
      IStrategoTerm u_99 = null;
      IStrategoTerm v_99 = null;
      IStrategoTerm w_99 = null;
      IStrategoTerm y_99 = null;
      IStrategoTerm z_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleUnion_3 != ((IStrategoAppl)term).getConstructor())
        break Fail58;
      u_99 = term.getSubterm(0);
      v_99 = term.getSubterm(1);
      w_99 = term.getSubterm(2);
      IStrategoList annos48 = term.getAnnotations();
      x_99 = annos48;
      term = h_13.invoke(context, u_99);
      if(term == null)
        break Fail58;
      y_99 = term;
      term = i_13.invoke(context, v_99);
      if(term == null)
        break Fail58;
      z_99 = term;
      term = j_13.invoke(context, w_99);
      if(term == null)
        break Fail58;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleUnion_3, new IStrategoTerm[]{y_99, z_99, term}), checkListAnnos(termFactory, x_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}