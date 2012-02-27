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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Lit_1_0");
    Fail153:
    { 
      IStrategoTerm e_128 = null;
      IStrategoTerm d_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail153;
      d_128 = term.getSubterm(0);
      IStrategoList annos132 = term.getAnnotations();
      e_128 = annos132;
      term = g_25.invoke(context, d_128);
      if(term == null)
        break Fail153;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}