package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Array$Init_1_0 extends Strategy 
{ 
  public static $Array$Init_1_0 instance = new $Array$Init_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArrayInit_1_0");
    Fail98:
    { 
      IStrategoTerm e_117 = null;
      IStrategoTerm d_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consArrayInit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail98;
      d_117 = term.getSubterm(0);
      IStrategoList annos84 = term.getAnnotations();
      e_117 = annos84;
      term = w_20.invoke(context, d_117);
      if(term == null)
        break Fail98;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consArrayInit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}