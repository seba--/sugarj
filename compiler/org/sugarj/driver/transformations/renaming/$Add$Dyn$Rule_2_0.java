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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_10, Strategy v_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddDynRule_2_0");
    Fail23:
    { 
      IStrategoTerm g_92 = null;
      IStrategoTerm e_92 = null;
      IStrategoTerm f_92 = null;
      IStrategoTerm h_92 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAddDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail23;
      e_92 = term.getSubterm(0);
      f_92 = term.getSubterm(1);
      IStrategoList annos13 = term.getAnnotations();
      g_92 = annos13;
      term = u_10.invoke(context, e_92);
      if(term == null)
        break Fail23;
      h_92 = term;
      term = v_10.invoke(context, f_92);
      if(term == null)
        break Fail23;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAddDynRule_2, new IStrategoTerm[]{h_92, term}), checkListAnnos(termFactory, g_92));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}