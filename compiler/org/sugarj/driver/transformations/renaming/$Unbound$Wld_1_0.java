package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Unbound$Wld_1_0 extends Strategy 
{ 
  public static $Unbound$Wld_1_0 instance = new $Unbound$Wld_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("UnboundWld_1_0");
    Fail79:
    { 
      IStrategoTerm z_114 = null;
      IStrategoTerm y_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consUnboundWld_1 != ((IStrategoAppl)term).getConstructor())
        break Fail79;
      y_114 = term.getSubterm(0);
      IStrategoList annos60 = term.getAnnotations();
      z_114 = annos60;
      term = b_21.invoke(context, y_114);
      if(term == null)
        break Fail79;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consUnboundWld_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}