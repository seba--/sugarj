package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortVar_1_0");
    Fail360:
    { 
      IStrategoTerm d_196 = null;
      IStrategoTerm c_196 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSortVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail360;
      c_196 = term.getSubterm(0);
      IStrategoList annos304 = term.getAnnotations();
      d_196 = annos304;
      term = d_48.invoke(context, c_196);
      if(term == null)
        break Fail360;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSortVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_196));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}