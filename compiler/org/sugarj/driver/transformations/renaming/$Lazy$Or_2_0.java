package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Lazy$Or_2_0 extends Strategy 
{ 
  public static $Lazy$Or_2_0 instance = new $Lazy$Or_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_22, Strategy a_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LazyOr_2_0");
    Fail121:
    { 
      IStrategoTerm u_121 = null;
      IStrategoTerm s_121 = null;
      IStrategoTerm t_121 = null;
      IStrategoTerm w_121 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consLazyOr_2 != ((IStrategoAppl)term).getConstructor())
        break Fail121;
      s_121 = term.getSubterm(0);
      t_121 = term.getSubterm(1);
      IStrategoList annos101 = term.getAnnotations();
      u_121 = annos101;
      term = z_22.invoke(context, s_121);
      if(term == null)
        break Fail121;
      w_121 = term;
      term = a_23.invoke(context, t_121);
      if(term == null)
        break Fail121;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consLazyOr_2, new IStrategoTerm[]{w_121, term}), checkListAnnos(termFactory, u_121));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}