package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Build_1_0 extends Strategy 
{ 
  public static $Build_1_0 instance = new $Build_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Build_1_0");
    Fail104:
    { 
      IStrategoTerm o_108 = null;
      IStrategoTerm n_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consBuild_1 != ((IStrategoAppl)term).getConstructor())
        break Fail104;
      n_108 = term.getSubterm(0);
      IStrategoList annos94 = term.getAnnotations();
      o_108 = annos94;
      term = q_16.invoke(context, n_108);
      if(term == null)
        break Fail104;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consBuild_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}