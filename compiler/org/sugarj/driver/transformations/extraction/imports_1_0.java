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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_351)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("imports_1_0");
    Fail1055:
    { 
      IStrategoTerm v_469 = null;
      IStrategoTerm u_469 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consimports_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1055;
      u_469 = term.getSubterm(0);
      IStrategoList annos282 = term.getAnnotations();
      v_469 = annos282;
      term = k_351.invoke(context, u_469);
      if(term == null)
        break Fail1055;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consimports_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_469));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}