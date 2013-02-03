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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_10, Strategy i_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LabeledDynRuleScopeId_2_0");
    Fail14:
    { 
      IStrategoTerm f_90 = null;
      IStrategoTerm c_90 = null;
      IStrategoTerm d_90 = null;
      IStrategoTerm g_90 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLabeledDynRuleScopeId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail14;
      c_90 = term.getSubterm(0);
      d_90 = term.getSubterm(1);
      IStrategoList annos5 = term.getAnnotations();
      f_90 = annos5;
      term = h_10.invoke(context, c_90);
      if(term == null)
        break Fail14;
      g_90 = term;
      term = i_10.invoke(context, d_90);
      if(term == null)
        break Fail14;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLabeledDynRuleScopeId_2, new IStrategoTerm[]{g_90, term}), checkListAnnos(termFactory, f_90));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}