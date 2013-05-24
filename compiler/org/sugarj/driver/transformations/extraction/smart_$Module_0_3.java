package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Module_0_3 extends Strategy 
{ 
  public static smart_$Module_0_3 instance = new smart_$Module_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_173, IStrategoTerm ref_f_173, IStrategoTerm ref_g_173)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference e_173 = new TermReference(ref_e_173);
    TermReference f_173 = new TermReference(ref_f_173);
    TermReference g_173 = new TermReference(ref_g_173);
    context.push("smart_Module_0_3");
    Fail462:
    { 
      IStrategoTerm h_173 = null;
      IStrategoTerm a_174 = null;
      IStrategoTerm c_174 = null;
      term = extraction.constNil0;
      lifted208 lifted2080 = new lifted208();
      lifted2080.e_173 = e_173;
      lifted2080.f_173 = f_173;
      lifted2080.g_173 = g_173;
      term = try_1_0.instance.invoke(context, term, lifted2080);
      if(term == null)
        break Fail462;
      h_173 = term;
      if(e_173.value == null || (f_173.value == null || g_173.value == null))
        break Fail462;
      term = (IStrategoTerm)termFactory.makeListCons(e_173.value, termFactory.makeListCons(f_173.value, termFactory.makeListCons(g_173.value, (IStrategoList)extraction.constNil0)));
      a_174 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", a_174, NO_STRATEGIES, new IStrategoTerm[]{extraction.const76});
      if(term == null)
        break Fail462;
      c_174 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, h_173);
      if(term == null)
        break Fail462;
      term = put_syntax_sort_0_1.instance.invoke(context, c_174, term);
      if(term == null)
        break Fail462;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}