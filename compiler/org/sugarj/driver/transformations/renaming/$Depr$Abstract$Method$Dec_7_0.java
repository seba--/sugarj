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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_16, Strategy g_16, Strategy h_16, Strategy i_16, Strategy j_16, Strategy k_16, Strategy l_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DeprAbstractMethodDec_7_0");
    Fail42:
    { 
      IStrategoTerm b_105 = null;
      IStrategoTerm u_104 = null;
      IStrategoTerm v_104 = null;
      IStrategoTerm w_104 = null;
      IStrategoTerm x_104 = null;
      IStrategoTerm y_104 = null;
      IStrategoTerm z_104 = null;
      IStrategoTerm a_105 = null;
      IStrategoTerm c_105 = null;
      IStrategoTerm d_105 = null;
      IStrategoTerm e_105 = null;
      IStrategoTerm f_105 = null;
      IStrategoTerm g_105 = null;
      IStrategoTerm h_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDeprAbstractMethodDec_7 != ((IStrategoAppl)term).getConstructor())
        break Fail42;
      u_104 = term.getSubterm(0);
      v_104 = term.getSubterm(1);
      w_104 = term.getSubterm(2);
      x_104 = term.getSubterm(3);
      y_104 = term.getSubterm(4);
      z_104 = term.getSubterm(5);
      a_105 = term.getSubterm(6);
      IStrategoList annos33 = term.getAnnotations();
      b_105 = annos33;
      term = f_16.invoke(context, u_104);
      if(term == null)
        break Fail42;
      c_105 = term;
      term = g_16.invoke(context, v_104);
      if(term == null)
        break Fail42;
      d_105 = term;
      term = h_16.invoke(context, w_104);
      if(term == null)
        break Fail42;
      e_105 = term;
      term = i_16.invoke(context, x_104);
      if(term == null)
        break Fail42;
      f_105 = term;
      term = j_16.invoke(context, y_104);
      if(term == null)
        break Fail42;
      g_105 = term;
      term = k_16.invoke(context, z_104);
      if(term == null)
        break Fail42;
      h_105 = term;
      term = l_16.invoke(context, a_105);
      if(term == null)
        break Fail42;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDeprAbstractMethodDec_7, new IStrategoTerm[]{c_105, d_105, e_105, f_105, g_105, h_105, term}), checkListAnnos(termFactory, b_105));
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