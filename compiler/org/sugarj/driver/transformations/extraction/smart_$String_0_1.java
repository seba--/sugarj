package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$String_0_1 extends Strategy 
{ 
  public static smart_$String_0_1 instance = new smart_$String_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_170)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference r_170 = new TermReference(ref_r_170);
    context.push("smart_String_0_1");
    Fail458:
    { 
      IStrategoTerm s_170 = null;
      IStrategoTerm a_171 = null;
      IStrategoTerm i_171 = null;
      term = extraction.constNil0;
      lifted204 lifted2040 = new lifted204();
      lifted2040.r_170 = r_170;
      term = try_1_0.instance.invoke(context, term, lifted2040);
      if(term == null)
        break Fail458;
      s_170 = term;
      if(r_170.value == null)
        break Fail458;
      term = (IStrategoTerm)termFactory.makeListCons(r_170.value, (IStrategoList)extraction.constNil0);
      a_171 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", a_171, NO_STRATEGIES, new IStrategoTerm[]{extraction.const25});
      if(term == null)
        break Fail458;
      i_171 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_170);
      if(term == null)
        break Fail458;
      term = put_syntax_sort_0_1.instance.invoke(context, i_171, term);
      if(term == null)
        break Fail458;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}