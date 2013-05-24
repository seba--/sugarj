package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class func_2_0 extends Strategy 
{ 
  public static func_2_0 instance = new func_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_350, Strategy t_350)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("func_2_0");
    Fail1044:
    { 
      IStrategoTerm b_468 = null;
      IStrategoTerm z_467 = null;
      IStrategoTerm a_468 = null;
      IStrategoTerm c_468 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consfunc_2 != ((IStrategoAppl)term).getConstructor())
        break Fail1044;
      z_467 = term.getSubterm(0);
      a_468 = term.getSubterm(1);
      IStrategoList annos271 = term.getAnnotations();
      b_468 = annos271;
      term = s_350.invoke(context, z_467);
      if(term == null)
        break Fail1044;
      c_468 = term;
      term = t_350.invoke(context, a_468);
      if(term == null)
        break Fail1044;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consfunc_2, new IStrategoTerm[]{c_468, term}), checkListAnnos(termFactory, b_468));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}