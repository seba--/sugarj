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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BuildDefault_1_0");
    Fail160:
    { 
      IStrategoTerm a_127 = null;
      IStrategoTerm z_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consBuildDefault_1 != ((IStrategoAppl)term).getConstructor())
        break Fail160;
      z_126 = term.getSubterm(0);
      IStrategoList annos129 = term.getAnnotations();
      a_127 = annos129;
      term = l_24.invoke(context, z_126);
      if(term == null)
        break Fail160;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consBuildDefault_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}