package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Octa_1_0 extends Strategy 
{ 
  public static $Octa_1_0 instance = new $Octa_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Octa_1_0");
    Fail231:
    { 
      IStrategoTerm w_173 = null;
      IStrategoTerm t_173 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOcta_1 != ((IStrategoAppl)term).getConstructor())
        break Fail231;
      t_173 = term.getSubterm(0);
      IStrategoList annos189 = term.getAnnotations();
      w_173 = annos189;
      term = h_40.invoke(context, t_173);
      if(term == null)
        break Fail231;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOcta_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_173));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}