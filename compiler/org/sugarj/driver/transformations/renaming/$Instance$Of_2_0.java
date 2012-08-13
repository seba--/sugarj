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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_29, Strategy j_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InstanceOf_2_0");
    Fail183:
    { 
      IStrategoTerm v_142 = null;
      IStrategoTerm t_142 = null;
      IStrategoTerm u_142 = null;
      IStrategoTerm w_142 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consInstanceOf_2 != ((IStrategoAppl)term).getConstructor())
        break Fail183;
      t_142 = term.getSubterm(0);
      u_142 = term.getSubterm(1);
      IStrategoList annos158 = term.getAnnotations();
      v_142 = annos158;
      term = i_29.invoke(context, t_142);
      if(term == null)
        break Fail183;
      w_142 = term;
      term = j_29.invoke(context, u_142);
      if(term == null)
        break Fail183;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consInstanceOf_2, new IStrategoTerm[]{w_142, term}), checkListAnnos(termFactory, v_142));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}