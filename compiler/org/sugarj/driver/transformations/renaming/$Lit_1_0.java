package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lit_1_0 extends Strategy 
{ 
  public static $Lit_1_0 instance = new $Lit_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lit_1_0");
    Fail151:
    { 
      IStrategoTerm w_127 = null;
      IStrategoTerm v_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail151;
      v_127 = term.getSubterm(0);
      IStrategoList annos132 = term.getAnnotations();
      w_127 = annos132;
      term = y_24.invoke(context, v_127);
      if(term == null)
        break Fail151;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}