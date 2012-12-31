package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_11, Strategy s_11, Strategy t_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Overlay_3_0");
    Fail31:
    { 
      IStrategoTerm b_95 = null;
      IStrategoTerm y_94 = null;
      IStrategoTerm z_94 = null;
      IStrategoTerm a_95 = null;
      IStrategoTerm c_95 = null;
      IStrategoTerm d_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOverlay_3 != ((IStrategoAppl)term).getConstructor())
        break Fail31;
      y_94 = term.getSubterm(0);
      z_94 = term.getSubterm(1);
      a_95 = term.getSubterm(2);
      IStrategoList annos25 = term.getAnnotations();
      b_95 = annos25;
      term = r_11.invoke(context, y_94);
      if(term == null)
        break Fail31;
      c_95 = term;
      term = s_11.invoke(context, z_94);
      if(term == null)
        break Fail31;
      d_95 = term;
      term = t_11.invoke(context, a_95);
      if(term == null)
        break Fail31;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOverlay_3, new IStrategoTerm[]{c_95, d_95, term}), checkListAnnos(termFactory, b_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}