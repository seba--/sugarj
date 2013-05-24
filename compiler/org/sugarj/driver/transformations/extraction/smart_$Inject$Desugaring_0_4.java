package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Inject$Desugaring_0_4 extends Strategy 
{ 
  public static smart_$Inject$Desugaring_0_4 instance = new smart_$Inject$Desugaring_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_107, IStrategoTerm ref_s_107, IStrategoTerm ref_t_107, IStrategoTerm ref_u_107)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference r_107 = new TermReference(ref_r_107);
    TermReference s_107 = new TermReference(ref_s_107);
    TermReference t_107 = new TermReference(ref_t_107);
    TermReference u_107 = new TermReference(ref_u_107);
    context.push("smart_InjectDesugaring_0_4");
    Fail368:
    { 
      IStrategoTerm v_107 = null;
      IStrategoTerm l_108 = null;
      IStrategoTerm n_108 = null;
      term = extraction.constNil0;
      lifted88 lifted880 = new lifted88();
      lifted880.r_107 = r_107;
      lifted880.s_107 = s_107;
      lifted880.t_107 = t_107;
      lifted880.u_107 = u_107;
      term = try_1_0.instance.invoke(context, term, lifted880);
      if(term == null)
        break Fail368;
      v_107 = term;
      if(r_107.value == null || (s_107.value == null || (t_107.value == null || u_107.value == null)))
        break Fail368;
      term = (IStrategoTerm)termFactory.makeListCons(r_107.value, termFactory.makeListCons(s_107.value, termFactory.makeListCons(t_107.value, termFactory.makeListCons(u_107.value, (IStrategoList)extraction.constNil0))));
      l_108 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", l_108, NO_STRATEGIES, new IStrategoTerm[]{extraction.const359});
      if(term == null)
        break Fail368;
      n_108 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, v_107);
      if(term == null)
        break Fail368;
      term = put_syntax_sort_0_1.instance.invoke(context, n_108, term);
      if(term == null)
        break Fail368;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}