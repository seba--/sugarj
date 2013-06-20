package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class iter_star_sep_2_0 extends Strategy 
{ 
  public static iter_star_sep_2_0 instance = new iter_star_sep_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_27, Strategy a_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("iter_star_sep_2_0");
    Fail234:
    { 
      IStrategoTerm v_142 = null;
      IStrategoTerm t_142 = null;
      IStrategoTerm u_142 = null;
      IStrategoTerm w_142 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consiter_star_sep_2 != ((IStrategoAppl)term).getConstructor())
        break Fail234;
      t_142 = term.getSubterm(0);
      u_142 = term.getSubterm(1);
      IStrategoList annos192 = term.getAnnotations();
      v_142 = annos192;
      term = z_27.invoke(context, t_142);
      if(term == null)
        break Fail234;
      w_142 = term;
      term = a_28.invoke(context, u_142);
      if(term == null)
        break Fail234;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consiter_star_sep_2, new IStrategoTerm[]{w_142, term}), checkListAnnos(termFactory, v_142));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}