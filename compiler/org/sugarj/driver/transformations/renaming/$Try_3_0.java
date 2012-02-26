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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_19, Strategy r_19, Strategy s_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Try_3_0");
    Fail75:
    { 
      IStrategoTerm a_113 = null;
      IStrategoTerm x_112 = null;
      IStrategoTerm y_112 = null;
      IStrategoTerm z_112 = null;
      IStrategoTerm b_113 = null;
      IStrategoTerm c_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTry_3 != ((IStrategoAppl)term).getConstructor())
        break Fail75;
      x_112 = term.getSubterm(0);
      y_112 = term.getSubterm(1);
      z_112 = term.getSubterm(2);
      IStrategoList annos60 = term.getAnnotations();
      a_113 = annos60;
      term = q_19.invoke(context, x_112);
      if(term == null)
        break Fail75;
      b_113 = term;
      term = r_19.invoke(context, y_112);
      if(term == null)
        break Fail75;
      c_113 = term;
      term = s_19.invoke(context, z_112);
      if(term == null)
        break Fail75;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTry_3, new IStrategoTerm[]{b_113, c_113, term}), checkListAnnos(termFactory, a_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}