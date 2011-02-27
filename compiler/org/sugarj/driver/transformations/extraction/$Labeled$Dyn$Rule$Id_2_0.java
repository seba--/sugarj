package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_16, Strategy t_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LabeledDynRuleId_2_0");
    Fail31:
    { 
      IStrategoTerm w_104 = null;
      IStrategoTerm u_104 = null;
      IStrategoTerm v_104 = null;
      IStrategoTerm x_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consLabeledDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail31;
      u_104 = term.getSubterm(0);
      v_104 = term.getSubterm(1);
      IStrategoList annos8 = term.getAnnotations();
      w_104 = annos8;
      term = s_16.invoke(context, u_104);
      if(term == null)
        break Fail31;
      x_104 = term;
      term = t_16.invoke(context, v_104);
      if(term == null)
        break Fail31;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consLabeledDynRuleId_2, new IStrategoTerm[]{x_104, term}), checkListAnnos(termFactory, w_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}