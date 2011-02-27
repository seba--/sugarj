package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class module_1_0 extends Strategy 
{ 
  public static module_1_0 instance = new module_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("module_1_0");
    Fail200:
    { 
      IStrategoTerm h_137 = null;
      IStrategoTerm g_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consmodule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail200;
      g_137 = term.getSubterm(0);
      IStrategoList annos164 = term.getAnnotations();
      h_137 = annos164;
      term = v_26.invoke(context, g_137);
      if(term == null)
        break Fail200;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consmodule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}