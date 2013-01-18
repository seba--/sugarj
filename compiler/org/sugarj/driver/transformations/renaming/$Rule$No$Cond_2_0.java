package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rule$No$Cond_2_0 extends Strategy 
{ 
  public static $Rule$No$Cond_2_0 instance = new $Rule$No$Cond_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_41, Strategy z_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RuleNoCond_2_0");
    Fail268:
    { 
      IStrategoTerm v_178 = null;
      IStrategoTerm o_178 = null;
      IStrategoTerm p_178 = null;
      IStrategoTerm w_178 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRuleNoCond_2 != ((IStrategoAppl)term).getConstructor())
        break Fail268;
      o_178 = term.getSubterm(0);
      p_178 = term.getSubterm(1);
      IStrategoList annos215 = term.getAnnotations();
      v_178 = annos215;
      term = y_41.invoke(context, o_178);
      if(term == null)
        break Fail268;
      w_178 = term;
      term = z_41.invoke(context, p_178);
      if(term == null)
        break Fail268;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRuleNoCond_2, new IStrategoTerm[]{w_178, term}), checkListAnnos(termFactory, v_178));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}