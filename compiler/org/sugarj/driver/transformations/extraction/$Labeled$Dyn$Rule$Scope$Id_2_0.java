package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Labeled$Dyn$Rule$Scope$Id_2_0 extends Strategy 
{ 
  public static $Labeled$Dyn$Rule$Scope$Id_2_0 instance = new $Labeled$Dyn$Rule$Scope$Id_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_340, Strategy s_340)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LabeledDynRuleScopeId_2_0");
    Fail868:
    { 
      IStrategoTerm y_441 = null;
      IStrategoTerm w_441 = null;
      IStrategoTerm x_441 = null;
      IStrategoTerm z_441 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consLabeledDynRuleScopeId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail868;
      w_441 = term.getSubterm(0);
      x_441 = term.getSubterm(1);
      IStrategoList annos114 = term.getAnnotations();
      y_441 = annos114;
      term = r_340.invoke(context, w_441);
      if(term == null)
        break Fail868;
      z_441 = term;
      term = s_340.invoke(context, x_441);
      if(term == null)
        break Fail868;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consLabeledDynRuleScopeId_2, new IStrategoTerm[]{z_441, term}), checkListAnnos(termFactory, y_441));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}