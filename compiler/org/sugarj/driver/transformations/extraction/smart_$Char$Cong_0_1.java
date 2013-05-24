package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Char$Cong_0_1 extends Strategy 
{ 
  public static smart_$Char$Cong_0_1 instance = new smart_$Char$Cong_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_214)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference e_214 = new TermReference(ref_e_214);
    context.push("smart_CharCong_0_1");
    Fail521:
    { 
      IStrategoTerm f_214 = null;
      IStrategoTerm n_214 = null;
      IStrategoTerm p_214 = null;
      term = extraction.constNil0;
      lifted280 lifted2800 = new lifted280();
      lifted2800.e_214 = e_214;
      term = try_1_0.instance.invoke(context, term, lifted2800);
      if(term == null)
        break Fail521;
      f_214 = term;
      if(e_214.value == null)
        break Fail521;
      term = (IStrategoTerm)termFactory.makeListCons(e_214.value, (IStrategoList)extraction.constNil0);
      n_214 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", n_214, NO_STRATEGIES, new IStrategoTerm[]{extraction.const486});
      if(term == null)
        break Fail521;
      p_214 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, f_214);
      if(term == null)
        break Fail521;
      term = put_syntax_sort_0_1.instance.invoke(context, p_214, term);
      if(term == null)
        break Fail521;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}