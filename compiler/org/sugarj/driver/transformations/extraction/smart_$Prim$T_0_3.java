package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Prim$T_0_3 extends Strategy 
{ 
  public static smart_$Prim$T_0_3 instance = new smart_$Prim$T_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_263, IStrategoTerm ref_v_263, IStrategoTerm ref_y_263)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference u_263 = new TermReference(ref_u_263);
    TermReference v_263 = new TermReference(ref_v_263);
    TermReference y_263 = new TermReference(ref_y_263);
    context.push("smart_PrimT_0_3");
    Fail595:
    { 
      IStrategoTerm z_263 = null;
      IStrategoTerm q_264 = null;
      IStrategoTerm s_264 = null;
      term = extraction.constNil0;
      lifted366 lifted3660 = new lifted366();
      lifted3660.u_263 = u_263;
      lifted3660.v_263 = v_263;
      lifted3660.y_263 = y_263;
      term = try_1_0.instance.invoke(context, term, lifted3660);
      if(term == null)
        break Fail595;
      z_263 = term;
      if(u_263.value == null || (v_263.value == null || y_263.value == null))
        break Fail595;
      term = (IStrategoTerm)termFactory.makeListCons(u_263.value, termFactory.makeListCons(v_263.value, termFactory.makeListCons(y_263.value, (IStrategoList)extraction.constNil0)));
      q_264 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", q_264, NO_STRATEGIES, new IStrategoTerm[]{extraction.const547});
      if(term == null)
        break Fail595;
      s_264 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, z_263);
      if(term == null)
        break Fail595;
      term = put_syntax_sort_0_1.instance.invoke(context, s_264, term);
      if(term == null)
        break Fail595;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}