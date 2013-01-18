package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Exc$Or_2_0 extends Strategy 
{ 
  public static $Exc$Or_2_0 instance = new $Exc$Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_36, Strategy h_36)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExcOr_2_0");
    Fail155:
    { 
      IStrategoTerm w_159 = null;
      IStrategoTerm u_159 = null;
      IStrategoTerm v_159 = null;
      IStrategoTerm x_159 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExcOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail155;
      u_159 = term.getSubterm(0);
      v_159 = term.getSubterm(1);
      IStrategoList annos125 = term.getAnnotations();
      w_159 = annos125;
      term = g_36.invoke(context, u_159);
      if(term == null)
        break Fail155;
      x_159 = term;
      term = h_36.invoke(context, v_159);
      if(term == null)
        break Fail155;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExcOr_2, new IStrategoTerm[]{x_159, term}), checkListAnnos(termFactory, w_159));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}