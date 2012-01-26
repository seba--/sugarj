package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Static$Init_1_0 extends Strategy 
{ 
  public static $Static$Init_1_0 instance = new $Static$Init_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StaticInit_1_0");
    Fail56:
    { 
      IStrategoTerm z_108 = null;
      IStrategoTerm y_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consStaticInit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail56;
      y_108 = term.getSubterm(0);
      IStrategoList annos47 = term.getAnnotations();
      z_108 = annos47;
      term = w_17.invoke(context, y_108);
      if(term == null)
        break Fail56;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consStaticInit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}