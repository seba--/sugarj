package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Scope_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Scope_2_0 instance = new $Dyn$Rule$Scope_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_13, Strategy z_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleScope_2_0");
    Fail64:
    { 
      IStrategoTerm h_101 = null;
      IStrategoTerm f_101 = null;
      IStrategoTerm g_101 = null;
      IStrategoTerm i_101 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleScope_2 != ((IStrategoAppl)term).getConstructor())
        break Fail64;
      f_101 = term.getSubterm(0);
      g_101 = term.getSubterm(1);
      IStrategoList annos54 = term.getAnnotations();
      h_101 = annos54;
      term = y_13.invoke(context, f_101);
      if(term == null)
        break Fail64;
      i_101 = term;
      term = z_13.invoke(context, g_101);
      if(term == null)
        break Fail64;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleScope_2, new IStrategoTerm[]{i_101, term}), checkListAnnos(termFactory, h_101));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}