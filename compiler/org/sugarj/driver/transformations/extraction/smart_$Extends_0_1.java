package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Extends_0_1 extends Strategy 
{ 
  public static smart_$Extends_0_1 instance = new smart_$Extends_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_162)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference i_162 = new TermReference(ref_i_162);
    context.push("smart_Extends_0_1");
    Fail445:
    { 
      IStrategoTerm j_162 = null;
      IStrategoTerm a_163 = null;
      IStrategoTerm c_163 = null;
      term = extraction.constNil0;
      lifted190 lifted1900 = new lifted190();
      lifted1900.i_162 = i_162;
      term = try_1_0.instance.invoke(context, term, lifted1900);
      if(term == null)
        break Fail445;
      j_162 = term;
      if(i_162.value == null)
        break Fail445;
      term = (IStrategoTerm)termFactory.makeListCons(i_162.value, (IStrategoList)extraction.constNil0);
      a_163 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", a_163, NO_STRATEGIES, new IStrategoTerm[]{extraction.const427});
      if(term == null)
        break Fail445;
      c_163 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_162);
      if(term == null)
        break Fail445;
      term = put_syntax_sort_0_1.instance.invoke(context, c_163, term);
      if(term == null)
        break Fail445;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}