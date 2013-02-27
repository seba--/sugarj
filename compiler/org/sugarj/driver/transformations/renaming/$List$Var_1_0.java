package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Var_1_0 extends Strategy 
{ 
  public static $List$Var_1_0 instance = new $List$Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListVar_1_0");
    Fail39:
    { 
      IStrategoTerm y_95 = null;
      IStrategoTerm x_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consListVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail39;
      x_95 = term.getSubterm(0);
      IStrategoList annos29 = term.getAnnotations();
      y_95 = annos29;
      term = b_12.invoke(context, x_95);
      if(term == null)
        break Fail39;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consListVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}