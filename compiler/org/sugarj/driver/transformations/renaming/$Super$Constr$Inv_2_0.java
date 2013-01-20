package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Super$Constr$Inv_2_0 extends Strategy 
{ 
  public static $Super$Constr$Inv_2_0 instance = new $Super$Constr$Inv_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_31, Strategy s_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SuperConstrInv_2_0");
    Fail92:
    { 
      IStrategoTerm o_143 = null;
      IStrategoTerm l_143 = null;
      IStrategoTerm m_143 = null;
      IStrategoTerm p_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSuperConstrInv_2 != ((IStrategoAppl)term).getConstructor())
        break Fail92;
      l_143 = term.getSubterm(0);
      m_143 = term.getSubterm(1);
      IStrategoList annos68 = term.getAnnotations();
      o_143 = annos68;
      term = r_31.invoke(context, l_143);
      if(term == null)
        break Fail92;
      p_143 = term;
      term = s_31.invoke(context, m_143);
      if(term == null)
        break Fail92;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSuperConstrInv_2, new IStrategoTerm[]{p_143, term}), checkListAnnos(termFactory, o_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}