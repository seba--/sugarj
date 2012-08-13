package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Instance$Init_1_0 extends Strategy 
{ 
  public static $Instance$Init_1_0 instance = new $Instance$Init_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InstanceInit_1_0");
    Fail108:
    { 
      IStrategoTerm p_122 = null;
      IStrategoTerm o_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInstanceInit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail108;
      o_122 = term.getSubterm(0);
      IStrategoList annos89 = term.getAnnotations();
      p_122 = annos89;
      term = x_23.invoke(context, o_122);
      if(term == null)
        break Fail108;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInstanceInit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}