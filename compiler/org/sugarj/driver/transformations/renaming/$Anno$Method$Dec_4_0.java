package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Anno$Method$Dec_4_0 extends Strategy 
{ 
  public static $Anno$Method$Dec_4_0 instance = new $Anno$Method$Dec_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_16, Strategy n_16, Strategy o_16, Strategy p_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoMethodDec_4_0");
    Fail42:
    { 
      IStrategoTerm v_104 = null;
      IStrategoTerm r_104 = null;
      IStrategoTerm s_104 = null;
      IStrategoTerm t_104 = null;
      IStrategoTerm u_104 = null;
      IStrategoTerm w_104 = null;
      IStrategoTerm x_104 = null;
      IStrategoTerm y_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAnnoMethodDec_4 != ((IStrategoAppl)term).getConstructor())
        break Fail42;
      r_104 = term.getSubterm(0);
      s_104 = term.getSubterm(1);
      t_104 = term.getSubterm(2);
      u_104 = term.getSubterm(3);
      IStrategoList annos30 = term.getAnnotations();
      v_104 = annos30;
      term = m_16.invoke(context, r_104);
      if(term == null)
        break Fail42;
      w_104 = term;
      term = n_16.invoke(context, s_104);
      if(term == null)
        break Fail42;
      x_104 = term;
      term = o_16.invoke(context, t_104);
      if(term == null)
        break Fail42;
      y_104 = term;
      term = p_16.invoke(context, u_104);
      if(term == null)
        break Fail42;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAnnoMethodDec_4, new IStrategoTerm[]{w_104, x_104, y_104, term}), checkListAnnos(termFactory, v_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}