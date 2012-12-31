package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rule_3_0 extends Strategy 
{ 
  public static $Rule_3_0 instance = new $Rule_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_11, Strategy e_11, Strategy f_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rule_3_0");
    Fail26:
    { 
      IStrategoTerm r_93 = null;
      IStrategoTerm o_93 = null;
      IStrategoTerm p_93 = null;
      IStrategoTerm q_93 = null;
      IStrategoTerm s_93 = null;
      IStrategoTerm t_93 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26;
      o_93 = term.getSubterm(0);
      p_93 = term.getSubterm(1);
      q_93 = term.getSubterm(2);
      IStrategoList annos20 = term.getAnnotations();
      r_93 = annos20;
      term = d_11.invoke(context, o_93);
      if(term == null)
        break Fail26;
      s_93 = term;
      term = e_11.invoke(context, p_93);
      if(term == null)
        break Fail26;
      t_93 = term;
      term = f_11.invoke(context, q_93);
      if(term == null)
        break Fail26;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRule_3, new IStrategoTerm[]{s_93, t_93, term}), checkListAnnos(termFactory, r_93));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}