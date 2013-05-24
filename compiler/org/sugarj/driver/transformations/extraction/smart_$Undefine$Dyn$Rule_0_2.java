package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Undefine$Dyn$Rule_0_2 extends Strategy 
{ 
  public static smart_$Undefine$Dyn$Rule_0_2 instance = new smart_$Undefine$Dyn$Rule_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_180, IStrategoTerm ref_e_180)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_180 = new TermReference(ref_d_180);
    TermReference e_180 = new TermReference(ref_e_180);
    context.push("smart_UndefineDynRule_0_2");
    Fail473:
    { 
      IStrategoTerm f_180 = null;
      IStrategoTerm p_180 = null;
      IStrategoTerm r_180 = null;
      term = extraction.constNil0;
      lifted221 lifted2210 = new lifted221();
      lifted2210.d_180 = d_180;
      lifted2210.e_180 = e_180;
      term = try_1_0.instance.invoke(context, term, lifted2210);
      if(term == null)
        break Fail473;
      f_180 = term;
      if(d_180.value == null || e_180.value == null)
        break Fail473;
      term = (IStrategoTerm)termFactory.makeListCons(d_180.value, termFactory.makeListCons(e_180.value, (IStrategoList)extraction.constNil0));
      p_180 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", p_180, NO_STRATEGIES, new IStrategoTerm[]{extraction.const442});
      if(term == null)
        break Fail473;
      r_180 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, f_180);
      if(term == null)
        break Fail473;
      term = put_syntax_sort_0_1.instance.invoke(context, r_180, term);
      if(term == null)
        break Fail473;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}