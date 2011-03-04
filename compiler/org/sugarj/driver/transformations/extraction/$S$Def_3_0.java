package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Def_3_0 extends Strategy 
{ 
  public static $S$Def_3_0 instance = new $S$Def_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_18, Strategy a_19, Strategy b_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDef_3_0");
    Fail66:
    { 
      IStrategoTerm k_111 = null;
      IStrategoTerm h_111 = null;
      IStrategoTerm i_111 = null;
      IStrategoTerm j_111 = null;
      IStrategoTerm l_111 = null;
      IStrategoTerm m_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail66;
      h_111 = term.getSubterm(0);
      i_111 = term.getSubterm(1);
      j_111 = term.getSubterm(2);
      IStrategoList annos42 = term.getAnnotations();
      k_111 = annos42;
      term = z_18.invoke(context, h_111);
      if(term == null)
        break Fail66;
      l_111 = term;
      term = a_19.invoke(context, i_111);
      if(term == null)
        break Fail66;
      m_111 = term;
      term = b_19.invoke(context, j_111);
      if(term == null)
        break Fail66;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSDef_3, new IStrategoTerm[]{l_111, m_111, term}), checkListAnnos(termFactory, k_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}