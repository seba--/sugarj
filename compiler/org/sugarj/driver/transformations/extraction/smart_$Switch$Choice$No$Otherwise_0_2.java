package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Switch$Choice$No$Otherwise_0_2 extends Strategy 
{ 
  public static smart_$Switch$Choice$No$Otherwise_0_2 instance = new smart_$Switch$Choice$No$Otherwise_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_225, IStrategoTerm ref_b_225)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference a_225 = new TermReference(ref_a_225);
    TermReference b_225 = new TermReference(ref_b_225);
    context.push("smart_SwitchChoiceNoOtherwise_0_2");
    Fail537:
    { 
      IStrategoTerm c_225 = null;
      IStrategoTerm m_225 = null;
      IStrategoTerm o_225 = null;
      term = extraction.constNil0;
      lifted296 lifted2960 = new lifted296();
      lifted2960.a_225 = a_225;
      lifted2960.b_225 = b_225;
      term = try_1_0.instance.invoke(context, term, lifted2960);
      if(term == null)
        break Fail537;
      c_225 = term;
      if(a_225.value == null || b_225.value == null)
        break Fail537;
      term = (IStrategoTerm)termFactory.makeListCons(a_225.value, termFactory.makeListCons(b_225.value, (IStrategoList)extraction.constNil0));
      m_225 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_225, NO_STRATEGIES, new IStrategoTerm[]{extraction.const501});
      if(term == null)
        break Fail537;
      o_225 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, c_225);
      if(term == null)
        break Fail537;
      term = put_syntax_sort_0_1.instance.invoke(context, o_225, term);
      if(term == null)
        break Fail537;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}