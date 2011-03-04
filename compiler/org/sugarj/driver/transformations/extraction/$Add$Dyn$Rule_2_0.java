package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Add$Dyn$Rule_2_0 extends Strategy 
{ 
  public static $Add$Dyn$Rule_2_0 instance = new $Add$Dyn$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_17, Strategy e_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddDynRule_2_0");
    Fail37:
    { 
      IStrategoTerm y_105 = null;
      IStrategoTerm w_105 = null;
      IStrategoTerm x_105 = null;
      IStrategoTerm z_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consAddDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      w_105 = term.getSubterm(0);
      x_105 = term.getSubterm(1);
      IStrategoList annos13 = term.getAnnotations();
      y_105 = annos13;
      term = d_17.invoke(context, w_105);
      if(term == null)
        break Fail37;
      z_105 = term;
      term = e_17.invoke(context, x_105);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consAddDynRule_2, new IStrategoTerm[]{z_105, term}), checkListAnnos(termFactory, y_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}