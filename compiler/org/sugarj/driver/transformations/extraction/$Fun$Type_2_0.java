package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Type_2_0 extends Strategy 
{ 
  public static $Fun$Type_2_0 instance = new $Fun$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_23, Strategy i_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunType_2_0");
    Fail126:
    { 
      IStrategoTerm i_123 = null;
      IStrategoTerm g_123 = null;
      IStrategoTerm h_123 = null;
      IStrategoTerm j_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consFunType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail126;
      g_123 = term.getSubterm(0);
      h_123 = term.getSubterm(1);
      IStrategoList annos100 = term.getAnnotations();
      i_123 = annos100;
      term = h_23.invoke(context, g_123);
      if(term == null)
        break Fail126;
      j_123 = term;
      term = i_23.invoke(context, h_123);
      if(term == null)
        break Fail126;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consFunType_2, new IStrategoTerm[]{j_123, term}), checkListAnnos(termFactory, i_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}