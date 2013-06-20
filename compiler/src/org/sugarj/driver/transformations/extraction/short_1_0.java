package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class short_1_0 extends Strategy 
{ 
  public static short_1_0 instance = new short_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("short_1_0");
    Fail198:
    { 
      IStrategoTerm z_134 = null;
      IStrategoTerm t_134 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consshort_1 != ((IStrategoAppl)term).getConstructor())
        break Fail198;
      t_134 = term.getSubterm(0);
      IStrategoList annos162 = term.getAnnotations();
      z_134 = annos162;
      term = g_26.invoke(context, t_134);
      if(term == null)
        break Fail198;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consshort_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_134));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}