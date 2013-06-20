package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort_2_0 extends Strategy 
{ 
  public static $Sort_2_0 instance = new $Sort_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_23, Strategy a_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Sort_2_0");
    Fail150:
    { 
      IStrategoTerm u_125 = null;
      IStrategoTerm s_125 = null;
      IStrategoTerm t_125 = null;
      IStrategoTerm v_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSort_2 != ((IStrategoAppl)term).getConstructor())
        break Fail150;
      s_125 = term.getSubterm(0);
      t_125 = term.getSubterm(1);
      IStrategoList annos120 = term.getAnnotations();
      u_125 = annos120;
      term = z_23.invoke(context, s_125);
      if(term == null)
        break Fail150;
      v_125 = term;
      term = a_24.invoke(context, t_125);
      if(term == null)
        break Fail150;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSort_2, new IStrategoTerm[]{v_125, term}), checkListAnnos(termFactory, u_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}