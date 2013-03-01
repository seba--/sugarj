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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_42, Strategy k_42, Strategy l_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Overlay_3_0");
    Fail272:
    { 
      IStrategoTerm w_179 = null;
      IStrategoTerm t_179 = null;
      IStrategoTerm u_179 = null;
      IStrategoTerm v_179 = null;
      IStrategoTerm x_179 = null;
      IStrategoTerm y_179 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOverlay_3 != ((IStrategoAppl)term).getConstructor())
        break Fail272;
      t_179 = term.getSubterm(0);
      u_179 = term.getSubterm(1);
      v_179 = term.getSubterm(2);
      IStrategoList annos219 = term.getAnnotations();
      w_179 = annos219;
      term = j_42.invoke(context, t_179);
      if(term == null)
        break Fail272;
      x_179 = term;
      term = k_42.invoke(context, u_179);
      if(term == null)
        break Fail272;
      y_179 = term;
      term = l_42.invoke(context, v_179);
      if(term == null)
        break Fail272;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOverlay_3, new IStrategoTerm[]{x_179, y_179, term}), checkListAnnos(termFactory, w_179));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}