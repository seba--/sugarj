package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_10, Strategy c_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LabeledDynRuleScopeId_2_0");
    Fail15:
    { 
      IStrategoTerm w_89 = null;
      IStrategoTerm t_89 = null;
      IStrategoTerm u_89 = null;
      IStrategoTerm x_89 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLabeledDynRuleScopeId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail15;
      t_89 = term.getSubterm(0);
      u_89 = term.getSubterm(1);
      IStrategoList annos5 = term.getAnnotations();
      w_89 = annos5;
      term = b_10.invoke(context, t_89);
      if(term == null)
        break Fail15;
      x_89 = term;
      term = c_10.invoke(context, u_89);
      if(term == null)
        break Fail15;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLabeledDynRuleScopeId_2, new IStrategoTerm[]{x_89, term}), checkListAnnos(termFactory, w_89));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}