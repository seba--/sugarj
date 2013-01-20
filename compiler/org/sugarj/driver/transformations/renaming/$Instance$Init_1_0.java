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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_32)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InstanceInit_1_0");
    Fail98:
    { 
      IStrategoTerm c_145 = null;
      IStrategoTerm b_145 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consInstanceInit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail98;
      b_145 = term.getSubterm(0);
      IStrategoList annos74 = term.getAnnotations();
      c_145 = annos74;
      term = f_32.invoke(context, b_145);
      if(term == null)
        break Fail98;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consInstanceInit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_145));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}