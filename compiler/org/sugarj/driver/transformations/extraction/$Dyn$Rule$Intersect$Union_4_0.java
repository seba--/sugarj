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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_19, Strategy p_19, Strategy q_19, Strategy r_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectUnion_4_0");
    Fail82:
    { 
      IStrategoTerm c_113 = null;
      IStrategoTerm y_112 = null;
      IStrategoTerm z_112 = null;
      IStrategoTerm a_113 = null;
      IStrategoTerm b_113 = null;
      IStrategoTerm d_113 = null;
      IStrategoTerm e_113 = null;
      IStrategoTerm f_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consDynRuleIntersectUnion_4 != ((IStrategoAppl)term).getConstructor())
        break Fail82;
      y_112 = term.getSubterm(0);
      z_112 = term.getSubterm(1);
      a_113 = term.getSubterm(2);
      b_113 = term.getSubterm(3);
      IStrategoList annos55 = term.getAnnotations();
      c_113 = annos55;
      term = o_19.invoke(context, y_112);
      if(term == null)
        break Fail82;
      d_113 = term;
      term = p_19.invoke(context, z_112);
      if(term == null)
        break Fail82;
      e_113 = term;
      term = q_19.invoke(context, a_113);
      if(term == null)
        break Fail82;
      f_113 = term;
      term = r_19.invoke(context, b_113);
      if(term == null)
        break Fail82;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consDynRuleIntersectUnion_4, new IStrategoTerm[]{d_113, e_113, f_113, term}), checkListAnnos(termFactory, c_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}