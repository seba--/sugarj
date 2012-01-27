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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QThis_1_0");
    Fail146:
    { 
      IStrategoTerm a_127 = null;
      IStrategoTerm z_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQThis_1 != ((IStrategoAppl)term).getConstructor())
        break Fail146;
      z_126 = term.getSubterm(0);
      IStrategoList annos131 = term.getAnnotations();
      a_127 = annos131;
      term = i_24.invoke(context, z_126);
      if(term == null)
        break Fail146;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQThis_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}