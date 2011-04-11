package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class follow_2_0 extends Strategy 
{ 
  public static follow_2_0 instance = new follow_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_25, Strategy h_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("follow_2_0");
    Fail164:
    { 
      IStrategoTerm j_129 = null;
      IStrategoTerm e_129 = null;
      IStrategoTerm h_129 = null;
      IStrategoTerm m_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consfollow_2 != ((IStrategoAppl)term).getConstructor())
        break Fail164;
      e_129 = term.getSubterm(0);
      h_129 = term.getSubterm(1);
      IStrategoList annos136 = term.getAnnotations();
      j_129 = annos136;
      term = g_25.invoke(context, e_129);
      if(term == null)
        break Fail164;
      m_129 = term;
      term = h_25.invoke(context, h_129);
      if(term == null)
        break Fail164;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consfollow_2, new IStrategoTerm[]{m_129, term}), checkListAnnos(termFactory, j_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}