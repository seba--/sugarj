package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Guarded$L$Choice_0_3 extends Strategy 
{ 
  public static smart_$Guarded$L$Choice_0_3 instance = new smart_$Guarded$L$Choice_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_h_262, IStrategoTerm ref_i_262, IStrategoTerm ref_j_262)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_262 = new TermReference(ref_h_262);
    TermReference i_262 = new TermReference(ref_i_262);
    TermReference j_262 = new TermReference(ref_j_262);
    context.push("smart_GuardedLChoice_0_3");
    Fail594:
    { 
      IStrategoTerm k_262 = null;
      IStrategoTerm n_263 = null;
      IStrategoTerm t_263 = null;
      term = extraction.constNil0;
      lifted364 lifted3640 = new lifted364();
      lifted3640.h_262 = h_262;
      lifted3640.i_262 = i_262;
      lifted3640.j_262 = j_262;
      term = try_1_0.instance.invoke(context, term, lifted3640);
      if(term == null)
        break Fail594;
      lifted365 lifted3650 = new lifted365();
      lifted3650.h_262 = h_262;
      lifted3650.i_262 = i_262;
      lifted3650.j_262 = j_262;
      term = try_1_0.instance.invoke(context, term, lifted3650);
      if(term == null)
        break Fail594;
      k_262 = term;
      if(h_262.value == null || (i_262.value == null || j_262.value == null))
        break Fail594;
      term = (IStrategoTerm)termFactory.makeListCons(h_262.value, termFactory.makeListCons(i_262.value, termFactory.makeListCons(j_262.value, (IStrategoList)extraction.constNil0)));
      n_263 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", n_263, NO_STRATEGIES, new IStrategoTerm[]{extraction.const546});
      if(term == null)
        break Fail594;
      t_263 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_262);
      if(term == null)
        break Fail594;
      term = put_syntax_sort_0_1.instance.invoke(context, t_263, term);
      if(term == null)
        break Fail594;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}