package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Array$Init_1_0 extends Strategy 
{ 
  public static $Array$Init_1_0 instance = new $Array$Init_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ArrayInit_1_0");
    Fail101:
    { 
      IStrategoTerm u_117 = null;
      IStrategoTerm t_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consArrayInit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail101;
      t_117 = term.getSubterm(0);
      IStrategoList annos84 = term.getAnnotations();
      u_117 = annos84;
      term = l_21.invoke(context, t_117);
      if(term == null)
        break Fail101;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consArrayInit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}