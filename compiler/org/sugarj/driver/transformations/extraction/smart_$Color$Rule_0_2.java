package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Color$Rule_0_2 extends Strategy 
{ 
  public static smart_$Color$Rule_0_2 instance = new smart_$Color$Rule_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_129, IStrategoTerm ref_d_129)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_129 = new TermReference(ref_c_129);
    TermReference d_129 = new TermReference(ref_d_129);
    context.push("smart_ColorRule_0_2");
    Fail401:
    { 
      IStrategoTerm e_129 = null;
      IStrategoTerm v_129 = null;
      IStrategoTerm x_129 = null;
      term = extraction.constNil0;
      lifted133 lifted1330 = new lifted133();
      lifted1330.c_129 = c_129;
      lifted1330.d_129 = d_129;
      term = try_1_0.instance.invoke(context, term, lifted1330);
      if(term == null)
        break Fail401;
      e_129 = term;
      if(c_129.value == null || d_129.value == null)
        break Fail401;
      term = (IStrategoTerm)termFactory.makeListCons(c_129.value, termFactory.makeListCons(d_129.value, (IStrategoList)extraction.constNil0));
      v_129 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", v_129, NO_STRATEGIES, new IStrategoTerm[]{extraction.const128});
      if(term == null)
        break Fail401;
      x_129 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, e_129);
      if(term == null)
        break Fail401;
      term = put_syntax_sort_0_1.instance.invoke(context, x_129, term);
      if(term == null)
        break Fail401;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}