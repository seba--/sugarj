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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StaticInit_1_0");
    Fail59:
    { 
      IStrategoTerm s_109 = null;
      IStrategoTerm r_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consStaticInit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail59;
      r_109 = term.getSubterm(0);
      IStrategoList annos47 = term.getAnnotations();
      s_109 = annos47;
      term = l_18.invoke(context, r_109);
      if(term == null)
        break Fail59;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consStaticInit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}