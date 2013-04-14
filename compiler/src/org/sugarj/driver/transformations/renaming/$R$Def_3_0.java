package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Def_3_0 extends Strategy 
{ 
  public static $R$Def_3_0 instance = new $R$Def_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_11, Strategy s_11, Strategy t_11)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDef_3_0");
    Fail32:
    { 
      IStrategoTerm t_94 = null;
      IStrategoTerm p_94 = null;
      IStrategoTerm r_94 = null;
      IStrategoTerm s_94 = null;
      IStrategoTerm u_94 = null;
      IStrategoTerm v_94 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail32;
      p_94 = term.getSubterm(0);
      r_94 = term.getSubterm(1);
      s_94 = term.getSubterm(2);
      IStrategoList annos23 = term.getAnnotations();
      t_94 = annos23;
      term = r_11.invoke(context, p_94);
      if(term == null)
        break Fail32;
      u_94 = term;
      term = s_11.invoke(context, r_94);
      if(term == null)
        break Fail32;
      v_94 = term;
      term = t_11.invoke(context, s_94);
      if(term == null)
        break Fail32;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDef_3, new IStrategoTerm[]{u_94, v_94, term}), checkListAnnos(termFactory, t_94));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}