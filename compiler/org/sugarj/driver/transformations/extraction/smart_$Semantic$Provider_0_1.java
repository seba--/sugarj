package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Semantic$Provider_0_1 extends Strategy 
{ 
  public static smart_$Semantic$Provider_0_1 instance = new smart_$Semantic$Provider_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_s_149)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference s_149 = new TermReference(ref_s_149);
    context.push("smart_SemanticProvider_0_1");
    Fail431:
    { 
      IStrategoTerm t_149 = null;
      IStrategoTerm m_151 = null;
      IStrategoTerm o_151 = null;
      term = extraction.constNil0;
      lifted165 lifted1650 = new lifted165();
      lifted1650.s_149 = s_149;
      term = try_1_0.instance.invoke(context, term, lifted1650);
      if(term == null)
        break Fail431;
      lifted166 lifted1660 = new lifted166();
      lifted1660.s_149 = s_149;
      term = try_1_0.instance.invoke(context, term, lifted1660);
      if(term == null)
        break Fail431;
      lifted167 lifted1670 = new lifted167();
      lifted1670.s_149 = s_149;
      term = try_1_0.instance.invoke(context, term, lifted1670);
      if(term == null)
        break Fail431;
      lifted168 lifted1680 = new lifted168();
      lifted1680.s_149 = s_149;
      term = try_1_0.instance.invoke(context, term, lifted1680);
      if(term == null)
        break Fail431;
      lifted169 lifted1690 = new lifted169();
      lifted1690.s_149 = s_149;
      term = try_1_0.instance.invoke(context, term, lifted1690);
      if(term == null)
        break Fail431;
      lifted170 lifted1700 = new lifted170();
      lifted1700.s_149 = s_149;
      term = try_1_0.instance.invoke(context, term, lifted1700);
      if(term == null)
        break Fail431;
      lifted171 lifted1711 = new lifted171();
      lifted1711.s_149 = s_149;
      term = try_1_0.instance.invoke(context, term, lifted1711);
      if(term == null)
        break Fail431;
      lifted172 lifted1720 = new lifted172();
      lifted1720.s_149 = s_149;
      term = try_1_0.instance.invoke(context, term, lifted1720);
      if(term == null)
        break Fail431;
      t_149 = term;
      if(s_149.value == null)
        break Fail431;
      term = (IStrategoTerm)termFactory.makeListCons(s_149.value, (IStrategoList)extraction.constNil0);
      m_151 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", m_151, NO_STRATEGIES, new IStrategoTerm[]{extraction.const416});
      if(term == null)
        break Fail431;
      o_151 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, t_149);
      if(term == null)
        break Fail431;
      term = put_syntax_sort_0_1.instance.invoke(context, o_151, term);
      if(term == null)
        break Fail431;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}