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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_340, Strategy p_340)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AddLabelDynRuleId_2_0");
    Fail866:
    { 
      IStrategoTerm q_441 = null;
      IStrategoTerm o_441 = null;
      IStrategoTerm p_441 = null;
      IStrategoTerm r_441 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consAddLabelDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail866;
      o_441 = term.getSubterm(0);
      p_441 = term.getSubterm(1);
      IStrategoList annos112 = term.getAnnotations();
      q_441 = annos112;
      term = o_340.invoke(context, o_441);
      if(term == null)
        break Fail866;
      r_441 = term;
      term = p_340.invoke(context, p_441);
      if(term == null)
        break Fail866;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consAddLabelDynRuleId_2, new IStrategoTerm[]{r_441, term}), checkListAnnos(termFactory, q_441));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}