package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Op$Decl_0_2 extends Strategy 
{ 
  public static smart_$Op$Decl_0_2 instance = new smart_$Op$Decl_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_h_244, IStrategoTerm ref_i_244)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_244 = new TermReference(ref_h_244);
    TermReference i_244 = new TermReference(ref_i_244);
    context.push("smart_OpDecl_0_2");
    Fail565:
    { 
      IStrategoTerm j_244 = null;
      IStrategoTerm v_244 = null;
      IStrategoTerm y_244 = null;
      term = extraction.constNil0;
      lifted333 lifted3330 = new lifted333();
      lifted3330.h_244 = h_244;
      lifted3330.i_244 = i_244;
      term = try_1_0.instance.invoke(context, term, lifted3330);
      if(term == null)
        break Fail565;
      j_244 = term;
      if(h_244.value == null || i_244.value == null)
        break Fail565;
      term = (IStrategoTerm)termFactory.makeListCons(h_244.value, termFactory.makeListCons(i_244.value, (IStrategoList)extraction.constNil0));
      v_244 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", v_244, NO_STRATEGIES, new IStrategoTerm[]{extraction.const524});
      if(term == null)
        break Fail565;
      y_244 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_244);
      if(term == null)
        break Fail565;
      term = put_syntax_sort_0_1.instance.invoke(context, y_244, term);
      if(term == null)
        break Fail565;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}