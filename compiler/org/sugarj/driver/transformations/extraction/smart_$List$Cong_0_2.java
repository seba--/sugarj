package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$List$Cong_0_2 extends Strategy 
{ 
  public static smart_$List$Cong_0_2 instance = new smart_$List$Cong_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_219, IStrategoTerm ref_e_219)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_219 = new TermReference(ref_c_219);
    TermReference e_219 = new TermReference(ref_e_219);
    context.push("smart_ListCong_0_2");
    Fail528:
    { 
      IStrategoTerm f_219 = null;
      IStrategoTerm s_219 = null;
      IStrategoTerm u_219 = null;
      term = extraction.constNil0;
      lifted287 lifted2870 = new lifted287();
      lifted2870.c_219 = c_219;
      lifted2870.e_219 = e_219;
      term = try_1_0.instance.invoke(context, term, lifted2870);
      if(term == null)
        break Fail528;
      f_219 = term;
      if(c_219.value == null || e_219.value == null)
        break Fail528;
      term = (IStrategoTerm)termFactory.makeListCons(c_219.value, termFactory.makeListCons(e_219.value, (IStrategoList)extraction.constNil0));
      s_219 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", s_219, NO_STRATEGIES, new IStrategoTerm[]{extraction.const492});
      if(term == null)
        break Fail528;
      u_219 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, f_219);
      if(term == null)
        break Fail528;
      term = put_syntax_sort_0_1.instance.invoke(context, u_219, term);
      if(term == null)
        break Fail528;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}