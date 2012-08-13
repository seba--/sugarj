package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method_1_0 extends Strategy 
{ 
  public static $Method_1_0 instance = new $Method_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Method_1_0");
    Fail74:
    { 
      IStrategoTerm d_114 = null;
      IStrategoTerm c_114 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethod_1 != ((IStrategoAppl)term).getConstructor())
        break Fail74;
      c_114 = term.getSubterm(0);
      IStrategoList annos55 = term.getAnnotations();
      d_114 = annos55;
      term = u_20.invoke(context, c_114);
      if(term == null)
        break Fail74;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethod_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_114));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}