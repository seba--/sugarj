package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Package$Dec_2_0 extends Strategy 
{ 
  public static $Package$Dec_2_0 instance = new $Package$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_14, Strategy r_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageDec_2_0");
    Fail17:
    { 
      IStrategoTerm x_99 = null;
      IStrategoTerm v_99 = null;
      IStrategoTerm w_99 = null;
      IStrategoTerm y_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPackageDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail17;
      v_99 = term.getSubterm(0);
      w_99 = term.getSubterm(1);
      IStrategoList annos5 = term.getAnnotations();
      x_99 = annos5;
      term = q_14.invoke(context, v_99);
      if(term == null)
        break Fail17;
      y_99 = term;
      term = r_14.invoke(context, w_99);
      if(term == null)
        break Fail17;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPackageDec_2, new IStrategoTerm[]{y_99, term}), checkListAnnos(termFactory, x_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}