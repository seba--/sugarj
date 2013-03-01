package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Intersect_3_0 extends Strategy 
{ 
  public static $Dyn$Rule$Intersect_3_0 instance = new $Dyn$Rule$Intersect_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_44, Strategy c_44, Strategy d_44)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersect_3_0");
    Fail295:
    { 
      IStrategoTerm p_184 = null;
      IStrategoTerm m_184 = null;
      IStrategoTerm n_184 = null;
      IStrategoTerm o_184 = null;
      IStrategoTerm q_184 = null;
      IStrategoTerm r_184 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersect_3 != ((IStrategoAppl)term).getConstructor())
        break Fail295;
      m_184 = term.getSubterm(0);
      n_184 = term.getSubterm(1);
      o_184 = term.getSubterm(2);
      IStrategoList annos242 = term.getAnnotations();
      p_184 = annos242;
      term = b_44.invoke(context, m_184);
      if(term == null)
        break Fail295;
      q_184 = term;
      term = c_44.invoke(context, n_184);
      if(term == null)
        break Fail295;
      r_184 = term;
      term = d_44.invoke(context, o_184);
      if(term == null)
        break Fail295;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersect_3, new IStrategoTerm[]{q_184, r_184, term}), checkListAnnos(termFactory, p_184));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}