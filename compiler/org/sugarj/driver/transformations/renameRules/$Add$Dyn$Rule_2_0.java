package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_10, Strategy t_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddDynRule_2_0");
    Fail19:
    { 
      IStrategoTerm e_92 = null;
      IStrategoTerm c_92 = null;
      IStrategoTerm d_92 = null;
      IStrategoTerm f_92 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAddDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail19;
      c_92 = term.getSubterm(0);
      d_92 = term.getSubterm(1);
      IStrategoList annos13 = term.getAnnotations();
      e_92 = annos13;
      term = s_10.invoke(context, c_92);
      if(term == null)
        break Fail19;
      f_92 = term;
      term = t_10.invoke(context, d_92);
      if(term == null)
        break Fail19;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAddDynRule_2, new IStrategoTerm[]{f_92, term}), checkListAnnos(termFactory, e_92));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}