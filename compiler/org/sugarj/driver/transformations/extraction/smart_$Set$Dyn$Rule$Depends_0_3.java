package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Set$Dyn$Rule$Depends_0_3 extends Strategy 
{ 
  public static smart_$Set$Dyn$Rule$Depends_0_3 instance = new smart_$Set$Dyn$Rule$Depends_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_184, IStrategoTerm ref_c_184, IStrategoTerm ref_d_184)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference b_184 = new TermReference(ref_b_184);
    TermReference c_184 = new TermReference(ref_c_184);
    TermReference d_184 = new TermReference(ref_d_184);
    context.push("smart_SetDynRuleDepends_0_3");
    Fail479:
    { 
      IStrategoTerm e_184 = null;
      IStrategoTerm r_184 = null;
      IStrategoTerm t_184 = null;
      term = extraction.constNil0;
      lifted227 lifted2270 = new lifted227();
      lifted2270.b_184 = b_184;
      lifted2270.c_184 = c_184;
      lifted2270.d_184 = d_184;
      term = try_1_0.instance.invoke(context, term, lifted2270);
      if(term == null)
        break Fail479;
      e_184 = term;
      if(b_184.value == null || (c_184.value == null || d_184.value == null))
        break Fail479;
      term = (IStrategoTerm)termFactory.makeListCons(b_184.value, termFactory.makeListCons(c_184.value, termFactory.makeListCons(d_184.value, (IStrategoList)extraction.constNil0)));
      r_184 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", r_184, NO_STRATEGIES, new IStrategoTerm[]{extraction.const448});
      if(term == null)
        break Fail479;
      t_184 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, e_184);
      if(term == null)
        break Fail479;
      term = put_syntax_sort_0_1.instance.invoke(context, t_184, term);
      if(term == null)
        break Fail479;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}