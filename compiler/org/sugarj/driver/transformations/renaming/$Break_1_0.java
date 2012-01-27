package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Break_1_0 extends Strategy 
{ 
  public static $Break_1_0 instance = new $Break_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Break_1_0");
    Fail78:
    { 
      IStrategoTerm j_113 = null;
      IStrategoTerm i_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consBreak_1 != ((IStrategoAppl)term).getConstructor())
        break Fail78;
      i_113 = term.getSubterm(0);
      IStrategoList annos66 = term.getAnnotations();
      j_113 = annos66;
      term = l_19.invoke(context, i_113);
      if(term == null)
        break Fail78;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consBreak_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}