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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_13, Strategy l_13, Strategy m_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleUnion_3_0");
    Fail58:
    { 
      IStrategoTerm a_100 = null;
      IStrategoTerm x_99 = null;
      IStrategoTerm y_99 = null;
      IStrategoTerm z_99 = null;
      IStrategoTerm b_100 = null;
      IStrategoTerm c_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleUnion_3 != ((IStrategoAppl)term).getConstructor())
        break Fail58;
      x_99 = term.getSubterm(0);
      y_99 = term.getSubterm(1);
      z_99 = term.getSubterm(2);
      IStrategoList annos48 = term.getAnnotations();
      a_100 = annos48;
      term = k_13.invoke(context, x_99);
      if(term == null)
        break Fail58;
      b_100 = term;
      term = l_13.invoke(context, y_99);
      if(term == null)
        break Fail58;
      c_100 = term;
      term = m_13.invoke(context, z_99);
      if(term == null)
        break Fail58;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleUnion_3, new IStrategoTerm[]{b_100, c_100, term}), checkListAnnos(termFactory, a_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}