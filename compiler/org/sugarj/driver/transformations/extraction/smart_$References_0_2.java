package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$References_0_2 extends Strategy 
{ 
  public static smart_$References_0_2 instance = new smart_$References_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_123, IStrategoTerm ref_b_124)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_123 = new TermReference(ref_z_123);
    TermReference b_124 = new TermReference(ref_b_124);
    context.push("smart_References_0_2");
    Fail394:
    { 
      IStrategoTerm c_124 = null;
      IStrategoTerm t_124 = null;
      IStrategoTerm v_124 = null;
      term = extraction.constNil0;
      lifted125 lifted1250 = new lifted125();
      lifted1250.z_123 = z_123;
      lifted1250.b_124 = b_124;
      term = try_1_0.instance.invoke(context, term, lifted1250);
      if(term == null)
        break Fail394;
      c_124 = term;
      if(z_123.value == null || b_124.value == null)
        break Fail394;
      term = (IStrategoTerm)termFactory.makeListCons(z_123.value, termFactory.makeListCons(b_124.value, (IStrategoList)extraction.constNil0));
      t_124 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_124, NO_STRATEGIES, new IStrategoTerm[]{extraction.const384});
      if(term == null)
        break Fail394;
      v_124 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, c_124);
      if(term == null)
        break Fail394;
      term = put_syntax_sort_0_1.instance.invoke(context, v_124, term);
      if(term == null)
        break Fail394;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}