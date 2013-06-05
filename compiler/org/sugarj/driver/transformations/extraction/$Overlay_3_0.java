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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_18, Strategy c_18, Strategy d_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Overlay_3_0");
    Fail60:
    { 
      IStrategoTerm t_108 = null;
      IStrategoTerm q_108 = null;
      IStrategoTerm r_108 = null;
      IStrategoTerm s_108 = null;
      IStrategoTerm u_108 = null;
      IStrategoTerm v_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consOverlay_3 != ((IStrategoAppl)term).getConstructor())
        break Fail60;
      q_108 = term.getSubterm(0);
      r_108 = term.getSubterm(1);
      s_108 = term.getSubterm(2);
      IStrategoList annos33 = term.getAnnotations();
      t_108 = annos33;
      term = b_18.invoke(context, q_108);
      if(term == null)
        break Fail60;
      u_108 = term;
      term = c_18.invoke(context, r_108);
      if(term == null)
        break Fail60;
      v_108 = term;
      term = d_18.invoke(context, s_108);
      if(term == null)
        break Fail60;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consOverlay_3, new IStrategoTerm[]{u_108, v_108, term}), checkListAnnos(termFactory, t_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}