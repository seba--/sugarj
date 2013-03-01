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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_23, IStrategoTerm y_23)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail8:
    { 
      IStrategoTerm z_23 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSugarDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail8;
      z_23 = term.getSubterm(0);
      IStrategoTerm arg0 = term.getSubterm(1);
      if(arg0.getTermType() != IStrategoTerm.APPL || out._consId_1 != ((IStrategoAppl)arg0).getConstructor())
        break Fail8;
      if(arg0.getSubterm(0) != x_23 && !x_23.match(arg0.getSubterm(0)))
        break Fail8;
      term = termFactory.makeAppl(out._consSugarDecHead_2, new IStrategoTerm[]{z_23, termFactory.makeAppl(out._consId_1, new IStrategoTerm[]{y_23})});
      if(true)
        return term;
    }
    context.push("rename_sugardec_0_2");
    context.popOnFailure();
    return null;
  }
}