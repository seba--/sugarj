package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$R$Def$T_0_4 extends Strategy 
{ 
  public static smart_$R$Def$T_0_4 instance = new smart_$R$Def$T_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_202, IStrategoTerm ref_c_202, IStrategoTerm ref_d_202, IStrategoTerm ref_f_202)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference b_202 = new TermReference(ref_b_202);
    TermReference c_202 = new TermReference(ref_c_202);
    TermReference d_202 = new TermReference(ref_d_202);
    TermReference f_202 = new TermReference(ref_f_202);
    context.push("smart_RDefT_0_4");
    Fail500:
    { 
      IStrategoTerm g_202 = null;
      IStrategoTerm w_202 = null;
      IStrategoTerm y_202 = null;
      term = extraction.constNil0;
      lifted258 lifted2580 = new lifted258();
      lifted2580.b_202 = b_202;
      lifted2580.c_202 = c_202;
      lifted2580.d_202 = d_202;
      lifted2580.f_202 = f_202;
      term = try_1_0.instance.invoke(context, term, lifted2580);
      if(term == null)
        break Fail500;
      g_202 = term;
      if(b_202.value == null || (c_202.value == null || (d_202.value == null || f_202.value == null)))
        break Fail500;
      term = (IStrategoTerm)termFactory.makeListCons(b_202.value, termFactory.makeListCons(c_202.value, termFactory.makeListCons(d_202.value, termFactory.makeListCons(f_202.value, (IStrategoList)extraction.constNil0))));
      w_202 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", w_202, NO_STRATEGIES, new IStrategoTerm[]{extraction.const466});
      if(term == null)
        break Fail500;
      y_202 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, g_202);
      if(term == null)
        break Fail500;
      term = put_syntax_sort_0_1.instance.invoke(context, y_202, term);
      if(term == null)
        break Fail500;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}