package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Hexa_1_0 extends Strategy 
{ 
  public static $Hexa_1_0 instance = new $Hexa_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Hexa_1_0");
    Fail232:
    { 
      IStrategoTerm z_173 = null;
      IStrategoTerm y_173 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consHexa_1 != ((IStrategoAppl)term).getConstructor())
        break Fail232;
      y_173 = term.getSubterm(0);
      IStrategoList annos190 = term.getAnnotations();
      z_173 = annos190;
      term = i_40.invoke(context, y_173);
      if(term == null)
        break Fail232;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consHexa_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_173));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}