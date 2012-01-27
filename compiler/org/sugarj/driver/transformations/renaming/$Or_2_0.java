package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Or_2_0 extends Strategy 
{ 
  public static $Or_2_0 instance = new $Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_21, Strategy x_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Or_2_0");
    Fail113:
    { 
      IStrategoTerm u_119 = null;
      IStrategoTerm r_119 = null;
      IStrategoTerm t_119 = null;
      IStrategoTerm w_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail113;
      r_119 = term.getSubterm(0);
      t_119 = term.getSubterm(1);
      IStrategoList annos98 = term.getAnnotations();
      u_119 = annos98;
      term = w_21.invoke(context, r_119);
      if(term == null)
        break Fail113;
      w_119 = term;
      term = x_21.invoke(context, t_119);
      if(term == null)
        break Fail113;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consOr_2, new IStrategoTerm[]{w_119, term}), checkListAnnos(termFactory, u_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}