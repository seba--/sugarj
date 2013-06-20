package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class union_2_0 extends Strategy 
{ 
  public static union_2_0 instance = new union_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_25, Strategy u_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("union_2_0");
    Fail185:
    { 
      IStrategoTerm x_131 = null;
      IStrategoTerm u_131 = null;
      IStrategoTerm v_131 = null;
      IStrategoTerm y_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consunion_2 != ((IStrategoAppl)term).getConstructor())
        break Fail185;
      u_131 = term.getSubterm(0);
      v_131 = term.getSubterm(1);
      IStrategoList annos154 = term.getAnnotations();
      x_131 = annos154;
      term = t_25.invoke(context, u_131);
      if(term == null)
        break Fail185;
      y_131 = term;
      term = u_25.invoke(context, v_131);
      if(term == null)
        break Fail185;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consunion_2, new IStrategoTerm[]{y_131, term}), checkListAnnos(termFactory, x_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}