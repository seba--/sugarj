package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Try_3_0 extends Strategy 
{ 
  public static $Try_3_0 instance = new $Try_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_25, Strategy c_25, Strategy d_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Try_3_0");
    Fail123:
    { 
      IStrategoTerm w_125 = null;
      IStrategoTerm t_125 = null;
      IStrategoTerm u_125 = null;
      IStrategoTerm v_125 = null;
      IStrategoTerm x_125 = null;
      IStrategoTerm y_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTry_3 != ((IStrategoAppl)term).getConstructor())
        break Fail123;
      t_125 = term.getSubterm(0);
      u_125 = term.getSubterm(1);
      v_125 = term.getSubterm(2);
      IStrategoList annos101 = term.getAnnotations();
      w_125 = annos101;
      term = b_25.invoke(context, t_125);
      if(term == null)
        break Fail123;
      x_125 = term;
      term = c_25.invoke(context, u_125);
      if(term == null)
        break Fail123;
      y_125 = term;
      term = d_25.invoke(context, v_125);
      if(term == null)
        break Fail123;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTry_3, new IStrategoTerm[]{x_125, y_125, term}), checkListAnnos(termFactory, w_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}