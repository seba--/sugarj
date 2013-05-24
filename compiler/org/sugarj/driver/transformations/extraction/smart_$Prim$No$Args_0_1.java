package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Prim$No$Args_0_1 extends Strategy 
{ 
  public static smart_$Prim$No$Args_0_1 instance = new smart_$Prim$No$Args_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_211)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference v_211 = new TermReference(ref_v_211);
    context.push("smart_PrimNoArgs_0_1");
    Fail516:
    { 
      IStrategoTerm w_211 = null;
      IStrategoTerm d_212 = null;
      IStrategoTerm f_212 = null;
      term = extraction.constNil0;
      lifted275 lifted2750 = new lifted275();
      lifted2750.v_211 = v_211;
      term = try_1_0.instance.invoke(context, term, lifted2750);
      if(term == null)
        break Fail516;
      w_211 = term;
      if(v_211.value == null)
        break Fail516;
      term = (IStrategoTerm)termFactory.makeListCons(v_211.value, (IStrategoList)extraction.constNil0);
      d_212 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", d_212, NO_STRATEGIES, new IStrategoTerm[]{extraction.const481});
      if(term == null)
        break Fail516;
      f_212 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, w_211);
      if(term == null)
        break Fail516;
      term = put_syntax_sort_0_1.instance.invoke(context, f_212, term);
      if(term == null)
        break Fail516;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}