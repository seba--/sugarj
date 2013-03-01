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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_40, Strategy y_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddLabelDynRuleId_2_0");
    Fail254:
    { 
      IStrategoTerm r_175 = null;
      IStrategoTerm p_175 = null;
      IStrategoTerm q_175 = null;
      IStrategoTerm s_175 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAddLabelDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail254;
      p_175 = term.getSubterm(0);
      q_175 = term.getSubterm(1);
      IStrategoList annos201 = term.getAnnotations();
      r_175 = annos201;
      term = x_40.invoke(context, p_175);
      if(term == null)
        break Fail254;
      s_175 = term;
      term = y_40.invoke(context, q_175);
      if(term == null)
        break Fail254;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAddLabelDynRuleId_2, new IStrategoTerm[]{s_175, term}), checkListAnnos(termFactory, r_175));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}