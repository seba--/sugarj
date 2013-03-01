package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Static$Import$Dec_2_0 extends Strategy 
{ 
  public static $Static$Import$Dec_2_0 instance = new $Static$Import$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_28, Strategy g_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StaticImportDec_2_0");
    Fail52:
    { 
      IStrategoTerm x_128 = null;
      IStrategoTerm v_128 = null;
      IStrategoTerm w_128 = null;
      IStrategoTerm y_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consStaticImportDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail52;
      v_128 = term.getSubterm(0);
      w_128 = term.getSubterm(1);
      IStrategoList annos28 = term.getAnnotations();
      x_128 = annos28;
      term = f_28.invoke(context, v_128);
      if(term == null)
        break Fail52;
      y_128 = term;
      term = g_28.invoke(context, w_128);
      if(term == null)
        break Fail52;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consStaticImportDec_2, new IStrategoTerm[]{y_128, term}), checkListAnnos(termFactory, x_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}