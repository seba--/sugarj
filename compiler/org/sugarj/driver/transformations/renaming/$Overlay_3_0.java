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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_11, Strategy u_11, Strategy v_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Overlay_3_0");
    Fail35:
    { 
      IStrategoTerm d_95 = null;
      IStrategoTerm a_95 = null;
      IStrategoTerm b_95 = null;
      IStrategoTerm c_95 = null;
      IStrategoTerm e_95 = null;
      IStrategoTerm f_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOverlay_3 != ((IStrategoAppl)term).getConstructor())
        break Fail35;
      a_95 = term.getSubterm(0);
      b_95 = term.getSubterm(1);
      c_95 = term.getSubterm(2);
      IStrategoList annos25 = term.getAnnotations();
      d_95 = annos25;
      term = t_11.invoke(context, a_95);
      if(term == null)
        break Fail35;
      e_95 = term;
      term = u_11.invoke(context, b_95);
      if(term == null)
        break Fail35;
      f_95 = term;
      term = v_11.invoke(context, c_95);
      if(term == null)
        break Fail35;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOverlay_3, new IStrategoTerm[]{e_95, f_95, term}), checkListAnnos(termFactory, d_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}