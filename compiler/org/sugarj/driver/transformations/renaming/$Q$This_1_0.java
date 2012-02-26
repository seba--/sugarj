package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Q$This_1_0 extends Strategy 
{ 
  public static $Q$This_1_0 instance = new $Q$This_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QThis_1_0");
    Fail149:
    { 
      IStrategoTerm t_127 = null;
      IStrategoTerm s_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQThis_1 != ((IStrategoAppl)term).getConstructor())
        break Fail149;
      s_127 = term.getSubterm(0);
      IStrategoList annos131 = term.getAnnotations();
      t_127 = annos131;
      term = x_24.invoke(context, s_127);
      if(term == null)
        break Fail149;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQThis_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}