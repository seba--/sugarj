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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BuildDefaultPT_1_0");
    Fail165:
    { 
      IStrategoTerm u_127 = null;
      IStrategoTerm t_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consBuildDefaultPT_1 != ((IStrategoAppl)term).getConstructor())
        break Fail165;
      t_127 = term.getSubterm(0);
      IStrategoList annos134 = term.getAnnotations();
      u_127 = annos134;
      term = r_24.invoke(context, t_127);
      if(term == null)
        break Fail165;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consBuildDefaultPT_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}