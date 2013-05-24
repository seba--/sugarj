package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Overlay_0_3 extends Strategy 
{ 
  public static smart_$Overlay_0_3 instance = new smart_$Overlay_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_176, IStrategoTerm ref_z_176, IStrategoTerm ref_h_177)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference y_176 = new TermReference(ref_y_176);
    TermReference z_176 = new TermReference(ref_z_176);
    TermReference h_177 = new TermReference(ref_h_177);
    context.push("smart_Overlay_0_3");
    Fail468:
    { 
      IStrategoTerm i_177 = null;
      IStrategoTerm v_177 = null;
      IStrategoTerm x_177 = null;
      term = extraction.constNil0;
      lifted216 lifted2160 = new lifted216();
      lifted2160.y_176 = y_176;
      lifted2160.z_176 = z_176;
      lifted2160.h_177 = h_177;
      term = try_1_0.instance.invoke(context, term, lifted2160);
      if(term == null)
        break Fail468;
      i_177 = term;
      if(y_176.value == null || (z_176.value == null || h_177.value == null))
        break Fail468;
      term = (IStrategoTerm)termFactory.makeListCons(y_176.value, termFactory.makeListCons(z_176.value, termFactory.makeListCons(h_177.value, (IStrategoList)extraction.constNil0)));
      v_177 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", v_177, NO_STRATEGIES, new IStrategoTerm[]{extraction.const193});
      if(term == null)
        break Fail468;
      x_177 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, i_177);
      if(term == null)
        break Fail468;
      term = put_syntax_sort_0_1.instance.invoke(context, x_177, term);
      if(term == null)
        break Fail468;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}