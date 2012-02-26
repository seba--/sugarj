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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_15, Strategy x_15, Strategy y_15, Strategy z_15, Strategy a_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassDecHead_5_0");
    Fail35:
    { 
      IStrategoTerm g_103 = null;
      IStrategoTerm b_103 = null;
      IStrategoTerm c_103 = null;
      IStrategoTerm d_103 = null;
      IStrategoTerm e_103 = null;
      IStrategoTerm f_103 = null;
      IStrategoTerm h_103 = null;
      IStrategoTerm i_103 = null;
      IStrategoTerm j_103 = null;
      IStrategoTerm k_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassDecHead_5 != ((IStrategoAppl)term).getConstructor())
        break Fail35;
      b_103 = term.getSubterm(0);
      c_103 = term.getSubterm(1);
      d_103 = term.getSubterm(2);
      e_103 = term.getSubterm(3);
      f_103 = term.getSubterm(4);
      IStrategoList annos23 = term.getAnnotations();
      g_103 = annos23;
      term = w_15.invoke(context, b_103);
      if(term == null)
        break Fail35;
      h_103 = term;
      term = x_15.invoke(context, c_103);
      if(term == null)
        break Fail35;
      i_103 = term;
      term = y_15.invoke(context, d_103);
      if(term == null)
        break Fail35;
      j_103 = term;
      term = z_15.invoke(context, e_103);
      if(term == null)
        break Fail35;
      k_103 = term;
      term = a_16.invoke(context, f_103);
      if(term == null)
        break Fail35;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassDecHead_5, new IStrategoTerm[]{h_103, i_103, j_103, k_103, term}), checkListAnnos(termFactory, g_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}