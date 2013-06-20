package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Overlay_3_0 extends Strategy 
{ 
  public static $Overlay_3_0 instance = new $Overlay_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_11, Strategy x_11, Strategy y_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Overlay_3_0");
    Fail34:
    { 
      IStrategoTerm g_95 = null;
      IStrategoTerm d_95 = null;
      IStrategoTerm e_95 = null;
      IStrategoTerm f_95 = null;
      IStrategoTerm h_95 = null;
      IStrategoTerm i_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOverlay_3 != ((IStrategoAppl)term).getConstructor())
        break Fail34;
      d_95 = term.getSubterm(0);
      e_95 = term.getSubterm(1);
      f_95 = term.getSubterm(2);
      IStrategoList annos25 = term.getAnnotations();
      g_95 = annos25;
      term = w_11.invoke(context, d_95);
      if(term == null)
        break Fail34;
      h_95 = term;
      term = x_11.invoke(context, e_95);
      if(term == null)
        break Fail34;
      i_95 = term;
      term = y_11.invoke(context, f_95);
      if(term == null)
        break Fail34;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOverlay_3, new IStrategoTerm[]{h_95, i_95, term}), checkListAnnos(termFactory, g_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}