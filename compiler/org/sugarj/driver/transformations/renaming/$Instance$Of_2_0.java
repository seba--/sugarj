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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_23, Strategy j_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InstanceOf_2_0");
    Fail132:
    { 
      IStrategoTerm d_124 = null;
      IStrategoTerm b_124 = null;
      IStrategoTerm c_124 = null;
      IStrategoTerm e_124 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInstanceOf_2 != ((IStrategoAppl)term).getConstructor())
        break Fail132;
      b_124 = term.getSubterm(0);
      c_124 = term.getSubterm(1);
      IStrategoList annos117 = term.getAnnotations();
      d_124 = annos117;
      term = i_23.invoke(context, b_124);
      if(term == null)
        break Fail132;
      e_124 = term;
      term = j_23.invoke(context, c_124);
      if(term == null)
        break Fail132;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInstanceOf_2, new IStrategoTerm[]{e_124, term}), checkListAnnos(termFactory, d_124));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}