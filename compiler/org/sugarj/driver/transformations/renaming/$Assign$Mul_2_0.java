package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Assign$Mul_2_0 extends Strategy 
{ 
  public static $Assign$Mul_2_0 instance = new $Assign$Mul_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_36, Strategy b_36)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AssignMul_2_0");
    Fail152:
    { 
      IStrategoTerm g_159 = null;
      IStrategoTerm a_159 = null;
      IStrategoTerm e_159 = null;
      IStrategoTerm i_159 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAssignMul_2 != ((IStrategoAppl)term).getConstructor())
        break Fail152;
      a_159 = term.getSubterm(0);
      e_159 = term.getSubterm(1);
      IStrategoList annos122 = term.getAnnotations();
      g_159 = annos122;
      term = a_36.invoke(context, a_159);
      if(term == null)
        break Fail152;
      i_159 = term;
      term = b_36.invoke(context, e_159);
      if(term == null)
        break Fail152;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAssignMul_2, new IStrategoTerm[]{i_159, term}), checkListAnnos(termFactory, g_159));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}