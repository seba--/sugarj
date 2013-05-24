package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Dyn$Rule$Scope$Id_0_1 extends Strategy 
{ 
  public static smart_$Dyn$Rule$Scope$Id_0_1 instance = new smart_$Dyn$Rule$Scope$Id_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_187)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference e_187 = new TermReference(ref_e_187);
    context.push("smart_DynRuleScopeId_0_1");
    Fail484:
    { 
      IStrategoTerm f_187 = null;
      IStrategoTerm m_187 = null;
      IStrategoTerm o_187 = null;
      term = extraction.constNil0;
      lifted232 lifted2320 = new lifted232();
      lifted2320.e_187 = e_187;
      term = try_1_0.instance.invoke(context, term, lifted2320);
      if(term == null)
        break Fail484;
      f_187 = term;
      if(e_187.value == null)
        break Fail484;
      term = (IStrategoTerm)termFactory.makeListCons(e_187.value, (IStrategoList)extraction.constNil0);
      m_187 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_187, NO_STRATEGIES, new IStrategoTerm[]{extraction.const112});
      if(term == null)
        break Fail484;
      o_187 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, f_187);
      if(term == null)
        break Fail484;
      term = put_syntax_sort_0_1.instance.invoke(context, o_187, term);
      if(term == null)
        break Fail484;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}