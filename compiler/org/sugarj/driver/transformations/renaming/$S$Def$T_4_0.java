package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $S$Def$T_4_0 extends Strategy 
{ 
  public static $S$Def$T_4_0 instance = new $S$Def$T_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_43, Strategy r_43, Strategy s_43, Strategy t_43)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDefT_4_0");
    Fail292:
    { 
      IStrategoTerm r_183 = null;
      IStrategoTerm n_183 = null;
      IStrategoTerm o_183 = null;
      IStrategoTerm p_183 = null;
      IStrategoTerm q_183 = null;
      IStrategoTerm s_183 = null;
      IStrategoTerm t_183 = null;
      IStrategoTerm u_183 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail292;
      n_183 = term.getSubterm(0);
      o_183 = term.getSubterm(1);
      p_183 = term.getSubterm(2);
      q_183 = term.getSubterm(3);
      IStrategoList annos239 = term.getAnnotations();
      r_183 = annos239;
      term = q_43.invoke(context, n_183);
      if(term == null)
        break Fail292;
      s_183 = term;
      term = r_43.invoke(context, o_183);
      if(term == null)
        break Fail292;
      t_183 = term;
      term = s_43.invoke(context, p_183);
      if(term == null)
        break Fail292;
      u_183 = term;
      term = t_43.invoke(context, q_183);
      if(term == null)
        break Fail292;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSDefT_4, new IStrategoTerm[]{s_183, t_183, u_183, term}), checkListAnnos(termFactory, r_183));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}