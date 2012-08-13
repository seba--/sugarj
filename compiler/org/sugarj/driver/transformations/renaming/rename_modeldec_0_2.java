package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class rename_modeldec_0_2 extends Strategy 
{ 
  public static rename_modeldec_0_2 instance = new rename_modeldec_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_15, IStrategoTerm f_15)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail4:
    { 
      IStrategoTerm g_15 = null;
      IStrategoTerm h_15 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consModelDecHead_3 != ((IStrategoAppl)term).getConstructor())
        break Fail4;
      g_15 = term.getSubterm(0);
      IStrategoTerm arg1 = term.getSubterm(1);
      if(arg1.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg1).getConstructor())
        break Fail4;
      if(arg1.getSubterm(0) != e_15 && !e_15.match(arg1.getSubterm(0)))
        break Fail4;
      h_15 = term.getSubterm(2);
      term = termFactory.makeAppl(renaming._consModelDecHead_3, new IStrategoTerm[]{g_15, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{f_15}), h_15});
      if(true)
        return term;
    }
    context.push("rename_modeldec_0_2");
    context.popOnFailure();
    return null;
  }
}