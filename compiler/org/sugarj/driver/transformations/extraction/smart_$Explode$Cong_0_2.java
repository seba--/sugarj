package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Explode$Cong_0_2 extends Strategy 
{ 
  public static smart_$Explode$Cong_0_2 instance = new smart_$Explode$Cong_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_219, IStrategoTerm ref_w_219)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference v_219 = new TermReference(ref_v_219);
    TermReference w_219 = new TermReference(ref_w_219);
    context.push("smart_ExplodeCong_0_2");
    Fail529:
    { 
      IStrategoTerm z_219 = null;
      IStrategoTerm m_220 = null;
      IStrategoTerm o_220 = null;
      term = extraction.constNil0;
      lifted288 lifted2880 = new lifted288();
      lifted2880.v_219 = v_219;
      lifted2880.w_219 = w_219;
      term = try_1_0.instance.invoke(context, term, lifted2880);
      if(term == null)
        break Fail529;
      z_219 = term;
      if(v_219.value == null || w_219.value == null)
        break Fail529;
      term = (IStrategoTerm)termFactory.makeListCons(v_219.value, termFactory.makeListCons(w_219.value, (IStrategoList)extraction.constNil0));
      m_220 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_220, NO_STRATEGIES, new IStrategoTerm[]{extraction.const493});
      if(term == null)
        break Fail529;
      o_220 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, z_219);
      if(term == null)
        break Fail529;
      term = put_syntax_sort_0_1.instance.invoke(context, o_220, term);
      if(term == null)
        break Fail529;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}