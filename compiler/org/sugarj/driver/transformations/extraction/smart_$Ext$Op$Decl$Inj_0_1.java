package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Ext$Op$Decl$Inj_0_1 extends Strategy 
{ 
  public static smart_$Ext$Op$Decl$Inj_0_1 instance = new smart_$Ext$Op$Decl$Inj_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_247)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference k_247 = new TermReference(ref_k_247);
    context.push("smart_ExtOpDeclInj_0_1");
    Fail570:
    { 
      IStrategoTerm l_247 = null;
      IStrategoTerm t_247 = null;
      IStrategoTerm v_247 = null;
      term = extraction.constNil0;
      lifted338 lifted3380 = new lifted338();
      lifted3380.k_247 = k_247;
      term = try_1_0.instance.invoke(context, term, lifted3380);
      if(term == null)
        break Fail570;
      l_247 = term;
      if(k_247.value == null)
        break Fail570;
      term = (IStrategoTerm)termFactory.makeListCons(k_247.value, (IStrategoList)extraction.constNil0);
      t_247 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_247, NO_STRATEGIES, new IStrategoTerm[]{extraction.const529});
      if(term == null)
        break Fail570;
      v_247 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, l_247);
      if(term == null)
        break Fail570;
      term = put_syntax_sort_0_1.instance.invoke(context, v_247, term);
      if(term == null)
        break Fail570;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}