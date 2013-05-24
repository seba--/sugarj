package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class prods_group_1_0 extends Strategy 
{ 
  public static prods_group_1_0 instance = new prods_group_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_350)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("prods_group_1_0");
    Fail1033:
    { 
      IStrategoTerm h_466 = null;
      IStrategoTerm g_466 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consprods_group_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1033;
      g_466 = term.getSubterm(0);
      IStrategoList annos260 = term.getAnnotations();
      h_466 = annos260;
      term = b_350.invoke(context, g_466);
      if(term == null)
        break Fail1033;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consprods_group_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_466));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}