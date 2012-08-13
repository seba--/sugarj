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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_22, Strategy g_22, Strategy h_22, Strategy i_22, Strategy j_22, Strategy k_22, Strategy l_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DeprAbstractMethodDec_7_0");
    Fail93:
    { 
      IStrategoTerm e_118 = null;
      IStrategoTerm x_117 = null;
      IStrategoTerm y_117 = null;
      IStrategoTerm z_117 = null;
      IStrategoTerm a_118 = null;
      IStrategoTerm b_118 = null;
      IStrategoTerm c_118 = null;
      IStrategoTerm d_118 = null;
      IStrategoTerm f_118 = null;
      IStrategoTerm g_118 = null;
      IStrategoTerm h_118 = null;
      IStrategoTerm i_118 = null;
      IStrategoTerm j_118 = null;
      IStrategoTerm k_118 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDeprAbstractMethodDec_7 != ((IStrategoAppl)term).getConstructor())
        break Fail93;
      x_117 = term.getSubterm(0);
      y_117 = term.getSubterm(1);
      z_117 = term.getSubterm(2);
      a_118 = term.getSubterm(3);
      b_118 = term.getSubterm(4);
      c_118 = term.getSubterm(5);
      d_118 = term.getSubterm(6);
      IStrategoList annos74 = term.getAnnotations();
      e_118 = annos74;
      term = f_22.invoke(context, x_117);
      if(term == null)
        break Fail93;
      f_118 = term;
      term = g_22.invoke(context, y_117);
      if(term == null)
        break Fail93;
      g_118 = term;
      term = h_22.invoke(context, z_117);
      if(term == null)
        break Fail93;
      h_118 = term;
      term = i_22.invoke(context, a_118);
      if(term == null)
        break Fail93;
      i_118 = term;
      term = j_22.invoke(context, b_118);
      if(term == null)
        break Fail93;
      j_118 = term;
      term = k_22.invoke(context, c_118);
      if(term == null)
        break Fail93;
      k_118 = term;
      term = l_22.invoke(context, d_118);
      if(term == null)
        break Fail93;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDeprAbstractMethodDec_7, new IStrategoTerm[]{f_118, g_118, h_118, i_118, j_118, k_118, term}), checkListAnnos(termFactory, e_118));
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