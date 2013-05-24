package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_assoc_0_3 extends Strategy 
{ 
  public static smart_assoc_0_3 instance = new smart_assoc_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_305, IStrategoTerm ref_x_305, IStrategoTerm ref_y_305)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_305 = new TermReference(ref_w_305);
    TermReference x_305 = new TermReference(ref_x_305);
    TermReference y_305 = new TermReference(ref_y_305);
    context.push("smart_assoc_0_3");
    Fail653:
    { 
      IStrategoTerm z_305 = null;
      IStrategoTerm m_306 = null;
      IStrategoTerm o_306 = null;
      term = extraction.constNil0;
      lifted434 lifted4340 = new lifted434();
      lifted4340.w_305 = w_305;
      lifted4340.x_305 = x_305;
      lifted4340.y_305 = y_305;
      term = try_1_0.instance.invoke(context, term, lifted4340);
      if(term == null)
        break Fail653;
      z_305 = term;
      if(w_305.value == null || (x_305.value == null || y_305.value == null))
        break Fail653;
      term = (IStrategoTerm)termFactory.makeListCons(w_305.value, termFactory.makeListCons(x_305.value, termFactory.makeListCons(y_305.value, (IStrategoList)extraction.constNil0)));
      m_306 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_306, NO_STRATEGIES, new IStrategoTerm[]{extraction.const594});
      if(term == null)
        break Fail653;
      o_306 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, z_305);
      if(term == null)
        break Fail653;
      term = put_syntax_sort_0_1.instance.invoke(context, o_306, term);
      if(term == null)
        break Fail653;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}