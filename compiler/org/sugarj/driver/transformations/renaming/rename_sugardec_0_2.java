package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class rename_sugardec_0_2 extends Strategy 
{ 
  public static rename_sugardec_0_2 instance = new rename_sugardec_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_15, IStrategoTerm c_15)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail3:
    { 
      IStrategoTerm d_15 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSugarDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail3;
      d_15 = term.getSubterm(0);
      IStrategoTerm arg0 = term.getSubterm(1);
      if(arg0.getTermType() != IStrategoTerm.APPL || renaming._consId_1 != ((IStrategoAppl)arg0).getConstructor())
        break Fail3;
      if(arg0.getSubterm(0) != b_15 && !b_15.match(arg0.getSubterm(0)))
        break Fail3;
      term = termFactory.makeAppl(renaming._consSugarDecHead_2, new IStrategoTerm[]{d_15, termFactory.makeAppl(renaming._consId_1, new IStrategoTerm[]{c_15})});
      if(true)
        return term;
    }
    context.push("rename_sugardec_0_2");
    context.popOnFailure();
    return null;
  }
}