package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Not_1_0 extends Strategy 
{ 
  public static $Not_1_0 instance = new $Not_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Not_1_0");
    Fail91:
    { 
      IStrategoTerm b_106 = null;
      IStrategoTerm z_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consNot_1 != ((IStrategoAppl)term).getConstructor())
        break Fail91;
      z_105 = term.getSubterm(0);
      IStrategoList annos81 = term.getAnnotations();
      b_106 = annos81;
      term = t_15.invoke(context, z_105);
      if(term == null)
        break Fail91;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consNot_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}