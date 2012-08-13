package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Dec$Head_5_0 extends Strategy 
{ 
  public static $Class$Dec$Head_5_0 instance = new $Class$Dec$Head_5_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_21, Strategy i_21, Strategy j_21, Strategy k_21, Strategy l_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassDecHead_5_0");
    Fail83:
    { 
      IStrategoTerm w_115 = null;
      IStrategoTerm r_115 = null;
      IStrategoTerm s_115 = null;
      IStrategoTerm t_115 = null;
      IStrategoTerm u_115 = null;
      IStrategoTerm v_115 = null;
      IStrategoTerm x_115 = null;
      IStrategoTerm y_115 = null;
      IStrategoTerm z_115 = null;
      IStrategoTerm a_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassDecHead_5 != ((IStrategoAppl)term).getConstructor())
        break Fail83;
      r_115 = term.getSubterm(0);
      s_115 = term.getSubterm(1);
      t_115 = term.getSubterm(2);
      u_115 = term.getSubterm(3);
      v_115 = term.getSubterm(4);
      IStrategoList annos64 = term.getAnnotations();
      w_115 = annos64;
      term = h_21.invoke(context, r_115);
      if(term == null)
        break Fail83;
      x_115 = term;
      term = i_21.invoke(context, s_115);
      if(term == null)
        break Fail83;
      y_115 = term;
      term = j_21.invoke(context, t_115);
      if(term == null)
        break Fail83;
      z_115 = term;
      term = k_21.invoke(context, u_115);
      if(term == null)
        break Fail83;
      a_116 = term;
      term = l_21.invoke(context, v_115);
      if(term == null)
        break Fail83;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassDecHead_5, new IStrategoTerm[]{x_115, y_115, z_115, a_116, term}), checkListAnnos(termFactory, w_115));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}