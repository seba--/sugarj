package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Throws$Dec_1_0 extends Strategy 
{ 
  public static $Throws$Dec_1_0 instance = new $Throws$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ThrowsDec_1_0");
    Fail64:
    { 
      IStrategoTerm g_110 = null;
      IStrategoTerm f_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consThrowsDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail64;
      f_110 = term.getSubterm(0);
      IStrategoList annos49 = term.getAnnotations();
      g_110 = annos49;
      term = v_18.invoke(context, f_110);
      if(term == null)
        break Fail64;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consThrowsDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}