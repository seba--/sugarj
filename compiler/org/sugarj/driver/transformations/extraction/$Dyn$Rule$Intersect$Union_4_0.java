package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Intersect$Union_4_0 extends Strategy 
{ 
  public static $Dyn$Rule$Intersect$Union_4_0 instance = new $Dyn$Rule$Intersect$Union_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_341, Strategy p_341, Strategy q_341, Strategy r_341)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectUnion_4_0");
    Fail879:
    { 
      IStrategoTerm f_444 = null;
      IStrategoTerm b_444 = null;
      IStrategoTerm c_444 = null;
      IStrategoTerm d_444 = null;
      IStrategoTerm e_444 = null;
      IStrategoTerm g_444 = null;
      IStrategoTerm h_444 = null;
      IStrategoTerm i_444 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consDynRuleIntersectUnion_4 != ((IStrategoAppl)term).getConstructor())
        break Fail879;
      b_444 = term.getSubterm(0);
      c_444 = term.getSubterm(1);
      d_444 = term.getSubterm(2);
      e_444 = term.getSubterm(3);
      IStrategoList annos125 = term.getAnnotations();
      f_444 = annos125;
      term = o_341.invoke(context, b_444);
      if(term == null)
        break Fail879;
      g_444 = term;
      term = p_341.invoke(context, c_444);
      if(term == null)
        break Fail879;
      h_444 = term;
      term = q_341.invoke(context, d_444);
      if(term == null)
        break Fail879;
      i_444 = term;
      term = r_341.invoke(context, e_444);
      if(term == null)
        break Fail879;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consDynRuleIntersectUnion_4, new IStrategoTerm[]{g_444, h_444, i_444, term}), checkListAnnos(termFactory, f_444));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}