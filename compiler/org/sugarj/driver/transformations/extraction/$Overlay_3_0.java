package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_339, Strategy p_339, Strategy q_339)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Overlay_3_0");
    Fail853:
    { 
      IStrategoTerm e_439 = null;
      IStrategoTerm b_439 = null;
      IStrategoTerm c_439 = null;
      IStrategoTerm d_439 = null;
      IStrategoTerm f_439 = null;
      IStrategoTerm g_439 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consOverlay_3 != ((IStrategoAppl)term).getConstructor())
        break Fail853;
      b_439 = term.getSubterm(0);
      c_439 = term.getSubterm(1);
      d_439 = term.getSubterm(2);
      IStrategoList annos99 = term.getAnnotations();
      e_439 = annos99;
      term = o_339.invoke(context, b_439);
      if(term == null)
        break Fail853;
      f_439 = term;
      term = p_339.invoke(context, c_439);
      if(term == null)
        break Fail853;
      g_439 = term;
      term = q_339.invoke(context, d_439);
      if(term == null)
        break Fail853;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consOverlay_3, new IStrategoTerm[]{f_439, g_439, term}), checkListAnnos(termFactory, e_439));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}