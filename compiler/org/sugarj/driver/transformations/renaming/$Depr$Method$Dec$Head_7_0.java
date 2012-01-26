package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Depr$Method$Dec$Head_7_0 extends Strategy 
{ 
  public static $Depr$Method$Dec$Head_7_0 instance = new $Depr$Method$Dec$Head_7_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_18, Strategy g_18, Strategy h_18, Strategy i_18, Strategy j_18, Strategy k_18, Strategy l_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DeprMethodDecHead_7_0");
    Fail63:
    { 
      IStrategoTerm f_110 = null;
      IStrategoTerm y_109 = null;
      IStrategoTerm z_109 = null;
      IStrategoTerm a_110 = null;
      IStrategoTerm b_110 = null;
      IStrategoTerm c_110 = null;
      IStrategoTerm d_110 = null;
      IStrategoTerm e_110 = null;
      IStrategoTerm g_110 = null;
      IStrategoTerm h_110 = null;
      IStrategoTerm i_110 = null;
      IStrategoTerm j_110 = null;
      IStrategoTerm k_110 = null;
      IStrategoTerm l_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDeprMethodDecHead_7 != ((IStrategoAppl)term).getConstructor())
        break Fail63;
      y_109 = term.getSubterm(0);
      z_109 = term.getSubterm(1);
      a_110 = term.getSubterm(2);
      b_110 = term.getSubterm(3);
      c_110 = term.getSubterm(4);
      d_110 = term.getSubterm(5);
      e_110 = term.getSubterm(6);
      IStrategoList annos52 = term.getAnnotations();
      f_110 = annos52;
      term = f_18.invoke(context, y_109);
      if(term == null)
        break Fail63;
      g_110 = term;
      term = g_18.invoke(context, z_109);
      if(term == null)
        break Fail63;
      h_110 = term;
      term = h_18.invoke(context, a_110);
      if(term == null)
        break Fail63;
      i_110 = term;
      term = i_18.invoke(context, b_110);
      if(term == null)
        break Fail63;
      j_110 = term;
      term = j_18.invoke(context, c_110);
      if(term == null)
        break Fail63;
      k_110 = term;
      term = k_18.invoke(context, d_110);
      if(term == null)
        break Fail63;
      l_110 = term;
      term = l_18.invoke(context, e_110);
      if(term == null)
        break Fail63;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consDeprMethodDecHead_7, new IStrategoTerm[]{g_110, h_110, i_110, j_110, k_110, l_110, term}), checkListAnnos(termFactory, f_110));
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