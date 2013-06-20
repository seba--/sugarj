package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $If$Then_2_0 extends Strategy 
{ 
  public static $If$Then_2_0 instance = new $If$Then_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_20, Strategy u_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IfThen_2_0");
    Fail95:
    { 
      IStrategoTerm f_116 = null;
      IStrategoTerm d_116 = null;
      IStrategoTerm e_116 = null;
      IStrategoTerm g_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consIfThen_2 != ((IStrategoAppl)term).getConstructor())
        break Fail95;
      d_116 = term.getSubterm(0);
      e_116 = term.getSubterm(1);
      IStrategoList annos68 = term.getAnnotations();
      f_116 = annos68;
      term = t_20.invoke(context, d_116);
      if(term == null)
        break Fail95;
      g_116 = term;
      term = u_20.invoke(context, e_116);
      if(term == null)
        break Fail95;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consIfThen_2, new IStrategoTerm[]{g_116, term}), checkListAnnos(termFactory, f_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}