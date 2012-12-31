package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Add$Label$Dyn$Rule$Id_2_0 extends Strategy 
{ 
  public static $Add$Label$Dyn$Rule$Id_2_0 instance = new $Add$Label$Dyn$Rule$Id_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_10, Strategy g_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddLabelDynRuleId_2_0");
    Fail13:
    { 
      IStrategoTerm j_90 = null;
      IStrategoTerm g_90 = null;
      IStrategoTerm i_90 = null;
      IStrategoTerm l_90 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAddLabelDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail13;
      g_90 = term.getSubterm(0);
      i_90 = term.getSubterm(1);
      IStrategoList annos7 = term.getAnnotations();
      j_90 = annos7;
      term = f_10.invoke(context, g_90);
      if(term == null)
        break Fail13;
      l_90 = term;
      term = g_10.invoke(context, i_90);
      if(term == null)
        break Fail13;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAddLabelDynRuleId_2, new IStrategoTerm[]{l_90, term}), checkListAnnos(termFactory, j_90));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}