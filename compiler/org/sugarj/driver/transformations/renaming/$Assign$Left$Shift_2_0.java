package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Left$Shift_2_0 extends Strategy 
{ 
  public static $Assign$Left$Shift_2_0 instance = new $Assign$Left$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_35, Strategy r_35)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignLeftShift_2_0");
    Fail147:
    { 
      IStrategoTerm w_157 = null;
      IStrategoTerm q_157 = null;
      IStrategoTerm r_157 = null;
      IStrategoTerm x_157 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssignLeftShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail147;
      q_157 = term.getSubterm(0);
      r_157 = term.getSubterm(1);
      IStrategoList annos117 = term.getAnnotations();
      w_157 = annos117;
      term = q_35.invoke(context, q_157);
      if(term == null)
        break Fail147;
      x_157 = term;
      term = r_35.invoke(context, r_157);
      if(term == null)
        break Fail147;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssignLeftShift_2, new IStrategoTerm[]{x_157, term}), checkListAnnos(termFactory, w_157));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}