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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_25, Strategy c_25, Strategy d_25, Strategy e_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NewInstance_4_0");
    Fail150:
    { 
      IStrategoTerm v_127 = null;
      IStrategoTerm r_127 = null;
      IStrategoTerm s_127 = null;
      IStrategoTerm t_127 = null;
      IStrategoTerm u_127 = null;
      IStrategoTerm w_127 = null;
      IStrategoTerm x_127 = null;
      IStrategoTerm y_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNewInstance_4 != ((IStrategoAppl)term).getConstructor())
        break Fail150;
      r_127 = term.getSubterm(0);
      s_127 = term.getSubterm(1);
      t_127 = term.getSubterm(2);
      u_127 = term.getSubterm(3);
      IStrategoList annos130 = term.getAnnotations();
      v_127 = annos130;
      term = b_25.invoke(context, r_127);
      if(term == null)
        break Fail150;
      w_127 = term;
      term = c_25.invoke(context, s_127);
      if(term == null)
        break Fail150;
      x_127 = term;
      term = d_25.invoke(context, t_127);
      if(term == null)
        break Fail150;
      y_127 = term;
      term = e_25.invoke(context, u_127);
      if(term == null)
        break Fail150;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNewInstance_4, new IStrategoTerm[]{w_127, x_127, y_127, term}), checkListAnnos(termFactory, v_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}