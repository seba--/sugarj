package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_10, Strategy y_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddDynRule_2_0");
    Fail22:
    { 
      IStrategoTerm j_92 = null;
      IStrategoTerm h_92 = null;
      IStrategoTerm i_92 = null;
      IStrategoTerm k_92 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAddDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail22;
      h_92 = term.getSubterm(0);
      i_92 = term.getSubterm(1);
      IStrategoList annos13 = term.getAnnotations();
      j_92 = annos13;
      term = x_10.invoke(context, h_92);
      if(term == null)
        break Fail22;
      k_92 = term;
      term = y_10.invoke(context, i_92);
      if(term == null)
        break Fail22;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAddDynRule_2, new IStrategoTerm[]{k_92, term}), checkListAnnos(termFactory, j_92));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}