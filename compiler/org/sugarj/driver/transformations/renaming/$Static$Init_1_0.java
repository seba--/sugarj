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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_32)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StaticInit_1_0");
    Fail97:
    { 
      IStrategoTerm x_144 = null;
      IStrategoTerm w_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consStaticInit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail97;
      w_144 = term.getSubterm(0);
      IStrategoList annos73 = term.getAnnotations();
      x_144 = annos73;
      term = e_32.invoke(context, w_144);
      if(term == null)
        break Fail97;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consStaticInit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}