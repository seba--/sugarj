package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Some_0_1 extends Strategy 
{ 
  public static smart_$Some_0_1 instance = new smart_$Some_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_357)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_357 = new TermReference(ref_d_357);
    context.push("smart_Some_0_1");
    Fail41:
    { 
      Success9:
      { 
        Fail42:
        { 
          IStrategoTerm v_54 = null;
          IStrategoTerm x_54 = null;
          IStrategoTerm z_54 = null;
          IStrategoTerm d_55 = null;
          if(d_357.value == null)
            break Fail42;
          term = get_syntax_sort_0_0.instance.invoke(context, d_357.value);
          if(term == null)
            break Fail42;
          v_54 = term;
          if(d_357.value == null)
            break Fail42;
          term = (IStrategoTerm)termFactory.makeListCons(d_357.value, (IStrategoList)extraction.constNil0);
          x_54 = term;
          term = context.invokePrimitive("SUGARJ_unsafe_build", x_54, NO_STRATEGIES, new IStrategoTerm[]{extraction.const4});
          if(term == null)
            break Fail42;
          z_54 = term;
          term = (IStrategoTerm)termFactory.makeListCons(extraction.const5, termFactory.makeListCons((IStrategoTerm)termFactory.makeListCons(v_54, (IStrategoList)extraction.constNil0), (IStrategoList)extraction.constNil0));
          d_55 = term;
          term = context.invokePrimitive("SUGARJ_unsafe_build", d_55, NO_STRATEGIES, new IStrategoTerm[]{extraction.const6});
          if(term == null)
            break Fail42;
          term = put_syntax_sort_0_1.instance.invoke(context, z_54, term);
          if(term == null)
            break Fail42;
          if(true)
            break Success9;
        }
        IStrategoTerm i_54 = null;
        IStrategoTerm p_54 = null;
        IStrategoTerm t_54 = null;
        term = extraction.constNil0;
        lifted19 lifted1910 = new lifted19();
        lifted1910.d_357 = d_357;
        term = try_1_0.instance.invoke(context, term, lifted1910);
        if(term == null)
          break Fail41;
        i_54 = term;
        if(d_357.value == null)
          break Fail41;
        term = (IStrategoTerm)termFactory.makeListCons(d_357.value, (IStrategoList)extraction.constNil0);
        p_54 = term;
        term = context.invokePrimitive("SUGARJ_unsafe_build", p_54, NO_STRATEGIES, new IStrategoTerm[]{extraction.const4});
        if(term == null)
          break Fail41;
        t_54 = term;
        term = build_alt_sort_or_fail_0_0.instance.invoke(context, i_54);
        if(term == null)
          break Fail41;
        term = put_syntax_sort_0_1.instance.invoke(context, t_54, term);
        if(term == null)
          break Fail41;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}