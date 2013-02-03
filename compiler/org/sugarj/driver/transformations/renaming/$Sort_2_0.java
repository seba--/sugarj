package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort_2_0 extends Strategy 
{ 
  public static $Sort_2_0 instance = new $Sort_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_17, Strategy t_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sort_2_0");
    Fail123:
    { 
      IStrategoTerm v_111 = null;
      IStrategoTerm t_111 = null;
      IStrategoTerm u_111 = null;
      IStrategoTerm w_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSort_2 != ((IStrategoAppl)term).getConstructor())
        break Fail123;
      t_111 = term.getSubterm(0);
      u_111 = term.getSubterm(1);
      IStrategoList annos111 = term.getAnnotations();
      v_111 = annos111;
      term = s_17.invoke(context, t_111);
      if(term == null)
        break Fail123;
      w_111 = term;
      term = t_17.invoke(context, u_111);
      if(term == null)
        break Fail123;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSort_2, new IStrategoTerm[]{w_111, term}), checkListAnnos(termFactory, v_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}