package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Fold$Rule_0_2 extends Strategy 
{ 
  public static smart_$Fold$Rule_0_2 instance = new smart_$Fold$Rule_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_h_148, IStrategoTerm ref_i_148)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_148 = new TermReference(ref_h_148);
    TermReference i_148 = new TermReference(ref_i_148);
    context.push("smart_FoldRule_0_2");
    Fail428:
    { 
      IStrategoTerm j_148 = null;
      IStrategoTerm t_148 = null;
      IStrategoTerm v_148 = null;
      term = extraction.constNil0;
      lifted162 lifted1620 = new lifted162();
      lifted1620.h_148 = h_148;
      lifted1620.i_148 = i_148;
      term = try_1_0.instance.invoke(context, term, lifted1620);
      if(term == null)
        break Fail428;
      j_148 = term;
      if(h_148.value == null || i_148.value == null)
        break Fail428;
      term = (IStrategoTerm)termFactory.makeListCons(h_148.value, termFactory.makeListCons(i_148.value, (IStrategoList)extraction.constNil0));
      t_148 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_148, NO_STRATEGIES, new IStrategoTerm[]{extraction.const413});
      if(term == null)
        break Fail428;
      v_148 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_148);
      if(term == null)
        break Fail428;
      term = put_syntax_sort_0_1.instance.invoke(context, v_148, term);
      if(term == null)
        break Fail428;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}