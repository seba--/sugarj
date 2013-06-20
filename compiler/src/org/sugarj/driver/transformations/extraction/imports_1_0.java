package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class imports_1_0 extends Strategy 
{ 
  public static imports_1_0 instance = new imports_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("imports_1_0");
    Fail214:
    { 
      IStrategoTerm s_137 = null;
      IStrategoTerm r_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consimports_1 != ((IStrategoAppl)term).getConstructor())
        break Fail214;
      r_137 = term.getSubterm(0);
      IStrategoList annos174 = term.getAnnotations();
      s_137 = annos174;
      term = x_26.invoke(context, r_137);
      if(term == null)
        break Fail214;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consimports_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}