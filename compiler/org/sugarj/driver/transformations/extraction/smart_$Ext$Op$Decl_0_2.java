package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Ext$Op$Decl_0_2 extends Strategy 
{ 
  public static smart_$Ext$Op$Decl_0_2 instance = new smart_$Ext$Op$Decl_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_246, IStrategoTerm ref_d_246)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_246 = new TermReference(ref_c_246);
    TermReference d_246 = new TermReference(ref_d_246);
    context.push("smart_ExtOpDecl_0_2");
    Fail568:
    { 
      IStrategoTerm e_246 = null;
      IStrategoTerm o_246 = null;
      IStrategoTerm r_246 = null;
      term = extraction.constNil0;
      lifted336 lifted3360 = new lifted336();
      lifted3360.c_246 = c_246;
      lifted3360.d_246 = d_246;
      term = try_1_0.instance.invoke(context, term, lifted3360);
      if(term == null)
        break Fail568;
      e_246 = term;
      if(c_246.value == null || d_246.value == null)
        break Fail568;
      term = (IStrategoTerm)termFactory.makeListCons(c_246.value, termFactory.makeListCons(d_246.value, (IStrategoList)extraction.constNil0));
      o_246 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", o_246, NO_STRATEGIES, new IStrategoTerm[]{extraction.const527});
      if(term == null)
        break Fail568;
      r_246 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, e_246);
      if(term == null)
        break Fail568;
      term = put_syntax_sort_0_1.instance.invoke(context, r_246, term);
      if(term == null)
        break Fail568;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}