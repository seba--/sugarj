package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_12, Strategy a_13, Strategy b_13, Strategy c_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDefT_4_0");
    Fail56:
    { 
      IStrategoTerm g_99 = null;
      IStrategoTerm c_99 = null;
      IStrategoTerm d_99 = null;
      IStrategoTerm e_99 = null;
      IStrategoTerm f_99 = null;
      IStrategoTerm h_99 = null;
      IStrategoTerm i_99 = null;
      IStrategoTerm j_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail56;
      c_99 = term.getSubterm(0);
      d_99 = term.getSubterm(1);
      e_99 = term.getSubterm(2);
      f_99 = term.getSubterm(3);
      IStrategoList annos46 = term.getAnnotations();
      g_99 = annos46;
      term = z_12.invoke(context, c_99);
      if(term == null)
        break Fail56;
      h_99 = term;
      term = a_13.invoke(context, d_99);
      if(term == null)
        break Fail56;
      i_99 = term;
      term = b_13.invoke(context, e_99);
      if(term == null)
        break Fail56;
      j_99 = term;
      term = c_13.invoke(context, f_99);
      if(term == null)
        break Fail56;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSDefT_4, new IStrategoTerm[]{h_99, i_99, j_99, term}), checkListAnnos(termFactory, g_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}