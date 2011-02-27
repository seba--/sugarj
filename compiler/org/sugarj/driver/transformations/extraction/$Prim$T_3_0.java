package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prim$T_3_0 extends Strategy 
{ 
  public static $Prim$T_3_0 instance = new $Prim$T_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_22, Strategy n_22, Strategy o_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimT_3_0");
    Fail114:
    { 
      IStrategoTerm c_121 = null;
      IStrategoTerm z_120 = null;
      IStrategoTerm a_121 = null;
      IStrategoTerm b_121 = null;
      IStrategoTerm d_121 = null;
      IStrategoTerm e_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consPrimT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail114;
      z_120 = term.getSubterm(0);
      a_121 = term.getSubterm(1);
      b_121 = term.getSubterm(2);
      IStrategoList annos90 = term.getAnnotations();
      c_121 = annos90;
      term = m_22.invoke(context, z_120);
      if(term == null)
        break Fail114;
      d_121 = term;
      term = n_22.invoke(context, a_121);
      if(term == null)
        break Fail114;
      e_121 = term;
      term = o_22.invoke(context, b_121);
      if(term == null)
        break Fail114;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consPrimT_3, new IStrategoTerm[]{d_121, e_121, term}), checkListAnnos(termFactory, c_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}