package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Choice_2_0 extends Strategy 
{ 
  public static $R$Choice_2_0 instance = new $R$Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_20, Strategy z_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RChoice_2_0");
    Fail97:
    { 
      IStrategoTerm r_116 = null;
      IStrategoTerm p_116 = null;
      IStrategoTerm q_116 = null;
      IStrategoTerm s_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consRChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail97;
      p_116 = term.getSubterm(0);
      q_116 = term.getSubterm(1);
      IStrategoList annos70 = term.getAnnotations();
      r_116 = annos70;
      term = y_20.invoke(context, p_116);
      if(term == null)
        break Fail97;
      s_116 = term;
      term = z_20.invoke(context, q_116);
      if(term == null)
        break Fail97;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consRChoice_2, new IStrategoTerm[]{s_116, term}), checkListAnnos(termFactory, r_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}