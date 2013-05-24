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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_340, Strategy i_340)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleAssignAdd_2_0");
    Fail863:
    { 
      IStrategoTerm z_440 = null;
      IStrategoTerm x_440 = null;
      IStrategoTerm y_440 = null;
      IStrategoTerm a_441 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consDynRuleAssignAdd_2 != ((IStrategoAppl)term).getConstructor())
        break Fail863;
      x_440 = term.getSubterm(0);
      y_440 = term.getSubterm(1);
      IStrategoList annos109 = term.getAnnotations();
      z_440 = annos109;
      term = h_340.invoke(context, x_440);
      if(term == null)
        break Fail863;
      a_441 = term;
      term = i_340.invoke(context, y_440);
      if(term == null)
        break Fail863;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consDynRuleAssignAdd_2, new IStrategoTerm[]{a_441, term}), checkListAnnos(termFactory, z_440));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}