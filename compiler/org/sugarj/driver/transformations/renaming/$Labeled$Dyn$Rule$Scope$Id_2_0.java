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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_10, Strategy f_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LabeledDynRuleScopeId_2_0");
    Fail15:
    { 
      IStrategoTerm a_90 = null;
      IStrategoTerm x_89 = null;
      IStrategoTerm z_89 = null;
      IStrategoTerm c_90 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLabeledDynRuleScopeId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail15;
      x_89 = term.getSubterm(0);
      z_89 = term.getSubterm(1);
      IStrategoList annos5 = term.getAnnotations();
      a_90 = annos5;
      term = e_10.invoke(context, x_89);
      if(term == null)
        break Fail15;
      c_90 = term;
      term = f_10.invoke(context, z_89);
      if(term == null)
        break Fail15;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLabeledDynRuleScopeId_2, new IStrategoTerm[]{c_90, term}), checkListAnnos(termFactory, a_90));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}