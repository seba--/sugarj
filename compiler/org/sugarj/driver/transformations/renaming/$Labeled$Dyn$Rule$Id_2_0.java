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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_10, Strategy h_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LabeledDynRuleId_2_0");
    Fail18:
    { 
      IStrategoTerm p_90 = null;
      IStrategoTerm m_90 = null;
      IStrategoTerm o_90 = null;
      IStrategoTerm t_90 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLabeledDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail18;
      m_90 = term.getSubterm(0);
      o_90 = term.getSubterm(1);
      IStrategoList annos8 = term.getAnnotations();
      p_90 = annos8;
      term = g_10.invoke(context, m_90);
      if(term == null)
        break Fail18;
      t_90 = term;
      term = h_10.invoke(context, o_90);
      if(term == null)
        break Fail18;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLabeledDynRuleId_2, new IStrategoTerm[]{t_90, term}), checkListAnnos(termFactory, p_90));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}