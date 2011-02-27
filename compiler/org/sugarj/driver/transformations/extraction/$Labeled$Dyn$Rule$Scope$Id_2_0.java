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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_16, Strategy o_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LabeledDynRuleScopeId_2_0");
    Fail28:
    { 
      IStrategoTerm j_104 = null;
      IStrategoTerm h_104 = null;
      IStrategoTerm i_104 = null;
      IStrategoTerm k_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consLabeledDynRuleScopeId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      h_104 = term.getSubterm(0);
      i_104 = term.getSubterm(1);
      IStrategoList annos5 = term.getAnnotations();
      j_104 = annos5;
      term = n_16.invoke(context, h_104);
      if(term == null)
        break Fail28;
      k_104 = term;
      term = o_16.invoke(context, i_104);
      if(term == null)
        break Fail28;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consLabeledDynRuleScopeId_2, new IStrategoTerm[]{k_104, term}), checkListAnnos(termFactory, j_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}