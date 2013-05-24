package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Ext$Op$Decl$Q_0_2 extends Strategy 
{ 
  public static smart_$Ext$Op$Decl$Q_0_2 instance = new smart_$Ext$Op$Decl$Q_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_s_246, IStrategoTerm ref_t_246)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference s_246 = new TermReference(ref_s_246);
    TermReference t_246 = new TermReference(ref_t_246);
    context.push("smart_ExtOpDeclQ_0_2");
    Fail569:
    { 
      IStrategoTerm v_246 = null;
      IStrategoTerm h_247 = null;
      IStrategoTerm j_247 = null;
      term = extraction.constNil0;
      lifted337 lifted3370 = new lifted337();
      lifted3370.s_246 = s_246;
      lifted3370.t_246 = t_246;
      term = try_1_0.instance.invoke(context, term, lifted3370);
      if(term == null)
        break Fail569;
      v_246 = term;
      if(s_246.value == null || t_246.value == null)
        break Fail569;
      term = (IStrategoTerm)termFactory.makeListCons(s_246.value, termFactory.makeListCons(t_246.value, (IStrategoList)extraction.constNil0));
      h_247 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", h_247, NO_STRATEGIES, new IStrategoTerm[]{extraction.const528});
      if(term == null)
        break Fail569;
      j_247 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, v_246);
      if(term == null)
        break Fail569;
      term = put_syntax_sort_0_1.instance.invoke(context, j_247, term);
      if(term == null)
        break Fail569;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}