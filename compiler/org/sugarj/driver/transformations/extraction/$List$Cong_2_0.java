package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $List$Cong_2_0 extends Strategy 
{ 
  public static $List$Cong_2_0 instance = new $List$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_343, Strategy v_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ListCong_2_0");
    Fail913:
    { 
      IStrategoTerm w_449 = null;
      IStrategoTerm u_449 = null;
      IStrategoTerm v_449 = null;
      IStrategoTerm x_449 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consListCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail913;
      u_449 = term.getSubterm(0);
      v_449 = term.getSubterm(1);
      IStrategoList annos158 = term.getAnnotations();
      w_449 = annos158;
      term = u_343.invoke(context, u_449);
      if(term == null)
        break Fail913;
      x_449 = term;
      term = v_343.invoke(context, v_449);
      if(term == null)
        break Fail913;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consListCong_2, new IStrategoTerm[]{x_449, term}), checkListAnnos(termFactory, w_449));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}