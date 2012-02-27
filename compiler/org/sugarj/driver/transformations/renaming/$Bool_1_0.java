package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Bool_1_0 extends Strategy 
{ 
  public static $Bool_1_0 instance = new $Bool_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Bool_1_0");
    Fail193:
    { 
      IStrategoTerm z_135 = null;
      IStrategoTerm w_135 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consBool_1 != ((IStrategoAppl)term).getConstructor())
        break Fail193;
      w_135 = term.getSubterm(0);
      IStrategoList annos161 = term.getAnnotations();
      z_135 = annos161;
      term = u_26.invoke(context, w_135);
      if(term == null)
        break Fail193;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consBool_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_135));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}