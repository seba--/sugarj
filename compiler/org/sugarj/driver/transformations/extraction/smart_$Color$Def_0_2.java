package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Color$Def_0_2 extends Strategy 
{ 
  public static smart_$Color$Def_0_2 instance = new smart_$Color$Def_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_144, IStrategoTerm ref_v_144)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference u_144 = new TermReference(ref_u_144);
    TermReference v_144 = new TermReference(ref_v_144);
    context.push("smart_ColorDef_0_2");
    Fail424:
    { 
      IStrategoTerm w_144 = null;
      IStrategoTerm w_145 = null;
      IStrategoTerm z_145 = null;
      term = extraction.constNil0;
      lifted158 lifted1580 = new lifted158();
      lifted1580.u_144 = u_144;
      lifted1580.v_144 = v_144;
      term = try_1_0.instance.invoke(context, term, lifted1580);
      if(term == null)
        break Fail424;
      w_144 = term;
      if(u_144.value == null || v_144.value == null)
        break Fail424;
      term = (IStrategoTerm)termFactory.makeListCons(u_144.value, termFactory.makeListCons(v_144.value, (IStrategoList)extraction.constNil0));
      w_145 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", w_145, NO_STRATEGIES, new IStrategoTerm[]{extraction.const410});
      if(term == null)
        break Fail424;
      z_145 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, w_144);
      if(term == null)
        break Fail424;
      term = put_syntax_sort_0_1.instance.invoke(context, z_145, term);
      if(term == null)
        break Fail424;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}