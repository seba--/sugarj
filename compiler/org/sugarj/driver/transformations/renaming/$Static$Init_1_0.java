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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StaticInit_1_0");
    Fail61:
    { 
      IStrategoTerm a_110 = null;
      IStrategoTerm z_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consStaticInit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail61;
      z_109 = term.getSubterm(0);
      IStrategoList annos47 = term.getAnnotations();
      a_110 = annos47;
      term = t_18.invoke(context, z_109);
      if(term == null)
        break Fail61;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consStaticInit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}