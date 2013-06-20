package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort$Var_1_0 extends Strategy 
{ 
  public static $Sort$Var_1_0 instance = new $Sort$Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortVar_1_0");
    Fail152:
    { 
      IStrategoTerm b_126 = null;
      IStrategoTerm a_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSortVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail152;
      a_126 = term.getSubterm(0);
      IStrategoList annos122 = term.getAnnotations();
      b_126 = annos122;
      term = c_24.invoke(context, a_126);
      if(term == null)
        break Fail152;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSortVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}