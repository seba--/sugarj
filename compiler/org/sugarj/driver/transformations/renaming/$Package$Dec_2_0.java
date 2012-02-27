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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_14, Strategy z_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageDec_2_0");
    Fail19:
    { 
      IStrategoTerm f_100 = null;
      IStrategoTerm d_100 = null;
      IStrategoTerm e_100 = null;
      IStrategoTerm g_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPackageDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail19;
      d_100 = term.getSubterm(0);
      e_100 = term.getSubterm(1);
      IStrategoList annos5 = term.getAnnotations();
      f_100 = annos5;
      term = y_14.invoke(context, d_100);
      if(term == null)
        break Fail19;
      g_100 = term;
      term = z_14.invoke(context, e_100);
      if(term == null)
        break Fail19;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPackageDec_2, new IStrategoTerm[]{g_100, term}), checkListAnnos(termFactory, f_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}