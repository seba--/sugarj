package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_seq_0_2 extends Strategy 
{ 
  public static smart_seq_0_2 instance = new smart_seq_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_h_269, IStrategoTerm ref_i_269)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_269 = new TermReference(ref_h_269);
    TermReference i_269 = new TermReference(ref_i_269);
    context.push("smart_seq_0_2");
    Fail604:
    { 
      IStrategoTerm j_269 = null;
      IStrategoTerm f_270 = null;
      IStrategoTerm h_270 = null;
      term = extraction.constNil0;
      lifted376 lifted3760 = new lifted376();
      lifted3760.h_269 = h_269;
      lifted3760.i_269 = i_269;
      term = try_1_0.instance.invoke(context, term, lifted3760);
      if(term == null)
        break Fail604;
      lifted377 lifted3770 = new lifted377();
      lifted3770.h_269 = h_269;
      lifted3770.i_269 = i_269;
      term = try_1_0.instance.invoke(context, term, lifted3770);
      if(term == null)
        break Fail604;
      j_269 = term;
      if(h_269.value == null || i_269.value == null)
        break Fail604;
      term = (IStrategoTerm)termFactory.makeListCons(h_269.value, termFactory.makeListCons(i_269.value, (IStrategoList)extraction.constNil0));
      f_270 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_270, NO_STRATEGIES, new IStrategoTerm[]{extraction.const555});
      if(term == null)
        break Fail604;
      h_270 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_269);
      if(term == null)
        break Fail604;
      term = put_syntax_sort_0_1.instance.invoke(context, h_270, term);
      if(term == null)
        break Fail604;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}