package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class sorts_1_0 extends Strategy 
{ 
  public static sorts_1_0 instance = new sorts_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sorts_1_0");
    Fail45:
    { 
      IStrategoTerm t_108 = null;
      IStrategoTerm s_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._conssorts_1 != ((IStrategoAppl)term).getConstructor())
        break Fail45;
      s_108 = term.getSubterm(0);
      IStrategoList annos27 = term.getAnnotations();
      t_108 = annos27;
      term = x_18.invoke(context, s_108);
      if(term == null)
        break Fail45;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._conssorts_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}