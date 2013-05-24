package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Def$T_4_0 extends Strategy 
{ 
  public static $S$Def$T_4_0 instance = new $S$Def$T_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_346, Strategy a_347, Strategy b_347, Strategy c_347)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDefT_4_0");
    Fail968:
    { 
      IStrategoTerm i_458 = null;
      IStrategoTerm e_458 = null;
      IStrategoTerm f_458 = null;
      IStrategoTerm g_458 = null;
      IStrategoTerm h_458 = null;
      IStrategoTerm j_458 = null;
      IStrategoTerm k_458 = null;
      IStrategoTerm l_458 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail968;
      e_458 = term.getSubterm(0);
      f_458 = term.getSubterm(1);
      g_458 = term.getSubterm(2);
      h_458 = term.getSubterm(3);
      IStrategoList annos210 = term.getAnnotations();
      i_458 = annos210;
      term = z_346.invoke(context, e_458);
      if(term == null)
        break Fail968;
      j_458 = term;
      term = a_347.invoke(context, f_458);
      if(term == null)
        break Fail968;
      k_458 = term;
      term = b_347.invoke(context, g_458);
      if(term == null)
        break Fail968;
      l_458 = term;
      term = c_347.invoke(context, h_458);
      if(term == null)
        break Fail968;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSDefT_4, new IStrategoTerm[]{j_458, k_458, l_458, term}), checkListAnnos(termFactory, i_458));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}