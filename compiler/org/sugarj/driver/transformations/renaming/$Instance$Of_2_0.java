package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Instance$Of_2_0 extends Strategy 
{ 
  public static $Instance$Of_2_0 instance = new $Instance$Of_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_23, Strategy y_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InstanceOf_2_0");
    Fail135:
    { 
      IStrategoTerm c_125 = null;
      IStrategoTerm a_125 = null;
      IStrategoTerm b_125 = null;
      IStrategoTerm d_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInstanceOf_2 != ((IStrategoAppl)term).getConstructor())
        break Fail135;
      a_125 = term.getSubterm(0);
      b_125 = term.getSubterm(1);
      IStrategoList annos117 = term.getAnnotations();
      c_125 = annos117;
      term = x_23.invoke(context, a_125);
      if(term == null)
        break Fail135;
      d_125 = term;
      term = y_23.invoke(context, b_125);
      if(term == null)
        break Fail135;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInstanceOf_2, new IStrategoTerm[]{d_125, term}), checkListAnnos(termFactory, c_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}