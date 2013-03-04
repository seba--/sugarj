package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Choice_3_0 extends Strategy 
{ 
  public static $Switch$Choice_3_0 instance = new $Switch$Choice_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_44, Strategy r_44, Strategy s_44)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchChoice_3_0");
    Fail302:
    { 
      IStrategoTerm e_186 = null;
      IStrategoTerm b_186 = null;
      IStrategoTerm c_186 = null;
      IStrategoTerm d_186 = null;
      IStrategoTerm f_186 = null;
      IStrategoTerm g_186 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitchChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail302;
      b_186 = term.getSubterm(0);
      c_186 = term.getSubterm(1);
      d_186 = term.getSubterm(2);
      IStrategoList annos249 = term.getAnnotations();
      e_186 = annos249;
      term = q_44.invoke(context, b_186);
      if(term == null)
        break Fail302;
      f_186 = term;
      term = r_44.invoke(context, c_186);
      if(term == null)
        break Fail302;
      g_186 = term;
      term = s_44.invoke(context, d_186);
      if(term == null)
        break Fail302;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitchChoice_3, new IStrategoTerm[]{f_186, g_186, term}), checkListAnnos(termFactory, e_186));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}