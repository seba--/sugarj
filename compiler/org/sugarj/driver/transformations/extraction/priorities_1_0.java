package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class priorities_1_0 extends Strategy 
{ 
  public static priorities_1_0 instance = new priorities_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("priorities_1_0");
    Fail263:
    { 
      IStrategoTerm f_147 = null;
      IStrategoTerm e_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conspriorities_1 != ((IStrategoAppl)term).getConstructor())
        break Fail263;
      e_147 = term.getSubterm(0);
      IStrategoList annos215 = term.getAnnotations();
      f_147 = annos215;
      term = c_29.invoke(context, e_147);
      if(term == null)
        break Fail263;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conspriorities_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}