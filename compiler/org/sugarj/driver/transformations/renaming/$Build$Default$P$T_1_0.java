package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Build$Default$P$T_1_0 extends Strategy 
{ 
  public static $Build$Default$P$T_1_0 instance = new $Build$Default$P$T_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BuildDefaultPT_1_0");
    Fail373:
    { 
      IStrategoTerm a_198 = null;
      IStrategoTerm z_197 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consBuildDefaultPT_1 != ((IStrategoAppl)term).getConstructor())
        break Fail373;
      z_197 = term.getSubterm(0);
      IStrategoList annos316 = term.getAnnotations();
      a_198 = annos316;
      term = t_48.invoke(context, z_197);
      if(term == null)
        break Fail373;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consBuildDefaultPT_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_198));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}