package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Start$Symbols_0_1 extends Strategy 
{ 
  public static smart_$Start$Symbols_0_1 instance = new smart_$Start$Symbols_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_160)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference u_160 = new TermReference(ref_u_160);
    context.push("smart_StartSymbols_0_1");
    Fail443:
    { 
      IStrategoTerm v_160 = null;
      IStrategoTerm h_161 = null;
      IStrategoTerm j_161 = null;
      term = extraction.constNil0;
      lifted187 lifted1870 = new lifted187();
      lifted1870.u_160 = u_160;
      term = try_1_0.instance.invoke(context, term, lifted1870);
      if(term == null)
        break Fail443;
      lifted188 lifted1880 = new lifted188();
      lifted1880.u_160 = u_160;
      term = try_1_0.instance.invoke(context, term, lifted1880);
      if(term == null)
        break Fail443;
      v_160 = term;
      if(u_160.value == null)
        break Fail443;
      term = (IStrategoTerm)termFactory.makeListCons(u_160.value, (IStrategoList)extraction.constNil0);
      h_161 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", h_161, NO_STRATEGIES, new IStrategoTerm[]{extraction.const426});
      if(term == null)
        break Fail443;
      j_161 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, v_160);
      if(term == null)
        break Fail443;
      term = put_syntax_sort_0_1.instance.invoke(context, j_161, term);
      if(term == null)
        break Fail443;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}