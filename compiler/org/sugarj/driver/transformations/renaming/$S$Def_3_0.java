package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Def_3_0 extends Strategy 
{ 
  public static $S$Def_3_0 instance = new $S$Def_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_12, Strategy o_12, Strategy p_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDef_3_0");
    Fail52:
    { 
      IStrategoTerm s_97 = null;
      IStrategoTerm p_97 = null;
      IStrategoTerm q_97 = null;
      IStrategoTerm r_97 = null;
      IStrategoTerm t_97 = null;
      IStrategoTerm y_97 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail52;
      p_97 = term.getSubterm(0);
      q_97 = term.getSubterm(1);
      r_97 = term.getSubterm(2);
      IStrategoList annos42 = term.getAnnotations();
      s_97 = annos42;
      term = n_12.invoke(context, p_97);
      if(term == null)
        break Fail52;
      t_97 = term;
      term = o_12.invoke(context, q_97);
      if(term == null)
        break Fail52;
      y_97 = term;
      term = p_12.invoke(context, r_97);
      if(term == null)
        break Fail52;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSDef_3, new IStrategoTerm[]{t_97, y_97, term}), checkListAnnos(termFactory, s_97));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}