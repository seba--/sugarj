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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_17, Strategy q_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sort_2_0");
    Fail124:
    { 
      IStrategoTerm s_111 = null;
      IStrategoTerm q_111 = null;
      IStrategoTerm r_111 = null;
      IStrategoTerm t_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSort_2 != ((IStrategoAppl)term).getConstructor())
        break Fail124;
      q_111 = term.getSubterm(0);
      r_111 = term.getSubterm(1);
      IStrategoList annos111 = term.getAnnotations();
      s_111 = annos111;
      term = p_17.invoke(context, q_111);
      if(term == null)
        break Fail124;
      t_111 = term;
      term = q_17.invoke(context, r_111);
      if(term == null)
        break Fail124;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSort_2, new IStrategoTerm[]{t_111, term}), checkListAnnos(termFactory, s_111));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}