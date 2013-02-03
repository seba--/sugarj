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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_12, Strategy u_12, Strategy v_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SDef_3_0");
    Fail51:
    { 
      IStrategoTerm e_98 = null;
      IStrategoTerm z_97 = null;
      IStrategoTerm c_98 = null;
      IStrategoTerm d_98 = null;
      IStrategoTerm f_98 = null;
      IStrategoTerm g_98 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail51;
      z_97 = term.getSubterm(0);
      c_98 = term.getSubterm(1);
      d_98 = term.getSubterm(2);
      IStrategoList annos42 = term.getAnnotations();
      e_98 = annos42;
      term = t_12.invoke(context, z_97);
      if(term == null)
        break Fail51;
      f_98 = term;
      term = u_12.invoke(context, c_98);
      if(term == null)
        break Fail51;
      g_98 = term;
      term = v_12.invoke(context, d_98);
      if(term == null)
        break Fail51;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSDef_3, new IStrategoTerm[]{f_98, g_98, term}), checkListAnnos(termFactory, e_98));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}