package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Hover$Rule_0_2 extends Strategy 
{ 
  public static smart_$Hover$Rule_0_2 instance = new smart_$Hover$Rule_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_h_126, IStrategoTerm ref_i_126)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_126 = new TermReference(ref_h_126);
    TermReference i_126 = new TermReference(ref_i_126);
    context.push("smart_HoverRule_0_2");
    Fail397:
    { 
      IStrategoTerm j_126 = null;
      IStrategoTerm t_126 = null;
      IStrategoTerm v_126 = null;
      term = extraction.constNil0;
      lifted128 lifted1280 = new lifted128();
      lifted1280.h_126 = h_126;
      lifted1280.i_126 = i_126;
      term = try_1_0.instance.invoke(context, term, lifted1280);
      if(term == null)
        break Fail397;
      j_126 = term;
      if(h_126.value == null || i_126.value == null)
        break Fail397;
      term = (IStrategoTerm)termFactory.makeListCons(h_126.value, termFactory.makeListCons(i_126.value, (IStrategoList)extraction.constNil0));
      t_126 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_126, NO_STRATEGIES, new IStrategoTerm[]{extraction.const386});
      if(term == null)
        break Fail397;
      v_126 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_126);
      if(term == null)
        break Fail397;
      term = put_syntax_sort_0_1.instance.invoke(context, v_126, term);
      if(term == null)
        break Fail397;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}