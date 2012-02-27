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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_17, Strategy d_17, Strategy e_17, Strategy f_17, Strategy g_17, Strategy h_17, Strategy i_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DeprAbstractMethodDec_7_0");
    Fail47:
    { 
      IStrategoTerm b_106 = null;
      IStrategoTerm t_105 = null;
      IStrategoTerm u_105 = null;
      IStrategoTerm v_105 = null;
      IStrategoTerm w_105 = null;
      IStrategoTerm x_105 = null;
      IStrategoTerm y_105 = null;
      IStrategoTerm z_105 = null;
      IStrategoTerm c_106 = null;
      IStrategoTerm d_106 = null;
      IStrategoTerm e_106 = null;
      IStrategoTerm f_106 = null;
      IStrategoTerm g_106 = null;
      IStrategoTerm h_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDeprAbstractMethodDec_7 != ((IStrategoAppl)term).getConstructor())
        break Fail47;
      t_105 = term.getSubterm(0);
      u_105 = term.getSubterm(1);
      v_105 = term.getSubterm(2);
      w_105 = term.getSubterm(3);
      x_105 = term.getSubterm(4);
      y_105 = term.getSubterm(5);
      z_105 = term.getSubterm(6);
      IStrategoList annos33 = term.getAnnotations();
      b_106 = annos33;
      term = c_17.invoke(context, t_105);
      if(term == null)
        break Fail47;
      c_106 = term;
      term = d_17.invoke(context, u_105);
      if(term == null)
        break Fail47;
      d_106 = term;
      term = e_17.invoke(context, v_105);
      if(term == null)
        break Fail47;
      e_106 = term;
      term = f_17.invoke(context, w_105);
      if(term == null)
        break Fail47;
      f_106 = term;
      term = g_17.invoke(context, x_105);
      if(term == null)
        break Fail47;
      g_106 = term;
      term = h_17.invoke(context, y_105);
      if(term == null)
        break Fail47;
      h_106 = term;
      term = i_17.invoke(context, z_105);
      if(term == null)
        break Fail47;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDeprAbstractMethodDec_7, new IStrategoTerm[]{c_106, d_106, e_106, f_106, g_106, h_106, term}), checkListAnnos(termFactory, b_106));
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