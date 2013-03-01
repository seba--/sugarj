package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Return_1_0 extends Strategy 
{ 
  public static $Return_1_0 instance = new $Return_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_33)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Return_1_0");
    Fail117:
    { 
      IStrategoTerm x_149 = null;
      IStrategoTerm w_149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consReturn_1 != ((IStrategoAppl)term).getConstructor())
        break Fail117;
      w_149 = term.getSubterm(0);
      IStrategoList annos90 = term.getAnnotations();
      x_149 = annos90;
      term = r_33.invoke(context, w_149);
      if(term == null)
        break Fail117;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consReturn_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}