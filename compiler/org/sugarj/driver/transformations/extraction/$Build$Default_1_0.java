package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BuildDefault_1_0");
    Fail159:
    { 
      IStrategoTerm v_126 = null;
      IStrategoTerm u_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consBuildDefault_1 != ((IStrategoAppl)term).getConstructor())
        break Fail159;
      u_126 = term.getSubterm(0);
      IStrategoList annos128 = term.getAnnotations();
      v_126 = annos128;
      term = j_24.invoke(context, u_126);
      if(term == null)
        break Fail159;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consBuildDefault_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}