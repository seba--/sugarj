package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Id_1_0 extends Strategy 
{ 
  public static $Dyn$Rule$Id_1_0 instance = new $Dyn$Rule$Id_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleId_1_0");
    Fail41:
    { 
      IStrategoTerm q_104 = null;
      IStrategoTerm p_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consDynRuleId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail41;
      p_104 = term.getSubterm(0);
      IStrategoList annos14 = term.getAnnotations();
      q_104 = annos14;
      term = o_16.invoke(context, p_104);
      if(term == null)
        break Fail41;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consDynRuleId_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}