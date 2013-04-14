package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Anno$Cong_2_0 extends Strategy 
{ 
  public static $Anno$Cong_2_0 instance = new $Anno$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_21, Strategy m_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoCong_2_0");
    Fail95:
    { 
      IStrategoTerm u_117 = null;
      IStrategoTerm s_117 = null;
      IStrategoTerm t_117 = null;
      IStrategoTerm v_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consAnnoCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail95;
      s_117 = term.getSubterm(0);
      t_117 = term.getSubterm(1);
      IStrategoList annos70 = term.getAnnotations();
      u_117 = annos70;
      term = l_21.invoke(context, s_117);
      if(term == null)
        break Fail95;
      v_117 = term;
      term = m_21.invoke(context, t_117);
      if(term == null)
        break Fail95;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consAnnoCong_2, new IStrategoTerm[]{v_117, term}), checkListAnnos(termFactory, u_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}