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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_10, Strategy l_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddLabelDynRuleId_2_0");
    Fail16:
    { 
      IStrategoTerm t_90 = null;
      IStrategoTerm o_90 = null;
      IStrategoTerm p_90 = null;
      IStrategoTerm v_90 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAddLabelDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail16;
      o_90 = term.getSubterm(0);
      p_90 = term.getSubterm(1);
      IStrategoList annos7 = term.getAnnotations();
      t_90 = annos7;
      term = k_10.invoke(context, o_90);
      if(term == null)
        break Fail16;
      v_90 = term;
      term = l_10.invoke(context, p_90);
      if(term == null)
        break Fail16;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAddLabelDynRuleId_2, new IStrategoTerm[]{v_90, term}), checkListAnnos(termFactory, t_90));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}