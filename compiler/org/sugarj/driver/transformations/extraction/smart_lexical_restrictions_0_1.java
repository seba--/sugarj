package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_lexical_restrictions_0_1 extends Strategy 
{ 
  public static smart_lexical_restrictions_0_1 instance = new smart_lexical_restrictions_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_f_104)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference f_104 = new TermReference(ref_f_104);
    context.push("smart_lexical_restrictions_0_1");
    Fail362:
    { 
      IStrategoTerm h_104 = null;
      IStrategoTerm t_104 = null;
      IStrategoTerm v_104 = null;
      term = extraction.constNil0;
      lifted79 lifted790 = new lifted79();
      lifted790.f_104 = f_104;
      term = try_1_0.instance.invoke(context, term, lifted790);
      if(term == null)
        break Fail362;
      lifted80 lifted800 = new lifted80();
      lifted800.f_104 = f_104;
      term = try_1_0.instance.invoke(context, term, lifted800);
      if(term == null)
        break Fail362;
      h_104 = term;
      if(f_104.value == null)
        break Fail362;
      term = (IStrategoTerm)termFactory.makeListCons(f_104.value, (IStrategoList)extraction.constNil0);
      t_104 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_104, NO_STRATEGIES, new IStrategoTerm[]{extraction.const352});
      if(term == null)
        break Fail362;
      v_104 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, h_104);
      if(term == null)
        break Fail362;
      term = put_syntax_sort_0_1.instance.invoke(context, v_104, term);
      if(term == null)
        break Fail362;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}