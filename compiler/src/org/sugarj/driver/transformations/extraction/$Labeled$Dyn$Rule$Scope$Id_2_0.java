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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_16, Strategy p_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LabeledDynRuleScopeId_2_0");
    Fail41:
    { 
      IStrategoTerm r_104 = null;
      IStrategoTerm p_104 = null;
      IStrategoTerm q_104 = null;
      IStrategoTerm s_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consLabeledDynRuleScopeId_2 != ((IStrategoAppl)term).getConstructor())
        break Fail41;
      p_104 = term.getSubterm(0);
      q_104 = term.getSubterm(1);
      IStrategoList annos14 = term.getAnnotations();
      r_104 = annos14;
      term = o_16.invoke(context, p_104);
      if(term == null)
        break Fail41;
      s_104 = term;
      term = p_16.invoke(context, q_104);
      if(term == null)
        break Fail41;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consLabeledDynRuleScopeId_2, new IStrategoTerm[]{s_104, term}), checkListAnnos(termFactory, r_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}