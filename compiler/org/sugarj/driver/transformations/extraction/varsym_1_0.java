package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class varsym_1_0 extends Strategy 
{ 
  public static varsym_1_0 instance = new varsym_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("varsym_1_0");
    Fail228:
    { 
      IStrategoTerm g_143 = null;
      IStrategoTerm f_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consvarsym_1 != ((IStrategoAppl)term).getConstructor())
        break Fail228;
      f_143 = term.getSubterm(0);
      IStrategoList annos188 = term.getAnnotations();
      g_143 = annos188;
      term = f_28.invoke(context, f_143);
      if(term == null)
        break Fail228;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consvarsym_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}