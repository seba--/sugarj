package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cond$Choice_3_0 extends Strategy 
{ 
  public static $Cond$Choice_3_0 instance = new $Cond$Choice_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_20, Strategy v_20, Strategy w_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CondChoice_3_0");
    Fail83:
    { 
      IStrategoTerm d_116 = null;
      IStrategoTerm a_116 = null;
      IStrategoTerm b_116 = null;
      IStrategoTerm c_116 = null;
      IStrategoTerm e_116 = null;
      IStrategoTerm f_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consCondChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail83;
      a_116 = term.getSubterm(0);
      b_116 = term.getSubterm(1);
      c_116 = term.getSubterm(2);
      IStrategoList annos60 = term.getAnnotations();
      d_116 = annos60;
      term = u_20.invoke(context, a_116);
      if(term == null)
        break Fail83;
      e_116 = term;
      term = v_20.invoke(context, b_116);
      if(term == null)
        break Fail83;
      f_116 = term;
      term = w_20.invoke(context, c_116);
      if(term == null)
        break Fail83;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consCondChoice_3, new IStrategoTerm[]{e_116, f_116, term}), checkListAnnos(termFactory, d_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}