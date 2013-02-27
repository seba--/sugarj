package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call_2_0 extends Strategy 
{ 
  public static $Call_2_0 instance = new $Call_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_15, Strategy z_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Call_2_0");
    Fail97:
    { 
      IStrategoTerm u_106 = null;
      IStrategoTerm s_106 = null;
      IStrategoTerm t_106 = null;
      IStrategoTerm v_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail97;
      s_106 = term.getSubterm(0);
      t_106 = term.getSubterm(1);
      IStrategoList annos86 = term.getAnnotations();
      u_106 = annos86;
      term = y_15.invoke(context, s_106);
      if(term == null)
        break Fail97;
      v_106 = term;
      term = z_15.invoke(context, t_106);
      if(term == null)
        break Fail97;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCall_2, new IStrategoTerm[]{v_106, term}), checkListAnnos(termFactory, u_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}