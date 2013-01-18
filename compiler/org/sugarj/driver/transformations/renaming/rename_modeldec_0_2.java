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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_24, IStrategoTerm b_24)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail9:
    { 
      IStrategoTerm c_24 = null;
      IStrategoTerm d_24 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consModelDecHead_3 != ((IStrategoAppl)term).getConstructor())
        break Fail9;
      c_24 = term.getSubterm(0);
      IStrategoTerm arg1 = term.getSubterm(1);
      if(arg1.getTermType() != IStrategoTerm.APPL || out._consId_1 != ((IStrategoAppl)arg1).getConstructor())
        break Fail9;
      if(arg1.getSubterm(0) != a_24 && !a_24.match(arg1.getSubterm(0)))
        break Fail9;
      d_24 = term.getSubterm(2);
      term = termFactory.makeAppl(out._consModelDecHead_3, new IStrategoTerm[]{c_24, termFactory.makeAppl(out._consId_1, new IStrategoTerm[]{b_24}), d_24});
      if(true)
        return term;
    }
    context.push("rename_modeldec_0_2");
    context.popOnFailure();
    return null;
  }
}