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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Break_1_0");
    Fail81:
    { 
      IStrategoTerm a_114 = null;
      IStrategoTerm z_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consBreak_1 != ((IStrategoAppl)term).getConstructor())
        break Fail81;
      z_113 = term.getSubterm(0);
      IStrategoList annos66 = term.getAnnotations();
      a_114 = annos66;
      term = a_20.invoke(context, z_113);
      if(term == null)
        break Fail81;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consBreak_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}