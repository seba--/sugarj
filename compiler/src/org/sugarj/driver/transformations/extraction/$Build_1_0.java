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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Build_1_0");
    Fail131:
    { 
      IStrategoTerm l_122 = null;
      IStrategoTerm k_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consBuild_1 != ((IStrategoAppl)term).getConstructor())
        break Fail131;
      k_122 = term.getSubterm(0);
      IStrategoList annos103 = term.getAnnotations();
      l_122 = annos103;
      term = x_22.invoke(context, k_122);
      if(term == null)
        break Fail131;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consBuild_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}