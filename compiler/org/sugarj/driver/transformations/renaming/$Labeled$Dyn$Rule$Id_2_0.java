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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_10, Strategy n_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LabeledDynRuleId_2_0");
    Fail17:
    { 
      IStrategoTerm b_91 = null;
      IStrategoTerm y_90 = null;
      IStrategoTerm z_90 = null;
      IStrategoTerm c_91 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLabeledDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail17;
      y_90 = term.getSubterm(0);
      z_90 = term.getSubterm(1);
      IStrategoList annos8 = term.getAnnotations();
      b_91 = annos8;
      term = m_10.invoke(context, y_90);
      if(term == null)
        break Fail17;
      c_91 = term;
      term = n_10.invoke(context, z_90);
      if(term == null)
        break Fail17;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLabeledDynRuleId_2, new IStrategoTerm[]{c_91, term}), checkListAnnos(termFactory, b_91));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}