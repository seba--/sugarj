package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Undefine$Dyn$Rule_2_0 extends Strategy 
{ 
  public static $Undefine$Dyn$Rule_2_0 instance = new $Undefine$Dyn$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_339, Strategy y_339)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("UndefineDynRule_2_0");
    Fail858:
    { 
      IStrategoTerm a_440 = null;
      IStrategoTerm y_439 = null;
      IStrategoTerm z_439 = null;
      IStrategoTerm b_440 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consUndefineDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail858;
      y_439 = term.getSubterm(0);
      z_439 = term.getSubterm(1);
      IStrategoList annos104 = term.getAnnotations();
      a_440 = annos104;
      term = x_339.invoke(context, y_439);
      if(term == null)
        break Fail858;
      b_440 = term;
      term = y_339.invoke(context, z_439);
      if(term == null)
        break Fail858;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consUndefineDynRule_2, new IStrategoTerm[]{b_440, term}), checkListAnnos(termFactory, a_440));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}