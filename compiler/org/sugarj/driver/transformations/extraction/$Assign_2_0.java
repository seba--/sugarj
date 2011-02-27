package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign_2_0 extends Strategy 
{ 
  public static $Assign_2_0 instance = new $Assign_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_20, Strategy k_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Assign_2_0");
    Fail78:
    { 
      IStrategoTerm y_114 = null;
      IStrategoTerm w_114 = null;
      IStrategoTerm x_114 = null;
      IStrategoTerm z_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail78;
      w_114 = term.getSubterm(0);
      x_114 = term.getSubterm(1);
      IStrategoList annos55 = term.getAnnotations();
      y_114 = annos55;
      term = j_20.invoke(context, w_114);
      if(term == null)
        break Fail78;
      z_114 = term;
      term = k_20.invoke(context, x_114);
      if(term == null)
        break Fail78;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consAssign_2, new IStrategoTerm[]{z_114, term}), checkListAnnos(termFactory, y_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}