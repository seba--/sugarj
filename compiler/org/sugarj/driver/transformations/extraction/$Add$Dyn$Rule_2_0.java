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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_340, Strategy c_340)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddDynRule_2_0");
    Fail860:
    { 
      IStrategoTerm k_440 = null;
      IStrategoTerm i_440 = null;
      IStrategoTerm j_440 = null;
      IStrategoTerm l_440 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consAddDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail860;
      i_440 = term.getSubterm(0);
      j_440 = term.getSubterm(1);
      IStrategoList annos106 = term.getAnnotations();
      k_440 = annos106;
      term = b_340.invoke(context, i_440);
      if(term == null)
        break Fail860;
      l_440 = term;
      term = c_340.invoke(context, j_440);
      if(term == null)
        break Fail860;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consAddDynRule_2, new IStrategoTerm[]{l_440, term}), checkListAnnos(termFactory, k_440));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}