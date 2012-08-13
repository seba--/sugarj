package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $And_2_0 extends Strategy 
{ 
  public static $And_2_0 instance = new $And_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_28, Strategy b_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("And_2_0");
    Fail166:
    { 
      IStrategoTerm i_137 = null;
      IStrategoTerm g_137 = null;
      IStrategoTerm h_137 = null;
      IStrategoTerm j_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAnd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail166;
      g_137 = term.getSubterm(0);
      h_137 = term.getSubterm(1);
      IStrategoList annos141 = term.getAnnotations();
      i_137 = annos141;
      term = a_28.invoke(context, g_137);
      if(term == null)
        break Fail166;
      j_137 = term;
      term = b_28.invoke(context, h_137);
      if(term == null)
        break Fail166;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAnd_2, new IStrategoTerm[]{j_137, term}), checkListAnnos(termFactory, i_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}