package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Semantic$Observer_0_1 extends Strategy 
{ 
  public static smart_$Semantic$Observer_0_1 instance = new smart_$Semantic$Observer_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_f_112)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference f_112 = new TermReference(ref_f_112);
    context.push("smart_SemanticObserver_0_1");
    Fail374:
    { 
      IStrategoTerm g_112 = null;
      IStrategoTerm n_112 = null;
      IStrategoTerm p_112 = null;
      term = extraction.constNil0;
      lifted95 lifted950 = new lifted95();
      lifted950.f_112 = f_112;
      term = try_1_0.instance.invoke(context, term, lifted950);
      if(term == null)
        break Fail374;
      g_112 = term;
      if(f_112.value == null)
        break Fail374;
      term = (IStrategoTerm)termFactory.makeListCons(f_112.value, (IStrategoList)extraction.constNil0);
      n_112 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", n_112, NO_STRATEGIES, new IStrategoTerm[]{extraction.const365});
      if(term == null)
        break Fail374;
      p_112 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, g_112);
      if(term == null)
        break Fail374;
      term = put_syntax_sort_0_1.instance.invoke(context, p_112, term);
      if(term == null)
        break Fail374;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}