package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Switch$Case_2_0 extends Strategy 
{ 
  public static $Switch$Case_2_0 instance = new $Switch$Case_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_12, Strategy c_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SwitchCase_2_0");
    Fail36:
    { 
      IStrategoTerm u_95 = null;
      IStrategoTerm q_95 = null;
      IStrategoTerm s_95 = null;
      IStrategoTerm v_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSwitchCase_2 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      q_95 = term.getSubterm(0);
      s_95 = term.getSubterm(1);
      IStrategoList annos27 = term.getAnnotations();
      u_95 = annos27;
      term = b_12.invoke(context, q_95);
      if(term == null)
        break Fail36;
      v_95 = term;
      term = c_12.invoke(context, s_95);
      if(term == null)
        break Fail36;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSwitchCase_2, new IStrategoTerm[]{v_95, term}), checkListAnnos(termFactory, u_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}