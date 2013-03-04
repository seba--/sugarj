package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_41, Strategy f_41)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleAssignAdd_2_0");
    Fail257:
    { 
      IStrategoTerm i_176 = null;
      IStrategoTerm g_176 = null;
      IStrategoTerm h_176 = null;
      IStrategoTerm j_176 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleAssignAdd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail257;
      g_176 = term.getSubterm(0);
      h_176 = term.getSubterm(1);
      IStrategoList annos204 = term.getAnnotations();
      i_176 = annos204;
      term = e_41.invoke(context, g_176);
      if(term == null)
        break Fail257;
      j_176 = term;
      term = f_41.invoke(context, h_176);
      if(term == null)
        break Fail257;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleAssignAdd_2, new IStrategoTerm[]{j_176, term}), checkListAnnos(termFactory, i_176));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}