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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InstanceInit_1_0");
    Fail57:
    { 
      IStrategoTerm c_109 = null;
      IStrategoTerm b_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInstanceInit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail57;
      b_109 = term.getSubterm(0);
      IStrategoList annos48 = term.getAnnotations();
      c_109 = annos48;
      term = x_17.invoke(context, b_109);
      if(term == null)
        break Fail57;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInstanceInit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}