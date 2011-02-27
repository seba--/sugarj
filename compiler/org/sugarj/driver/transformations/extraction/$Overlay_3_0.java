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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_18, Strategy d_18, Strategy e_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Overlay_3_0");
    Fail48:
    { 
      IStrategoTerm q_108 = null;
      IStrategoTerm n_108 = null;
      IStrategoTerm o_108 = null;
      IStrategoTerm p_108 = null;
      IStrategoTerm r_108 = null;
      IStrategoTerm s_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consOverlay_3 != ((IStrategoAppl)term).getConstructor())
        break Fail48;
      n_108 = term.getSubterm(0);
      o_108 = term.getSubterm(1);
      p_108 = term.getSubterm(2);
      IStrategoList annos25 = term.getAnnotations();
      q_108 = annos25;
      term = c_18.invoke(context, n_108);
      if(term == null)
        break Fail48;
      r_108 = term;
      term = d_18.invoke(context, o_108);
      if(term == null)
        break Fail48;
      s_108 = term;
      term = e_18.invoke(context, p_108);
      if(term == null)
        break Fail48;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consOverlay_3, new IStrategoTerm[]{r_108, s_108, term}), checkListAnnos(termFactory, q_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}