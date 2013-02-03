package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Assign_2_0 extends Strategy 
{ 
  public static $Dyn$Rule$Assign_2_0 instance = new $Dyn$Rule$Assign_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_10, Strategy u_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleAssign_2_0");
    Fail20:
    { 
      IStrategoTerm z_91 = null;
      IStrategoTerm x_91 = null;
      IStrategoTerm y_91 = null;
      IStrategoTerm a_92 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail20;
      x_91 = term.getSubterm(0);
      y_91 = term.getSubterm(1);
      IStrategoList annos11 = term.getAnnotations();
      z_91 = annos11;
      term = t_10.invoke(context, x_91);
      if(term == null)
        break Fail20;
      a_92 = term;
      term = u_10.invoke(context, y_91);
      if(term == null)
        break Fail20;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleAssign_2, new IStrategoTerm[]{a_92, term}), checkListAnnos(termFactory, z_91));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}