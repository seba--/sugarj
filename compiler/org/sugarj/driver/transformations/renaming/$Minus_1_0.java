package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Minus_1_0 extends Strategy 
{ 
  public static $Minus_1_0 instance = new $Minus_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Minus_1_0");
    Fail142:
    { 
      IStrategoTerm d_126 = null;
      IStrategoTerm c_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMinus_1 != ((IStrategoAppl)term).getConstructor())
        break Fail142;
      c_126 = term.getSubterm(0);
      IStrategoList annos124 = term.getAnnotations();
      d_126 = annos124;
      term = h_24.invoke(context, c_126);
      if(term == null)
        break Fail142;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMinus_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}