package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_13, Strategy j_13, Strategy k_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleUnion_3_0");
    Fail54:
    { 
      IStrategoTerm y_99 = null;
      IStrategoTerm v_99 = null;
      IStrategoTerm w_99 = null;
      IStrategoTerm x_99 = null;
      IStrategoTerm z_99 = null;
      IStrategoTerm a_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleUnion_3 != ((IStrategoAppl)term).getConstructor())
        break Fail54;
      v_99 = term.getSubterm(0);
      w_99 = term.getSubterm(1);
      x_99 = term.getSubterm(2);
      IStrategoList annos48 = term.getAnnotations();
      y_99 = annos48;
      term = i_13.invoke(context, v_99);
      if(term == null)
        break Fail54;
      z_99 = term;
      term = j_13.invoke(context, w_99);
      if(term == null)
        break Fail54;
      a_100 = term;
      term = k_13.invoke(context, x_99);
      if(term == null)
        break Fail54;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleUnion_3, new IStrategoTerm[]{z_99, a_100, term}), checkListAnnos(termFactory, y_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}