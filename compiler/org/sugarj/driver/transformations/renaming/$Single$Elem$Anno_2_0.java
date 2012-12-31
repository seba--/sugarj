package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Single$Elem$Anno_2_0 extends Strategy 
{ 
  public static $Single$Elem$Anno_2_0 instance = new $Single$Elem$Anno_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_28, Strategy q_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SingleElemAnno_2_0");
    Fail59:
    { 
      IStrategoTerm i_130 = null;
      IStrategoTerm g_130 = null;
      IStrategoTerm h_130 = null;
      IStrategoTerm j_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSingleElemAnno_2 != ((IStrategoAppl)term).getConstructor())
        break Fail59;
      g_130 = term.getSubterm(0);
      h_130 = term.getSubterm(1);
      IStrategoList annos35 = term.getAnnotations();
      i_130 = annos35;
      term = p_28.invoke(context, g_130);
      if(term == null)
        break Fail59;
      j_130 = term;
      term = q_28.invoke(context, h_130);
      if(term == null)
        break Fail59;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSingleElemAnno_2, new IStrategoTerm[]{j_130, term}), checkListAnnos(termFactory, i_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}