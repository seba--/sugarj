package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Real_0_1 extends Strategy 
{ 
  public static smart_$Real_0_1 instance = new smart_$Real_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_249)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_249 = new TermReference(ref_z_249);
    context.push("smart_Real_0_1");
    Fail575:
    { 
      IStrategoTerm a_250 = null;
      IStrategoTerm j_250 = null;
      IStrategoTerm l_250 = null;
      term = extraction.constNil0;
      lifted343 lifted3430 = new lifted343();
      lifted3430.z_249 = z_249;
      term = try_1_0.instance.invoke(context, term, lifted3430);
      if(term == null)
        break Fail575;
      a_250 = term;
      if(z_249.value == null)
        break Fail575;
      term = (IStrategoTerm)termFactory.makeListCons(z_249.value, (IStrategoList)extraction.constNil0);
      j_250 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", j_250, NO_STRATEGIES, new IStrategoTerm[]{extraction.const24});
      if(term == null)
        break Fail575;
      l_250 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, a_250);
      if(term == null)
        break Fail575;
      term = put_syntax_sort_0_1.instance.invoke(context, l_250, term);
      if(term == null)
        break Fail575;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}