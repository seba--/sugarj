package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_10, Strategy f_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddLabelDynRuleId_2_0");
    Fail17:
    { 
      IStrategoTerm i_90 = null;
      IStrategoTerm f_90 = null;
      IStrategoTerm g_90 = null;
      IStrategoTerm j_90 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAddLabelDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail17;
      f_90 = term.getSubterm(0);
      g_90 = term.getSubterm(1);
      IStrategoList annos7 = term.getAnnotations();
      i_90 = annos7;
      term = e_10.invoke(context, f_90);
      if(term == null)
        break Fail17;
      j_90 = term;
      term = f_10.invoke(context, g_90);
      if(term == null)
        break Fail17;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAddLabelDynRuleId_2, new IStrategoTerm[]{j_90, term}), checkListAnnos(termFactory, i_90));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}