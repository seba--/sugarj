package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Module_2_0 extends Strategy 
{ 
  public static $Module_2_0 instance = new $Module_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_18, Strategy v_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Module_2_0");
    Fail74:
    { 
      IStrategoTerm v_110 = null;
      IStrategoTerm t_110 = null;
      IStrategoTerm u_110 = null;
      IStrategoTerm b_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consModule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail74;
      t_110 = term.getSubterm(0);
      u_110 = term.getSubterm(1);
      IStrategoList annos47 = term.getAnnotations();
      v_110 = annos47;
      term = u_18.invoke(context, t_110);
      if(term == null)
        break Fail74;
      b_111 = term;
      term = v_18.invoke(context, u_110);
      if(term == null)
        break Fail74;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consModule_2, new IStrategoTerm[]{b_111, term}), checkListAnnos(termFactory, v_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}