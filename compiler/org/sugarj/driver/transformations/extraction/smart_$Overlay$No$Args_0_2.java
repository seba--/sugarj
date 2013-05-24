package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Overlay$No$Args_0_2 extends Strategy 
{ 
  public static smart_$Overlay$No$Args_0_2 instance = new smart_$Overlay$No$Args_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_h_176, IStrategoTerm ref_i_176)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_176 = new TermReference(ref_h_176);
    TermReference i_176 = new TermReference(ref_i_176);
    context.push("smart_OverlayNoArgs_0_2");
    Fail467:
    { 
      IStrategoTerm j_176 = null;
      IStrategoTerm t_176 = null;
      IStrategoTerm v_176 = null;
      term = extraction.constNil0;
      lifted215 lifted2150 = new lifted215();
      lifted2150.h_176 = h_176;
      lifted2150.i_176 = i_176;
      term = try_1_0.instance.invoke(context, term, lifted2150);
      if(term == null)
        break Fail467;
      j_176 = term;
      if(h_176.value == null || i_176.value == null)
        break Fail467;
      term = (IStrategoTerm)termFactory.makeListCons(h_176.value, termFactory.makeListCons(i_176.value, (IStrategoList)extraction.constNil0));
      t_176 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_176, NO_STRATEGIES, new IStrategoTerm[]{extraction.const438});
      if(term == null)
        break Fail467;
      v_176 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_176);
      if(term == null)
        break Fail467;
      term = put_syntax_sort_0_1.instance.invoke(context, v_176, term);
      if(term == null)
        break Fail467;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}