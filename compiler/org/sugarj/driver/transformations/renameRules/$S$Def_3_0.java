package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_12, Strategy p_12, Strategy q_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDef_3_0");
    Fail48:
    { 
      IStrategoTerm t_97 = null;
      IStrategoTerm q_97 = null;
      IStrategoTerm r_97 = null;
      IStrategoTerm s_97 = null;
      IStrategoTerm y_97 = null;
      IStrategoTerm z_97 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail48;
      q_97 = term.getSubterm(0);
      r_97 = term.getSubterm(1);
      s_97 = term.getSubterm(2);
      IStrategoList annos42 = term.getAnnotations();
      t_97 = annos42;
      term = o_12.invoke(context, q_97);
      if(term == null)
        break Fail48;
      y_97 = term;
      term = p_12.invoke(context, r_97);
      if(term == null)
        break Fail48;
      z_97 = term;
      term = q_12.invoke(context, s_97);
      if(term == null)
        break Fail48;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSDef_3, new IStrategoTerm[]{y_97, z_97, term}), checkListAnnos(termFactory, t_97));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}