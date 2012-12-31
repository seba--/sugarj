package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Labeled$Dyn$Rule$Id_2_0 extends Strategy 
{ 
  public static $Labeled$Dyn$Rule$Id_2_0 instance = new $Labeled$Dyn$Rule$Id_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_10, Strategy i_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LabeledDynRuleId_2_0");
    Fail14:
    { 
      IStrategoTerm t_90 = null;
      IStrategoTerm o_90 = null;
      IStrategoTerm p_90 = null;
      IStrategoTerm v_90 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLabeledDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail14;
      o_90 = term.getSubterm(0);
      p_90 = term.getSubterm(1);
      IStrategoList annos8 = term.getAnnotations();
      t_90 = annos8;
      term = h_10.invoke(context, o_90);
      if(term == null)
        break Fail14;
      v_90 = term;
      term = i_10.invoke(context, p_90);
      if(term == null)
        break Fail14;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLabeledDynRuleId_2, new IStrategoTerm[]{v_90, term}), checkListAnnos(termFactory, t_90));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}