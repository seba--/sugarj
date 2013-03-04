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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_40, Strategy v_40)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LabeledDynRuleScopeId_2_0");
    Fail252:
    { 
      IStrategoTerm j_175 = null;
      IStrategoTerm h_175 = null;
      IStrategoTerm i_175 = null;
      IStrategoTerm k_175 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLabeledDynRuleScopeId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail252;
      h_175 = term.getSubterm(0);
      i_175 = term.getSubterm(1);
      IStrategoList annos199 = term.getAnnotations();
      j_175 = annos199;
      term = u_40.invoke(context, h_175);
      if(term == null)
        break Fail252;
      k_175 = term;
      term = v_40.invoke(context, i_175);
      if(term == null)
        break Fail252;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLabeledDynRuleScopeId_2, new IStrategoTerm[]{k_175, term}), checkListAnnos(termFactory, j_175));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}