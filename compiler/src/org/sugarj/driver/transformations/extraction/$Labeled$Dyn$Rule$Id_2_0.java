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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_16, Strategy u_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LabeledDynRuleId_2_0");
    Fail44:
    { 
      IStrategoTerm e_105 = null;
      IStrategoTerm c_105 = null;
      IStrategoTerm d_105 = null;
      IStrategoTerm f_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consLabeledDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail44;
      c_105 = term.getSubterm(0);
      d_105 = term.getSubterm(1);
      IStrategoList annos17 = term.getAnnotations();
      e_105 = annos17;
      term = t_16.invoke(context, c_105);
      if(term == null)
        break Fail44;
      f_105 = term;
      term = u_16.invoke(context, d_105);
      if(term == null)
        break Fail44;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consLabeledDynRuleId_2, new IStrategoTerm[]{f_105, term}), checkListAnnos(termFactory, e_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}