package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_342, Strategy r_342, Strategy s_342)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDef_3_0");
    Fail891:
    { 
      IStrategoTerm u_446 = null;
      IStrategoTerm r_446 = null;
      IStrategoTerm s_446 = null;
      IStrategoTerm t_446 = null;
      IStrategoTerm v_446 = null;
      IStrategoTerm w_446 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail891;
      r_446 = term.getSubterm(0);
      s_446 = term.getSubterm(1);
      t_446 = term.getSubterm(2);
      IStrategoList annos137 = term.getAnnotations();
      u_446 = annos137;
      term = q_342.invoke(context, r_446);
      if(term == null)
        break Fail891;
      v_446 = term;
      term = r_342.invoke(context, s_446);
      if(term == null)
        break Fail891;
      w_446 = term;
      term = s_342.invoke(context, t_446);
      if(term == null)
        break Fail891;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSDef_3, new IStrategoTerm[]{v_446, w_446, term}), checkListAnnos(termFactory, u_446));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}