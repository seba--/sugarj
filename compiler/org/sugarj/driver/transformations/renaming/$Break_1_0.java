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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Break_1_0");
    Fail83:
    { 
      IStrategoTerm i_114 = null;
      IStrategoTerm h_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consBreak_1 != ((IStrategoAppl)term).getConstructor())
        break Fail83;
      h_114 = term.getSubterm(0);
      IStrategoList annos66 = term.getAnnotations();
      i_114 = annos66;
      term = i_20.invoke(context, h_114);
      if(term == null)
        break Fail83;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consBreak_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}