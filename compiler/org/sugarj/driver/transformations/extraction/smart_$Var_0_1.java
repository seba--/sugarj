package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Var_0_1 extends Strategy 
{ 
  public static smart_$Var_0_1 instance = new smart_$Var_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_x_227)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference x_227 = new TermReference(ref_x_227);
    context.push("smart_Var_0_1");
    Fail542:
    { 
      IStrategoTerm y_227 = null;
      IStrategoTerm k_228 = null;
      IStrategoTerm m_228 = null;
      term = extraction.constNil0;
      lifted301 lifted3010 = new lifted301();
      lifted3010.x_227 = x_227;
      term = try_1_0.instance.invoke(context, term, lifted3010);
      if(term == null)
        break Fail542;
      lifted302 lifted3020 = new lifted302();
      lifted3020.x_227 = x_227;
      term = try_1_0.instance.invoke(context, term, lifted3020);
      if(term == null)
        break Fail542;
      y_227 = term;
      if(x_227.value == null)
        break Fail542;
      term = (IStrategoTerm)termFactory.makeListCons(x_227.value, (IStrategoList)extraction.constNil0);
      k_228 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_228, NO_STRATEGIES, new IStrategoTerm[]{extraction.const60});
      if(term == null)
        break Fail542;
      m_228 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_227);
      if(term == null)
        break Fail542;
      term = put_syntax_sort_0_1.instance.invoke(context, m_228, term);
      if(term == null)
        break Fail542;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}