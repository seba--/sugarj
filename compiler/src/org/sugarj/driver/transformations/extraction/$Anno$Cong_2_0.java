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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_21, Strategy n_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoCong_2_0");
    Fail107:
    { 
      IStrategoTerm c_118 = null;
      IStrategoTerm a_118 = null;
      IStrategoTerm b_118 = null;
      IStrategoTerm d_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consAnnoCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail107;
      a_118 = term.getSubterm(0);
      b_118 = term.getSubterm(1);
      IStrategoList annos79 = term.getAnnotations();
      c_118 = annos79;
      term = m_21.invoke(context, a_118);
      if(term == null)
        break Fail107;
      d_118 = term;
      term = n_21.invoke(context, b_118);
      if(term == null)
        break Fail107;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consAnnoCong_2, new IStrategoTerm[]{d_118, term}), checkListAnnos(termFactory, c_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}