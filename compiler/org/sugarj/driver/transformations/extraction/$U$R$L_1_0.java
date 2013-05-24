package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $U$R$L_1_0 extends Strategy 
{ 
  public static $U$R$L_1_0 instance = new $U$R$L_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_338)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("URL_1_0");
    Fail829:
    { 
      IStrategoTerm y_435 = null;
      IStrategoTerm x_435 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consURL_1 != ((IStrategoAppl)term).getConstructor())
        break Fail829;
      x_435 = term.getSubterm(0);
      IStrategoList annos77 = term.getAnnotations();
      y_435 = annos77;
      term = g_338.invoke(context, x_435);
      if(term == null)
        break Fail829;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consURL_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_435));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}