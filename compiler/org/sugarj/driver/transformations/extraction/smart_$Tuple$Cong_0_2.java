package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Tuple$Cong_0_2 extends Strategy 
{ 
  public static smart_$Tuple$Cong_0_2 instance = new smart_$Tuple$Cong_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_217, IStrategoTerm ref_e_217)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference a_217 = new TermReference(ref_a_217);
    TermReference e_217 = new TermReference(ref_e_217);
    context.push("smart_TupleCong_0_2");
    Fail526:
    { 
      IStrategoTerm f_217 = null;
      IStrategoTerm a_218 = null;
      IStrategoTerm f_218 = null;
      term = extraction.constNil0;
      lifted285 lifted2850 = new lifted285();
      lifted2850.a_217 = a_217;
      lifted2850.e_217 = e_217;
      term = try_1_0.instance.invoke(context, term, lifted2850);
      if(term == null)
        break Fail526;
      f_217 = term;
      if(a_217.value == null || e_217.value == null)
        break Fail526;
      term = (IStrategoTerm)termFactory.makeListCons(a_217.value, termFactory.makeListCons(e_217.value, (IStrategoList)extraction.constNil0));
      a_218 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", a_218, NO_STRATEGIES, new IStrategoTerm[]{extraction.const490});
      if(term == null)
        break Fail526;
      f_218 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, f_217);
      if(term == null)
        break Fail526;
      term = put_syntax_sort_0_1.instance.invoke(context, f_218, term);
      if(term == null)
        break Fail526;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}