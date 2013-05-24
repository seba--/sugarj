package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_restrictions_0_1 extends Strategy 
{ 
  public static smart_restrictions_0_1 instance = new smart_restrictions_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_103)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference n_103 = new TermReference(ref_n_103);
    context.push("smart_restrictions_0_1");
    Fail361:
    { 
      IStrategoTerm o_103 = null;
      IStrategoTerm c_104 = null;
      IStrategoTerm e_104 = null;
      term = extraction.constNil0;
      lifted77 lifted770 = new lifted77();
      lifted770.n_103 = n_103;
      term = try_1_0.instance.invoke(context, term, lifted770);
      if(term == null)
        break Fail361;
      lifted78 lifted780 = new lifted78();
      lifted780.n_103 = n_103;
      term = try_1_0.instance.invoke(context, term, lifted780);
      if(term == null)
        break Fail361;
      o_103 = term;
      if(n_103.value == null)
        break Fail361;
      term = (IStrategoTerm)termFactory.makeListCons(n_103.value, (IStrategoList)extraction.constNil0);
      c_104 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", c_104, NO_STRATEGIES, new IStrategoTerm[]{extraction.const351});
      if(term == null)
        break Fail361;
      e_104 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, o_103);
      if(term == null)
        break Fail361;
      term = put_syntax_sort_0_1.instance.invoke(context, e_104, term);
      if(term == null)
        break Fail361;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}