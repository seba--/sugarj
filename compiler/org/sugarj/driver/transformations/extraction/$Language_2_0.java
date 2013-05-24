package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Language_2_0 extends Strategy 
{ 
  public static $Language_2_0 instance = new $Language_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_337, Strategy x_337)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Language_2_0");
    Fail820:
    { 
      IStrategoTerm w_434 = null;
      IStrategoTerm u_434 = null;
      IStrategoTerm v_434 = null;
      IStrategoTerm x_434 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consLanguage_2 != ((IStrategoAppl)term).getConstructor())
        break Fail820;
      u_434 = term.getSubterm(0);
      v_434 = term.getSubterm(1);
      IStrategoList annos68 = term.getAnnotations();
      w_434 = annos68;
      term = w_337.invoke(context, u_434);
      if(term == null)
        break Fail820;
      x_434 = term;
      term = x_337.invoke(context, v_434);
      if(term == null)
        break Fail820;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consLanguage_2, new IStrategoTerm[]{x_434, term}), checkListAnnos(termFactory, w_434));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}