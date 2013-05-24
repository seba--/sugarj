package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Assign_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Assign_2_0 instance = new $Dyn$Rule$Assign_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_340, Strategy g_340)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleAssign_2_0");
    Fail862:
    { 
      IStrategoTerm u_440 = null;
      IStrategoTerm s_440 = null;
      IStrategoTerm t_440 = null;
      IStrategoTerm v_440 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consDynRuleAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail862;
      s_440 = term.getSubterm(0);
      t_440 = term.getSubterm(1);
      IStrategoList annos108 = term.getAnnotations();
      u_440 = annos108;
      term = f_340.invoke(context, s_440);
      if(term == null)
        break Fail862;
      v_440 = term;
      term = g_340.invoke(context, t_440);
      if(term == null)
        break Fail862;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consDynRuleAssign_2, new IStrategoTerm[]{v_440, term}), checkListAnnos(termFactory, u_440));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}