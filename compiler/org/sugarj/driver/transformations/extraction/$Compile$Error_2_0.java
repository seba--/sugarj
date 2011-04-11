package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Compile$Error_2_0 extends Strategy 
{ 
  public static $Compile$Error_2_0 instance = new $Compile$Error_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_30, Strategy x_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompileError_2_0");
    Fail284:
    { 
      IStrategoTerm l_153 = null;
      IStrategoTerm z_152 = null;
      IStrategoTerm k_153 = null;
      IStrategoTerm q_153 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consCompileError_2 != ((IStrategoAppl)term).getConstructor())
        break Fail284;
      z_152 = term.getSubterm(0);
      k_153 = term.getSubterm(1);
      IStrategoList annos238 = term.getAnnotations();
      l_153 = annos238;
      term = w_30.invoke(context, z_152);
      if(term == null)
        break Fail284;
      q_153 = term;
      term = x_30.invoke(context, k_153);
      if(term == null)
        break Fail284;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consCompileError_2, new IStrategoTerm[]{q_153, term}), checkListAnnos(termFactory, l_153));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}