package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cond$Choice_3_0 extends Strategy 
{ 
  public static $Cond$Choice_3_0 instance = new $Cond$Choice_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_44, Strategy y_44, Strategy z_44)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CondChoice_3_0");
    Fail305:
    { 
      IStrategoTerm v_186 = null;
      IStrategoTerm s_186 = null;
      IStrategoTerm t_186 = null;
      IStrategoTerm u_186 = null;
      IStrategoTerm w_186 = null;
      IStrategoTerm z_186 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCondChoice_3 != ((IStrategoAppl)term).getConstructor())
        break Fail305;
      s_186 = term.getSubterm(0);
      t_186 = term.getSubterm(1);
      u_186 = term.getSubterm(2);
      IStrategoList annos252 = term.getAnnotations();
      v_186 = annos252;
      term = x_44.invoke(context, s_186);
      if(term == null)
        break Fail305;
      w_186 = term;
      term = y_44.invoke(context, t_186);
      if(term == null)
        break Fail305;
      z_186 = term;
      term = z_44.invoke(context, u_186);
      if(term == null)
        break Fail305;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCondChoice_3, new IStrategoTerm[]{w_186, z_186, term}), checkListAnnos(termFactory, v_186));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}