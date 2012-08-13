package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Member_3_0 extends Strategy 
{ 
  public static $Member_3_0 instance = new $Member_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_30, Strategy n_30, Strategy o_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Member_3_0");
    Fail202:
    { 
      IStrategoTerm e_147 = null;
      IStrategoTerm b_147 = null;
      IStrategoTerm c_147 = null;
      IStrategoTerm d_147 = null;
      IStrategoTerm f_147 = null;
      IStrategoTerm g_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMember_3 != ((IStrategoAppl)term).getConstructor())
        break Fail202;
      b_147 = term.getSubterm(0);
      c_147 = term.getSubterm(1);
      d_147 = term.getSubterm(2);
      IStrategoList annos176 = term.getAnnotations();
      e_147 = annos176;
      term = m_30.invoke(context, b_147);
      if(term == null)
        break Fail202;
      f_147 = term;
      term = n_30.invoke(context, c_147);
      if(term == null)
        break Fail202;
      g_147 = term;
      term = o_30.invoke(context, d_147);
      if(term == null)
        break Fail202;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMember_3, new IStrategoTerm[]{f_147, g_147, term}), checkListAnnos(termFactory, e_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}