package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Block$Comment$Def_0_3 extends Strategy 
{ 
  public static smart_$Block$Comment$Def_0_3 instance = new smart_$Block$Comment$Def_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_g_167, IStrategoTerm ref_h_167, IStrategoTerm ref_i_167)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference g_167 = new TermReference(ref_g_167);
    TermReference h_167 = new TermReference(ref_h_167);
    TermReference i_167 = new TermReference(ref_i_167);
    context.push("smart_BlockCommentDef_0_3");
    Fail452:
    { 
      IStrategoTerm j_167 = null;
      IStrategoTerm j_168 = null;
      IStrategoTerm l_168 = null;
      term = extraction.constNil0;
      lifted197 lifted1970 = new lifted197();
      lifted1970.g_167 = g_167;
      lifted1970.h_167 = h_167;
      lifted1970.i_167 = i_167;
      term = try_1_0.instance.invoke(context, term, lifted1970);
      if(term == null)
        break Fail452;
      lifted198 lifted1980 = new lifted198();
      lifted1980.g_167 = g_167;
      lifted1980.h_167 = h_167;
      lifted1980.i_167 = i_167;
      term = try_1_0.instance.invoke(context, term, lifted1980);
      if(term == null)
        break Fail452;
      j_167 = term;
      if(g_167.value == null || (h_167.value == null || i_167.value == null))
        break Fail452;
      term = (IStrategoTerm)termFactory.makeListCons(g_167.value, termFactory.makeListCons(h_167.value, termFactory.makeListCons(i_167.value, (IStrategoList)extraction.constNil0)));
      j_168 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", j_168, NO_STRATEGIES, new IStrategoTerm[]{extraction.const142});
      if(term == null)
        break Fail452;
      l_168 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_167);
      if(term == null)
        break Fail452;
      term = put_syntax_sort_0_1.instance.invoke(context, l_168, term);
      if(term == null)
        break Fail452;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}