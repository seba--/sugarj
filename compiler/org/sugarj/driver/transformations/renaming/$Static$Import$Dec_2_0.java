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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_13, Strategy y_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StaticImportDec_2_0");
    Fail11:
    { 
      IStrategoTerm w_98 = null;
      IStrategoTerm t_98 = null;
      IStrategoTerm v_98 = null;
      IStrategoTerm x_98 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consStaticImportDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail11;
      t_98 = term.getSubterm(0);
      v_98 = term.getSubterm(1);
      IStrategoList annos2 = term.getAnnotations();
      w_98 = annos2;
      term = x_13.invoke(context, t_98);
      if(term == null)
        break Fail11;
      x_98 = term;
      term = y_13.invoke(context, v_98);
      if(term == null)
        break Fail11;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consStaticImportDec_2, new IStrategoTerm[]{x_98, term}), checkListAnnos(termFactory, w_98));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}