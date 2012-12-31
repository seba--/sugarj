package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Build$Default_1_0 extends Strategy 
{ 
  public static $Build$Default_1_0 instance = new $Build$Default_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BuildDefault_1_0");
    Fail130:
    { 
      IStrategoTerm x_112 = null;
      IStrategoTerm w_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consBuildDefault_1 != ((IStrategoAppl)term).getConstructor())
        break Fail130;
      w_112 = term.getSubterm(0);
      IStrategoList annos120 = term.getAnnotations();
      x_112 = annos120;
      term = z_17.invoke(context, w_112);
      if(term == null)
        break Fail130;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consBuildDefault_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}