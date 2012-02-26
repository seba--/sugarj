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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_17, Strategy w_17, Strategy x_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("QSuperConstrInv_3_0");
    Fail53:
    { 
      IStrategoTerm f_108 = null;
      IStrategoTerm c_108 = null;
      IStrategoTerm d_108 = null;
      IStrategoTerm e_108 = null;
      IStrategoTerm g_108 = null;
      IStrategoTerm h_108 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consQSuperConstrInv_3 != ((IStrategoAppl)term).getConstructor())
        break Fail53;
      c_108 = term.getSubterm(0);
      d_108 = term.getSubterm(1);
      e_108 = term.getSubterm(2);
      IStrategoList annos41 = term.getAnnotations();
      f_108 = annos41;
      term = v_17.invoke(context, c_108);
      if(term == null)
        break Fail53;
      g_108 = term;
      term = w_17.invoke(context, d_108);
      if(term == null)
        break Fail53;
      h_108 = term;
      term = x_17.invoke(context, e_108);
      if(term == null)
        break Fail53;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consQSuperConstrInv_3, new IStrategoTerm[]{g_108, h_108, term}), checkListAnnos(termFactory, f_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}