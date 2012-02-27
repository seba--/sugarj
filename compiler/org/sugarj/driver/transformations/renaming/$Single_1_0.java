package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Single_1_0 extends Strategy 
{ 
  public static $Single_1_0 instance = new $Single_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Single_1_0");
    Fail189:
    { 
      IStrategoTerm i_135 = null;
      IStrategoTerm g_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSingle_1 != ((IStrategoAppl)term).getConstructor())
        break Fail189;
      g_135 = term.getSubterm(0);
      IStrategoList annos159 = term.getAnnotations();
      i_135 = annos159;
      term = s_26.invoke(context, g_135);
      if(term == null)
        break Fail189;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSingle_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}