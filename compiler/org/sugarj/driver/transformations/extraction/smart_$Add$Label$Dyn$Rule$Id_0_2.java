package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Add$Label$Dyn$Rule$Id_0_2 extends Strategy 
{ 
  public static smart_$Add$Label$Dyn$Rule$Id_0_2 instance = new smart_$Add$Label$Dyn$Rule$Id_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_l_185, IStrategoTerm ref_m_185)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference l_185 = new TermReference(ref_l_185);
    TermReference m_185 = new TermReference(ref_m_185);
    context.push("smart_AddLabelDynRuleId_0_2");
    Fail481:
    { 
      IStrategoTerm n_185 = null;
      IStrategoTerm z_185 = null;
      IStrategoTerm b_186 = null;
      term = extraction.constNil0;
      lifted229 lifted2290 = new lifted229();
      lifted2290.l_185 = l_185;
      lifted2290.m_185 = m_185;
      term = try_1_0.instance.invoke(context, term, lifted2290);
      if(term == null)
        break Fail481;
      n_185 = term;
      if(l_185.value == null || m_185.value == null)
        break Fail481;
      term = (IStrategoTerm)termFactory.makeListCons(l_185.value, termFactory.makeListCons(m_185.value, (IStrategoList)extraction.constNil0));
      z_185 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", z_185, NO_STRATEGIES, new IStrategoTerm[]{extraction.const450});
      if(term == null)
        break Fail481;
      b_186 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, n_185);
      if(term == null)
        break Fail481;
      term = put_syntax_sort_0_1.instance.invoke(context, b_186, term);
      if(term == null)
        break Fail481;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}