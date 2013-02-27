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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_12, Strategy r_12, Strategy s_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDef_3_0");
    Fail52:
    { 
      IStrategoTerm z_97 = null;
      IStrategoTerm s_97 = null;
      IStrategoTerm t_97 = null;
      IStrategoTerm y_97 = null;
      IStrategoTerm c_98 = null;
      IStrategoTerm d_98 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail52;
      s_97 = term.getSubterm(0);
      t_97 = term.getSubterm(1);
      y_97 = term.getSubterm(2);
      IStrategoList annos42 = term.getAnnotations();
      z_97 = annos42;
      term = q_12.invoke(context, s_97);
      if(term == null)
        break Fail52;
      c_98 = term;
      term = r_12.invoke(context, t_97);
      if(term == null)
        break Fail52;
      d_98 = term;
      term = s_12.invoke(context, y_97);
      if(term == null)
        break Fail52;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSDef_3, new IStrategoTerm[]{c_98, d_98, term}), checkListAnnos(termFactory, z_97));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}