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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_18, Strategy e_18, Strategy f_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Overlay_3_0");
    Fail61:
    { 
      IStrategoTerm y_108 = null;
      IStrategoTerm v_108 = null;
      IStrategoTerm w_108 = null;
      IStrategoTerm x_108 = null;
      IStrategoTerm z_108 = null;
      IStrategoTerm a_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consOverlay_3 != ((IStrategoAppl)term).getConstructor())
        break Fail61;
      v_108 = term.getSubterm(0);
      w_108 = term.getSubterm(1);
      x_108 = term.getSubterm(2);
      IStrategoList annos34 = term.getAnnotations();
      y_108 = annos34;
      term = d_18.invoke(context, v_108);
      if(term == null)
        break Fail61;
      z_108 = term;
      term = e_18.invoke(context, w_108);
      if(term == null)
        break Fail61;
      a_109 = term;
      term = f_18.invoke(context, x_108);
      if(term == null)
        break Fail61;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consOverlay_3, new IStrategoTerm[]{z_108, a_109, term}), checkListAnnos(termFactory, y_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}