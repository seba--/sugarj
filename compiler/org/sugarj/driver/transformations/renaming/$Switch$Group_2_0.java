package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Group_2_0 extends Strategy 
{ 
  public static $Switch$Group_2_0 instance = new $Switch$Group_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_33, Strategy g_33)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchGroup_2_0");
    Fail111:
    { 
      IStrategoTerm u_148 = null;
      IStrategoTerm s_148 = null;
      IStrategoTerm t_148 = null;
      IStrategoTerm v_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitchGroup_2 != ((IStrategoAppl)term).getConstructor())
        break Fail111;
      s_148 = term.getSubterm(0);
      t_148 = term.getSubterm(1);
      IStrategoList annos84 = term.getAnnotations();
      u_148 = annos84;
      term = f_33.invoke(context, s_148);
      if(term == null)
        break Fail111;
      v_148 = term;
      term = g_33.invoke(context, t_148);
      if(term == null)
        break Fail111;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitchGroup_2, new IStrategoTerm[]{v_148, term}), checkListAnnos(termFactory, u_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}