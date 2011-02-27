package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Set$Dyn$Rule_2_0 extends Strategy 
{ 
  public static $Set$Dyn$Rule_2_0 instance = new $Set$Dyn$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_17, Strategy g_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SetDynRule_2_0");
    Fail37:
    { 
      IStrategoTerm e_106 = null;
      IStrategoTerm c_106 = null;
      IStrategoTerm d_106 = null;
      IStrategoTerm f_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consSetDynRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      c_106 = term.getSubterm(0);
      d_106 = term.getSubterm(1);
      IStrategoList annos14 = term.getAnnotations();
      e_106 = annos14;
      term = f_17.invoke(context, c_106);
      if(term == null)
        break Fail37;
      f_106 = term;
      term = g_17.invoke(context, d_106);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consSetDynRule_2, new IStrategoTerm[]{f_106, term}), checkListAnnos(termFactory, e_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}