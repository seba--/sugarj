package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$S$Def$No$Args_0_2 extends Strategy 
{ 
  public static smart_$S$Def$No$Args_0_2 instance = new smart_$S$Def$No$Args_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_205, IStrategoTerm ref_v_205)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference u_205 = new TermReference(ref_u_205);
    TermReference v_205 = new TermReference(ref_v_205);
    context.push("smart_SDefNoArgs_0_2");
    Fail505:
    { 
      IStrategoTerm w_205 = null;
      IStrategoTerm i_206 = null;
      IStrategoTerm l_206 = null;
      term = extraction.constNil0;
      lifted264 lifted2640 = new lifted264();
      lifted2640.u_205 = u_205;
      lifted2640.v_205 = v_205;
      term = try_1_0.instance.invoke(context, term, lifted2640);
      if(term == null)
        break Fail505;
      w_205 = term;
      if(u_205.value == null || v_205.value == null)
        break Fail505;
      term = (IStrategoTerm)termFactory.makeListCons(u_205.value, termFactory.makeListCons(v_205.value, (IStrategoList)extraction.constNil0));
      i_206 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", i_206, NO_STRATEGIES, new IStrategoTerm[]{extraction.const470});
      if(term == null)
        break Fail505;
      l_206 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, w_205);
      if(term == null)
        break Fail505;
      term = put_syntax_sort_0_1.instance.invoke(context, l_206, term);
      if(term == null)
        break Fail505;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}