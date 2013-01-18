package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Cast$Ref_2_0 extends Strategy 
{ 
  public static $Cast$Ref_2_0 instance = new $Cast$Ref_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_37, Strategy t_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CastRef_2_0");
    Fail174:
    { 
      IStrategoTerm v_165 = null;
      IStrategoTerm s_165 = null;
      IStrategoTerm u_165 = null;
      IStrategoTerm w_165 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCastRef_2 != ((IStrategoAppl)term).getConstructor())
        break Fail174;
      s_165 = term.getSubterm(0);
      u_165 = term.getSubterm(1);
      IStrategoList annos144 = term.getAnnotations();
      v_165 = annos144;
      term = s_37.invoke(context, s_165);
      if(term == null)
        break Fail174;
      w_165 = term;
      term = t_37.invoke(context, u_165);
      if(term == null)
        break Fail174;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCastRef_2, new IStrategoTerm[]{w_165, term}), checkListAnnos(termFactory, v_165));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}