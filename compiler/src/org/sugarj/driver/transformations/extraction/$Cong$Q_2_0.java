package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cong$Q_2_0 extends Strategy 
{ 
  public static $Cong$Q_2_0 instance = new $Cong$Q_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_21, Strategy p_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CongQ_2_0");
    Fail108:
    { 
      IStrategoTerm h_118 = null;
      IStrategoTerm f_118 = null;
      IStrategoTerm g_118 = null;
      IStrategoTerm i_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consCongQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail108;
      f_118 = term.getSubterm(0);
      g_118 = term.getSubterm(1);
      IStrategoList annos80 = term.getAnnotations();
      h_118 = annos80;
      term = o_21.invoke(context, f_118);
      if(term == null)
        break Fail108;
      i_118 = term;
      term = p_21.invoke(context, g_118);
      if(term == null)
        break Fail108;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consCongQ_2, new IStrategoTerm[]{i_118, term}), checkListAnnos(termFactory, h_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}