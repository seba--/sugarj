package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class real_con_3_0 extends Strategy 
{ 
  public static real_con_3_0 instance = new real_con_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_29, Strategy v_29, Strategy w_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("real_con_3_0");
    Fail267:
    { 
      IStrategoTerm j_149 = null;
      IStrategoTerm g_149 = null;
      IStrategoTerm h_149 = null;
      IStrategoTerm i_149 = null;
      IStrategoTerm k_149 = null;
      IStrategoTerm l_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consreal_con_3 != ((IStrategoAppl)term).getConstructor())
        break Fail267;
      g_149 = term.getSubterm(0);
      h_149 = term.getSubterm(1);
      i_149 = term.getSubterm(2);
      IStrategoList annos221 = term.getAnnotations();
      j_149 = annos221;
      term = u_29.invoke(context, g_149);
      if(term == null)
        break Fail267;
      k_149 = term;
      term = v_29.invoke(context, h_149);
      if(term == null)
        break Fail267;
      l_149 = term;
      term = w_29.invoke(context, i_149);
      if(term == null)
        break Fail267;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consreal_con_3, new IStrategoTerm[]{k_149, l_149, term}), checkListAnnos(termFactory, j_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}