package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_16, Strategy r_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddLabelDynRuleId_2_0");
    Fail31:
    { 
      IStrategoTerm r_104 = null;
      IStrategoTerm p_104 = null;
      IStrategoTerm q_104 = null;
      IStrategoTerm s_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consAddLabelDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail31;
      p_104 = term.getSubterm(0);
      q_104 = term.getSubterm(1);
      IStrategoList annos7 = term.getAnnotations();
      r_104 = annos7;
      term = q_16.invoke(context, p_104);
      if(term == null)
        break Fail31;
      s_104 = term;
      term = r_16.invoke(context, q_104);
      if(term == null)
        break Fail31;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consAddLabelDynRuleId_2, new IStrategoTerm[]{s_104, term}), checkListAnnos(termFactory, r_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}