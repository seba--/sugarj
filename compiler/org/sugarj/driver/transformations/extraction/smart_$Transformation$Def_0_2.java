package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Transformation$Def_0_2 extends Strategy 
{ 
  public static smart_$Transformation$Def_0_2 instance = new smart_$Transformation$Def_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_h_92, IStrategoTerm ref_i_92)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_92 = new TermReference(ref_h_92);
    TermReference i_92 = new TermReference(ref_i_92);
    context.push("smart_TransformationDef_0_2");
    Fail344:
    { 
      IStrategoTerm j_92 = null;
      IStrategoTerm y_92 = null;
      IStrategoTerm c_93 = null;
      term = extraction.constNil0;
      lifted47 lifted4710 = new lifted47();
      lifted4710.h_92 = h_92;
      lifted4710.i_92 = i_92;
      term = try_1_0.instance.invoke(context, term, lifted4710);
      if(term == null)
        break Fail344;
      j_92 = term;
      if(h_92.value == null || i_92.value == null)
        break Fail344;
      term = (IStrategoTerm)termFactory.makeListCons(h_92.value, termFactory.makeListCons(i_92.value, (IStrategoList)extraction.constNil0));
      y_92 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", y_92, NO_STRATEGIES, new IStrategoTerm[]{extraction.const92});
      if(term == null)
        break Fail344;
      c_93 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_92);
      if(term == null)
        break Fail344;
      term = put_syntax_sort_0_1.instance.invoke(context, c_93, term);
      if(term == null)
        break Fail344;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}