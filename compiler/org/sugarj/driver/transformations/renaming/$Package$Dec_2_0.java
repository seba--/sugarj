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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_28, Strategy k_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PackageDec_2_0");
    Fail55:
    { 
      IStrategoTerm l_129 = null;
      IStrategoTerm g_129 = null;
      IStrategoTerm j_129 = null;
      IStrategoTerm o_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPackageDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail55;
      g_129 = term.getSubterm(0);
      j_129 = term.getSubterm(1);
      IStrategoList annos31 = term.getAnnotations();
      l_129 = annos31;
      term = j_28.invoke(context, g_129);
      if(term == null)
        break Fail55;
      o_129 = term;
      term = k_28.invoke(context, j_129);
      if(term == null)
        break Fail55;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPackageDec_2, new IStrategoTerm[]{o_129, term}), checkListAnnos(termFactory, l_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}