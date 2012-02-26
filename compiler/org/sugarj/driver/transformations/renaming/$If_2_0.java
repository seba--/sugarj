package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If_2_0 extends Strategy 
{ 
  public static $If_2_0 instance = new $If_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_20, Strategy v_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("If_2_0");
    Fail90:
    { 
      IStrategoTerm e_116 = null;
      IStrategoTerm c_116 = null;
      IStrategoTerm d_116 = null;
      IStrategoTerm f_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consIf_2 != ((IStrategoAppl)term).getConstructor())
        break Fail90;
      c_116 = term.getSubterm(0);
      d_116 = term.getSubterm(1);
      IStrategoList annos75 = term.getAnnotations();
      e_116 = annos75;
      term = u_20.invoke(context, c_116);
      if(term == null)
        break Fail90;
      f_116 = term;
      term = v_20.invoke(context, d_116);
      if(term == null)
        break Fail90;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consIf_2, new IStrategoTerm[]{f_116, term}), checkListAnnos(termFactory, e_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}