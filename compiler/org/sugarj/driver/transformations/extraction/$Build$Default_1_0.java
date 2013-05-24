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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BuildDefault_1_0");
    Fail929:
    { 
      IStrategoTerm p_452 = null;
      IStrategoTerm o_452 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consBuildDefault_1 != ((IStrategoAppl)term).getConstructor())
        break Fail929;
      o_452 = term.getSubterm(0);
      IStrategoList annos174 = term.getAnnotations();
      p_452 = annos174;
      term = w_344.invoke(context, o_452);
      if(term == null)
        break Fail929;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consBuildDefault_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_452));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}