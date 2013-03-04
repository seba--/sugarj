package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BuildDefault_1_0");
    Fail368:
    { 
      IStrategoTerm e_197 = null;
      IStrategoTerm d_197 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consBuildDefault_1 != ((IStrategoAppl)term).getConstructor())
        break Fail368;
      d_197 = term.getSubterm(0);
      IStrategoList annos311 = term.getAnnotations();
      e_197 = annos311;
      term = m_48.invoke(context, d_197);
      if(term == null)
        break Fail368;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consBuildDefault_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_197));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}