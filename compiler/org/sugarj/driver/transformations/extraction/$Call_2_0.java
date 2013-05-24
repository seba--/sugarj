package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call_2_0 extends Strategy 
{ 
  public static $Call_2_0 instance = new $Call_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_342, Strategy v_342)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Call_2_0");
    Fail893:
    { 
      IStrategoTerm d_447 = null;
      IStrategoTerm b_447 = null;
      IStrategoTerm c_447 = null;
      IStrategoTerm e_447 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail893;
      b_447 = term.getSubterm(0);
      c_447 = term.getSubterm(1);
      IStrategoList annos139 = term.getAnnotations();
      d_447 = annos139;
      term = u_342.invoke(context, b_447);
      if(term == null)
        break Fail893;
      e_447 = term;
      term = v_342.invoke(context, c_447);
      if(term == null)
        break Fail893;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consCall_2, new IStrategoTerm[]{e_447, term}), checkListAnnos(termFactory, d_447));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}