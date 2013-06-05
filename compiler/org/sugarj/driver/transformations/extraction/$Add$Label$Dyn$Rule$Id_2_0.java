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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_16, Strategy q_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddLabelDynRuleId_2_0");
    Fail42:
    { 
      IStrategoTerm u_104 = null;
      IStrategoTerm s_104 = null;
      IStrategoTerm t_104 = null;
      IStrategoTerm v_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consAddLabelDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail42;
      s_104 = term.getSubterm(0);
      t_104 = term.getSubterm(1);
      IStrategoList annos15 = term.getAnnotations();
      u_104 = annos15;
      term = p_16.invoke(context, s_104);
      if(term == null)
        break Fail42;
      v_104 = term;
      term = q_16.invoke(context, t_104);
      if(term == null)
        break Fail42;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consAddLabelDynRuleId_2, new IStrategoTerm[]{v_104, term}), checkListAnnos(termFactory, u_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}