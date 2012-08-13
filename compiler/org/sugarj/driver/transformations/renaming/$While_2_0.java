package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $While_2_0 extends Strategy 
{ 
  public static $While_2_0 instance = new $While_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_25, Strategy w_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("While_2_0");
    Fail133:
    { 
      IStrategoTerm w_127 = null;
      IStrategoTerm u_127 = null;
      IStrategoTerm v_127 = null;
      IStrategoTerm x_127 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consWhile_2 != ((IStrategoAppl)term).getConstructor())
        break Fail133;
      u_127 = term.getSubterm(0);
      v_127 = term.getSubterm(1);
      IStrategoList annos111 = term.getAnnotations();
      w_127 = annos111;
      term = v_25.invoke(context, u_127);
      if(term == null)
        break Fail133;
      x_127 = term;
      term = w_25.invoke(context, v_127);
      if(term == null)
        break Fail133;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consWhile_2, new IStrategoTerm[]{x_127, term}), checkListAnnos(termFactory, w_127));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}