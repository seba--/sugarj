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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_40, Strategy a_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LabeledDynRuleId_2_0");
    Fail255:
    { 
      IStrategoTerm w_175 = null;
      IStrategoTerm u_175 = null;
      IStrategoTerm v_175 = null;
      IStrategoTerm x_175 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLabeledDynRuleId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail255;
      u_175 = term.getSubterm(0);
      v_175 = term.getSubterm(1);
      IStrategoList annos202 = term.getAnnotations();
      w_175 = annos202;
      term = z_40.invoke(context, u_175);
      if(term == null)
        break Fail255;
      x_175 = term;
      term = a_41.invoke(context, v_175);
      if(term == null)
        break Fail255;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLabeledDynRuleId_2, new IStrategoTerm[]{x_175, term}), checkListAnnos(termFactory, w_175));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}