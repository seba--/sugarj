package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Continue_1_0 extends Strategy 
{ 
  public static $Continue_1_0 instance = new $Continue_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Continue_1_0");
    Fail82:
    { 
      IStrategoTerm f_114 = null;
      IStrategoTerm e_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consContinue_1 != ((IStrategoAppl)term).getConstructor())
        break Fail82;
      e_114 = term.getSubterm(0);
      IStrategoList annos65 = term.getAnnotations();
      f_114 = annos65;
      term = h_20.invoke(context, e_114);
      if(term == null)
        break Fail82;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consContinue_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}