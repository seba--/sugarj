package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_10, Strategy k_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LabeledDynRuleId_2_0");
    Fail18:
    { 
      IStrategoTerm w_90 = null;
      IStrategoTerm t_90 = null;
      IStrategoTerm v_90 = null;
      IStrategoTerm y_90 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLabeledDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail18;
      t_90 = term.getSubterm(0);
      v_90 = term.getSubterm(1);
      IStrategoList annos8 = term.getAnnotations();
      w_90 = annos8;
      term = j_10.invoke(context, t_90);
      if(term == null)
        break Fail18;
      y_90 = term;
      term = k_10.invoke(context, v_90);
      if(term == null)
        break Fail18;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLabeledDynRuleId_2, new IStrategoTerm[]{y_90, term}), checkListAnnos(termFactory, w_90));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}