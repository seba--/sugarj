package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class prefix_fun_4_0 extends Strategy 
{ 
  public static prefix_fun_4_0 instance = new prefix_fun_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_28, Strategy k_28, Strategy l_28, Strategy m_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("prefix_fun_4_0");
    Fail243:
    { 
      IStrategoTerm e_144 = null;
      IStrategoTerm z_143 = null;
      IStrategoTerm b_144 = null;
      IStrategoTerm c_144 = null;
      IStrategoTerm d_144 = null;
      IStrategoTerm f_144 = null;
      IStrategoTerm g_144 = null;
      IStrategoTerm i_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consprefix_fun_4 != ((IStrategoAppl)term).getConstructor())
        break Fail243;
      z_143 = term.getSubterm(0);
      b_144 = term.getSubterm(1);
      c_144 = term.getSubterm(2);
      d_144 = term.getSubterm(3);
      IStrategoList annos200 = term.getAnnotations();
      e_144 = annos200;
      term = j_28.invoke(context, z_143);
      if(term == null)
        break Fail243;
      f_144 = term;
      term = k_28.invoke(context, b_144);
      if(term == null)
        break Fail243;
      g_144 = term;
      term = l_28.invoke(context, c_144);
      if(term == null)
        break Fail243;
      i_144 = term;
      term = m_28.invoke(context, d_144);
      if(term == null)
        break Fail243;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consprefix_fun_4, new IStrategoTerm[]{f_144, g_144, i_144, term}), checkListAnnos(termFactory, e_144));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}