package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_347)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Build_1_0");
    Fail976:
    { 
      IStrategoTerm p_459 = null;
      IStrategoTerm o_459 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consBuild_1 != ((IStrategoAppl)term).getConstructor())
        break Fail976;
      o_459 = term.getSubterm(0);
      IStrategoList annos216 = term.getAnnotations();
      p_459 = annos216;
      term = o_347.invoke(context, o_459);
      if(term == null)
        break Fail976;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consBuild_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_459));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}