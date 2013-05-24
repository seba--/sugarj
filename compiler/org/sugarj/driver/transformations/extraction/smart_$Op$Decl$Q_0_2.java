package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Op$Decl$Q_0_2 extends Strategy 
{ 
  public static smart_$Op$Decl$Q_0_2 instance = new smart_$Op$Decl$Q_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_244, IStrategoTerm ref_a_245)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_244 = new TermReference(ref_z_244);
    TermReference a_245 = new TermReference(ref_a_245);
    context.push("smart_OpDeclQ_0_2");
    Fail566:
    { 
      IStrategoTerm b_245 = null;
      IStrategoTerm m_245 = null;
      IStrategoTerm o_245 = null;
      term = extraction.constNil0;
      lifted334 lifted3340 = new lifted334();
      lifted3340.z_244 = z_244;
      lifted3340.a_245 = a_245;
      term = try_1_0.instance.invoke(context, term, lifted3340);
      if(term == null)
        break Fail566;
      b_245 = term;
      if(z_244.value == null || a_245.value == null)
        break Fail566;
      term = (IStrategoTerm)termFactory.makeListCons(z_244.value, termFactory.makeListCons(a_245.value, (IStrategoList)extraction.constNil0));
      m_245 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_245, NO_STRATEGIES, new IStrategoTerm[]{extraction.const525});
      if(term == null)
        break Fail566;
      o_245 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, b_245);
      if(term == null)
        break Fail566;
      term = put_syntax_sort_0_1.instance.invoke(context, o_245, term);
      if(term == null)
        break Fail566;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}