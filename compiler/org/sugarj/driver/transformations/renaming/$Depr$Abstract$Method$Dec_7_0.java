package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Depr$Abstract$Method$Dec_7_0 extends Strategy 
{ 
  public static $Depr$Abstract$Method$Dec_7_0 instance = new $Depr$Abstract$Method$Dec_7_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_16, Strategy v_16, Strategy w_16, Strategy x_16, Strategy y_16, Strategy z_16, Strategy a_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DeprAbstractMethodDec_7_0");
    Fail45:
    { 
      IStrategoTerm s_105 = null;
      IStrategoTerm k_105 = null;
      IStrategoTerm l_105 = null;
      IStrategoTerm m_105 = null;
      IStrategoTerm n_105 = null;
      IStrategoTerm o_105 = null;
      IStrategoTerm p_105 = null;
      IStrategoTerm r_105 = null;
      IStrategoTerm t_105 = null;
      IStrategoTerm u_105 = null;
      IStrategoTerm v_105 = null;
      IStrategoTerm w_105 = null;
      IStrategoTerm x_105 = null;
      IStrategoTerm y_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDeprAbstractMethodDec_7 != ((IStrategoAppl)term).getConstructor())
        break Fail45;
      k_105 = term.getSubterm(0);
      l_105 = term.getSubterm(1);
      m_105 = term.getSubterm(2);
      n_105 = term.getSubterm(3);
      o_105 = term.getSubterm(4);
      p_105 = term.getSubterm(5);
      r_105 = term.getSubterm(6);
      IStrategoList annos33 = term.getAnnotations();
      s_105 = annos33;
      term = u_16.invoke(context, k_105);
      if(term == null)
        break Fail45;
      t_105 = term;
      term = v_16.invoke(context, l_105);
      if(term == null)
        break Fail45;
      u_105 = term;
      term = w_16.invoke(context, m_105);
      if(term == null)
        break Fail45;
      v_105 = term;
      term = x_16.invoke(context, n_105);
      if(term == null)
        break Fail45;
      w_105 = term;
      term = y_16.invoke(context, o_105);
      if(term == null)
        break Fail45;
      x_105 = term;
      term = z_16.invoke(context, p_105);
      if(term == null)
        break Fail45;
      y_105 = term;
      term = a_17.invoke(context, r_105);
      if(term == null)
        break Fail45;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDeprAbstractMethodDec_7, new IStrategoTerm[]{t_105, u_105, v_105, w_105, x_105, y_105, term}), checkListAnnos(termFactory, s_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 7 || targs.length != 0)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, sargs[0], sargs[1], sargs[2], sargs[3], sargs[4], sargs[5], sargs[6]);
  }
}