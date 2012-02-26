package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Block_2_0 extends Strategy 
{ 
  public static $Switch$Block_2_0 instance = new $Switch$Block_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_19, Strategy p_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchBlock_2_0");
    Fail74:
    { 
      IStrategoTerm u_112 = null;
      IStrategoTerm s_112 = null;
      IStrategoTerm t_112 = null;
      IStrategoTerm v_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSwitchBlock_2 != ((IStrategoAppl)term).getConstructor())
        break Fail74;
      s_112 = term.getSubterm(0);
      t_112 = term.getSubterm(1);
      IStrategoList annos59 = term.getAnnotations();
      u_112 = annos59;
      term = o_19.invoke(context, s_112);
      if(term == null)
        break Fail74;
      v_112 = term;
      term = p_19.invoke(context, t_112);
      if(term == null)
        break Fail74;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSwitchBlock_2, new IStrategoTerm[]{v_112, term}), checkListAnnos(termFactory, u_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}