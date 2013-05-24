package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Attribute_0_3 extends Strategy 
{ 
  public static smart_$Attribute_0_3 instance = new smart_$Attribute_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_f_133, IStrategoTerm ref_j_133, IStrategoTerm ref_l_133)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference f_133 = new TermReference(ref_f_133);
    TermReference j_133 = new TermReference(ref_j_133);
    TermReference l_133 = new TermReference(ref_l_133);
    context.push("smart_Attribute_0_3");
    Fail404:
    { 
      IStrategoTerm m_133 = null;
      IStrategoTerm d_135 = null;
      IStrategoTerm i_135 = null;
      term = extraction.constNil0;
      lifted137 lifted1370 = new lifted137();
      lifted1370.f_133 = f_133;
      lifted1370.j_133 = j_133;
      lifted1370.l_133 = l_133;
      term = try_1_0.instance.invoke(context, term, lifted1370);
      if(term == null)
        break Fail404;
      m_133 = term;
      if(f_133.value == null || (j_133.value == null || l_133.value == null))
        break Fail404;
      term = (IStrategoTerm)termFactory.makeListCons(f_133.value, termFactory.makeListCons(j_133.value, termFactory.makeListCons(l_133.value, (IStrategoList)extraction.constNil0)));
      d_135 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", d_135, NO_STRATEGIES, new IStrategoTerm[]{extraction.const126});
      if(term == null)
        break Fail404;
      i_135 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, m_133);
      if(term == null)
        break Fail404;
      term = put_syntax_sort_0_1.instance.invoke(context, i_135, term);
      if(term == null)
        break Fail404;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}