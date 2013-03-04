package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $New$Instance_4_0 extends Strategy 
{ 
  public static $New$Instance_4_0 instance = new $New$Instance_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_38, Strategy n_38, Strategy o_38, Strategy p_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NewInstance_4_0");
    Fail186:
    { 
      IStrategoTerm d_168 = null;
      IStrategoTerm z_167 = null;
      IStrategoTerm a_168 = null;
      IStrategoTerm b_168 = null;
      IStrategoTerm c_168 = null;
      IStrategoTerm e_168 = null;
      IStrategoTerm f_168 = null;
      IStrategoTerm g_168 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consNewInstance_4 != ((IStrategoAppl)term).getConstructor())
        break Fail186;
      z_167 = term.getSubterm(0);
      a_168 = term.getSubterm(1);
      b_168 = term.getSubterm(2);
      c_168 = term.getSubterm(3);
      IStrategoList annos156 = term.getAnnotations();
      d_168 = annos156;
      term = m_38.invoke(context, z_167);
      if(term == null)
        break Fail186;
      e_168 = term;
      term = n_38.invoke(context, a_168);
      if(term == null)
        break Fail186;
      f_168 = term;
      term = o_38.invoke(context, b_168);
      if(term == null)
        break Fail186;
      g_168 = term;
      term = p_38.invoke(context, c_168);
      if(term == null)
        break Fail186;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consNewInstance_4, new IStrategoTerm[]{e_168, f_168, g_168, term}), checkListAnnos(termFactory, d_168));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}