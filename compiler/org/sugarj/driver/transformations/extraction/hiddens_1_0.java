package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class hiddens_1_0 extends Strategy 
{ 
  public static hiddens_1_0 instance = new hiddens_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("hiddens_1_0");
    Fail204:
    { 
      IStrategoTerm v_137 = null;
      IStrategoTerm u_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conshiddens_1 != ((IStrategoAppl)term).getConstructor())
        break Fail204;
      u_137 = term.getSubterm(0);
      IStrategoList annos168 = term.getAnnotations();
      v_137 = annos168;
      term = a_27.invoke(context, u_137);
      if(term == null)
        break Fail204;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conshiddens_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}