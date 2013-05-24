package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Color$Rule$Named_0_3 extends Strategy 
{ 
  public static smart_$Color$Rule$Named_0_3 instance = new smart_$Color$Rule$Named_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_131, IStrategoTerm ref_y_131, IStrategoTerm ref_z_131)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_131 = new TermReference(ref_x_131);
    TermReference y_131 = new TermReference(ref_y_131);
    TermReference z_131 = new TermReference(ref_z_131);
    context.push("smart_ColorRuleNamed_0_3");
    Fail403:
    { 
      IStrategoTerm b_132 = null;
      IStrategoTerm w_132 = null;
      IStrategoTerm c_133 = null;
      term = extraction.constNil0;
      lifted136 lifted1360 = new lifted136();
      lifted1360.x_131 = x_131;
      lifted1360.y_131 = y_131;
      lifted1360.z_131 = z_131;
      term = try_1_0.instance.invoke(context, term, lifted1360);
      if(term == null)
        break Fail403;
      b_132 = term;
      if(x_131.value == null || (y_131.value == null || z_131.value == null))
        break Fail403;
      term = (IStrategoTerm)termFactory.makeListCons(x_131.value, termFactory.makeListCons(y_131.value, termFactory.makeListCons(z_131.value, (IStrategoList)extraction.constNil0)));
      w_132 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", w_132, NO_STRATEGIES, new IStrategoTerm[]{extraction.const391});
      if(term == null)
        break Fail403;
      c_133 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, b_132);
      if(term == null)
        break Fail403;
      term = put_syntax_sort_0_1.instance.invoke(context, c_133, term);
      if(term == null)
        break Fail403;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}