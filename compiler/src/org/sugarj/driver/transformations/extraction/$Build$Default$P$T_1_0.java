package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BuildDefaultPT_1_0");
    Fail166:
    { 
      IStrategoTerm z_127 = null;
      IStrategoTerm y_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consBuildDefaultPT_1 != ((IStrategoAppl)term).getConstructor())
        break Fail166;
      y_127 = term.getSubterm(0);
      IStrategoList annos135 = term.getAnnotations();
      z_127 = annos135;
      term = t_24.invoke(context, y_127);
      if(term == null)
        break Fail166;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consBuildDefaultPT_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}