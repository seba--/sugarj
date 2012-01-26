package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Remain_2_0 extends Strategy 
{ 
  public static $Assign$Remain_2_0 instance = new $Assign$Remain_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_21, Strategy p_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignRemain_2_0");
    Fail109:
    { 
      IStrategoTerm z_118 = null;
      IStrategoTerm x_118 = null;
      IStrategoTerm y_118 = null;
      IStrategoTerm a_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAssignRemain_2 != ((IStrategoAppl)term).getConstructor())
        break Fail109;
      x_118 = term.getSubterm(0);
      y_118 = term.getSubterm(1);
      IStrategoList annos94 = term.getAnnotations();
      z_118 = annos94;
      term = o_21.invoke(context, x_118);
      if(term == null)
        break Fail109;
      a_119 = term;
      term = p_21.invoke(context, y_118);
      if(term == null)
        break Fail109;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAssignRemain_2, new IStrategoTerm[]{a_119, term}), checkListAnnos(termFactory, z_118));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}