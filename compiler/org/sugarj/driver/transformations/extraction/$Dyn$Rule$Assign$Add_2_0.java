package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Assign$Add_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Assign$Add_2_0 instance = new $Dyn$Rule$Assign$Add_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_16, Strategy y_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleAssignAdd_2_0");
    Fail34:
    { 
      IStrategoTerm i_105 = null;
      IStrategoTerm g_105 = null;
      IStrategoTerm h_105 = null;
      IStrategoTerm j_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consDynRuleAssignAdd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail34;
      g_105 = term.getSubterm(0);
      h_105 = term.getSubterm(1);
      IStrategoList annos10 = term.getAnnotations();
      i_105 = annos10;
      term = x_16.invoke(context, g_105);
      if(term == null)
        break Fail34;
      j_105 = term;
      term = y_16.invoke(context, h_105);
      if(term == null)
        break Fail34;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consDynRuleAssignAdd_2, new IStrategoTerm[]{j_105, term}), checkListAnnos(termFactory, i_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}