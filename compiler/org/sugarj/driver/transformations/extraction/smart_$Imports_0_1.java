package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Imports_0_1 extends Strategy 
{ 
  public static smart_$Imports_0_1 instance = new smart_$Imports_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_174)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference e_174 = new TermReference(ref_e_174);
    context.push("smart_Imports_0_1");
    Fail463:
    { 
      IStrategoTerm f_174 = null;
      IStrategoTerm r_174 = null;
      IStrategoTerm t_174 = null;
      term = extraction.constNil0;
      lifted209 lifted2090 = new lifted209();
      lifted2090.e_174 = e_174;
      term = try_1_0.instance.invoke(context, term, lifted2090);
      if(term == null)
        break Fail463;
      lifted210 lifted2100 = new lifted210();
      lifted2100.e_174 = e_174;
      term = try_1_0.instance.invoke(context, term, lifted2100);
      if(term == null)
        break Fail463;
      f_174 = term;
      if(e_174.value == null)
        break Fail463;
      term = (IStrategoTerm)termFactory.makeListCons(e_174.value, (IStrategoList)extraction.constNil0);
      r_174 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", r_174, NO_STRATEGIES, new IStrategoTerm[]{extraction.const81});
      if(term == null)
        break Fail463;
      t_174 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, f_174);
      if(term == null)
        break Fail463;
      term = put_syntax_sort_0_1.instance.invoke(context, t_174, term);
      if(term == null)
        break Fail463;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}