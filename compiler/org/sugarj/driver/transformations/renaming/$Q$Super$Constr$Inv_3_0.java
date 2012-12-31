package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Q$Super$Constr$Inv_3_0 extends Strategy 
{ 
  public static $Q$Super$Constr$Inv_3_0 instance = new $Q$Super$Constr$Inv_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_31, Strategy p_31, Strategy q_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QSuperConstrInv_3_0");
    Fail91:
    { 
      IStrategoTerm g_143 = null;
      IStrategoTerm c_143 = null;
      IStrategoTerm e_143 = null;
      IStrategoTerm f_143 = null;
      IStrategoTerm h_143 = null;
      IStrategoTerm i_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consQSuperConstrInv_3 != ((IStrategoAppl)term).getConstructor())
        break Fail91;
      c_143 = term.getSubterm(0);
      e_143 = term.getSubterm(1);
      f_143 = term.getSubterm(2);
      IStrategoList annos67 = term.getAnnotations();
      g_143 = annos67;
      term = o_31.invoke(context, c_143);
      if(term == null)
        break Fail91;
      h_143 = term;
      term = p_31.invoke(context, e_143);
      if(term == null)
        break Fail91;
      i_143 = term;
      term = q_31.invoke(context, f_143);
      if(term == null)
        break Fail91;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consQSuperConstrInv_3, new IStrategoTerm[]{h_143, i_143, term}), checkListAnnos(termFactory, g_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}