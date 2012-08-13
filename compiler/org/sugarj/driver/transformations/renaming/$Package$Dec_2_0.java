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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_20, Strategy c_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageDec_2_0");
    Fail65:
    { 
      IStrategoTerm h_112 = null;
      IStrategoTerm f_112 = null;
      IStrategoTerm g_112 = null;
      IStrategoTerm i_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPackageDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail65;
      f_112 = term.getSubterm(0);
      g_112 = term.getSubterm(1);
      IStrategoList annos46 = term.getAnnotations();
      h_112 = annos46;
      term = b_20.invoke(context, f_112);
      if(term == null)
        break Fail65;
      i_112 = term;
      term = c_20.invoke(context, g_112);
      if(term == null)
        break Fail65;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPackageDec_2, new IStrategoTerm[]{i_112, term}), checkListAnnos(termFactory, h_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}