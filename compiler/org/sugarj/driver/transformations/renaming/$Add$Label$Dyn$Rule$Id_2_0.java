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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_10, Strategy i_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddLabelDynRuleId_2_0");
    Fail17:
    { 
      IStrategoTerm m_90 = null;
      IStrategoTerm j_90 = null;
      IStrategoTerm l_90 = null;
      IStrategoTerm o_90 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAddLabelDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail17;
      j_90 = term.getSubterm(0);
      l_90 = term.getSubterm(1);
      IStrategoList annos7 = term.getAnnotations();
      m_90 = annos7;
      term = h_10.invoke(context, j_90);
      if(term == null)
        break Fail17;
      o_90 = term;
      term = i_10.invoke(context, l_90);
      if(term == null)
        break Fail17;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAddLabelDynRuleId_2, new IStrategoTerm[]{o_90, term}), checkListAnnos(termFactory, m_90));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}