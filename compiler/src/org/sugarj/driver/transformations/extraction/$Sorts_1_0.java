package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sorts_1_0 extends Strategy 
{ 
  public static $Sorts_1_0 instance = new $Sorts_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sorts_1_0");
    Fail154:
    { 
      IStrategoTerm h_126 = null;
      IStrategoTerm g_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSorts_1 != ((IStrategoAppl)term).getConstructor())
        break Fail154;
      g_126 = term.getSubterm(0);
      IStrategoList annos124 = term.getAnnotations();
      h_126 = annos124;
      term = e_24.invoke(context, g_126);
      if(term == null)
        break Fail154;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSorts_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}