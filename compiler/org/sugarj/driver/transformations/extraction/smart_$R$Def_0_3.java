package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$R$Def_0_3 extends Strategy 
{ 
  public static smart_$R$Def_0_3 instance = new smart_$R$Def_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_f_201, IStrategoTerm ref_g_201, IStrategoTerm ref_h_201)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference f_201 = new TermReference(ref_f_201);
    TermReference g_201 = new TermReference(ref_g_201);
    TermReference h_201 = new TermReference(ref_h_201);
    context.push("smart_RDef_0_3");
    Fail499:
    { 
      IStrategoTerm i_201 = null;
      IStrategoTerm y_201 = null;
      IStrategoTerm a_202 = null;
      term = extraction.constNil0;
      lifted257 lifted2570 = new lifted257();
      lifted2570.f_201 = f_201;
      lifted2570.g_201 = g_201;
      lifted2570.h_201 = h_201;
      term = try_1_0.instance.invoke(context, term, lifted2570);
      if(term == null)
        break Fail499;
      i_201 = term;
      if(f_201.value == null || (g_201.value == null || h_201.value == null))
        break Fail499;
      term = (IStrategoTerm)termFactory.makeListCons(f_201.value, termFactory.makeListCons(g_201.value, termFactory.makeListCons(h_201.value, (IStrategoList)extraction.constNil0)));
      y_201 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", y_201, NO_STRATEGIES, new IStrategoTerm[]{extraction.const465});
      if(term == null)
        break Fail499;
      a_202 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, i_201);
      if(term == null)
        break Fail499;
      term = put_syntax_sort_0_1.instance.invoke(context, a_202, term);
      if(term == null)
        break Fail499;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}