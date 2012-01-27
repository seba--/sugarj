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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_14, Strategy c_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageDec_2_0");
    Fail14:
    { 
      IStrategoTerm h_99 = null;
      IStrategoTerm f_99 = null;
      IStrategoTerm g_99 = null;
      IStrategoTerm i_99 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPackageDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail14;
      f_99 = term.getSubterm(0);
      g_99 = term.getSubterm(1);
      IStrategoList annos5 = term.getAnnotations();
      h_99 = annos5;
      term = b_14.invoke(context, f_99);
      if(term == null)
        break Fail14;
      i_99 = term;
      term = c_14.invoke(context, g_99);
      if(term == null)
        break Fail14;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPackageDec_2, new IStrategoTerm[]{i_99, term}), checkListAnnos(termFactory, h_99));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}