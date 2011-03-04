package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class simple_charclass_1_0 extends Strategy 
{ 
  public static simple_charclass_1_0 instance = new simple_charclass_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("simple_charclass_1_0");
    Fail177:
    { 
      IStrategoTerm h_132 = null;
      IStrategoTerm g_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conssimple_charclass_1 != ((IStrategoAppl)term).getConstructor())
        break Fail177;
      g_132 = term.getSubterm(0);
      IStrategoList annos149 = term.getAnnotations();
      h_132 = annos149;
      term = z_25.invoke(context, g_132);
      if(term == null)
        break Fail177;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conssimple_charclass_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}