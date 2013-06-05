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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_28, Strategy i_28, Strategy j_28, Strategy k_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("prefix_fun_4_0");
    Fail242:
    { 
      IStrategoTerm y_143 = null;
      IStrategoTerm t_143 = null;
      IStrategoTerm v_143 = null;
      IStrategoTerm w_143 = null;
      IStrategoTerm x_143 = null;
      IStrategoTerm z_143 = null;
      IStrategoTerm b_144 = null;
      IStrategoTerm c_144 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consprefix_fun_4 != ((IStrategoAppl)term).getConstructor())
        break Fail242;
      t_143 = term.getSubterm(0);
      v_143 = term.getSubterm(1);
      w_143 = term.getSubterm(2);
      x_143 = term.getSubterm(3);
      IStrategoList annos199 = term.getAnnotations();
      y_143 = annos199;
      term = h_28.invoke(context, t_143);
      if(term == null)
        break Fail242;
      z_143 = term;
      term = i_28.invoke(context, v_143);
      if(term == null)
        break Fail242;
      b_144 = term;
      term = j_28.invoke(context, w_143);
      if(term == null)
        break Fail242;
      c_144 = term;
      term = k_28.invoke(context, x_143);
      if(term == null)
        break Fail242;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consprefix_fun_4, new IStrategoTerm[]{z_143, b_144, c_144, term}), checkListAnnos(termFactory, y_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}