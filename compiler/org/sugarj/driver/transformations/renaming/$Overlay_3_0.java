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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_11, Strategy r_11, Strategy s_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Overlay_3_0");
    Fail35:
    { 
      IStrategoTerm a_95 = null;
      IStrategoTerm w_94 = null;
      IStrategoTerm y_94 = null;
      IStrategoTerm z_94 = null;
      IStrategoTerm b_95 = null;
      IStrategoTerm c_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOverlay_3 != ((IStrategoAppl)term).getConstructor())
        break Fail35;
      w_94 = term.getSubterm(0);
      y_94 = term.getSubterm(1);
      z_94 = term.getSubterm(2);
      IStrategoList annos25 = term.getAnnotations();
      a_95 = annos25;
      term = q_11.invoke(context, w_94);
      if(term == null)
        break Fail35;
      b_95 = term;
      term = r_11.invoke(context, y_94);
      if(term == null)
        break Fail35;
      c_95 = term;
      term = s_11.invoke(context, z_94);
      if(term == null)
        break Fail35;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOverlay_3, new IStrategoTerm[]{b_95, c_95, term}), checkListAnnos(termFactory, a_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}