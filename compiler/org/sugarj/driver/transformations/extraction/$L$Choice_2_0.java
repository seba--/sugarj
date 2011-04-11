package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $L$Choice_2_0 extends Strategy 
{ 
  public static $L$Choice_2_0 instance = new $L$Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_22, Strategy d_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LChoice_2_0");
    Fail108:
    { 
      IStrategoTerm p_119 = null;
      IStrategoTerm n_119 = null;
      IStrategoTerm o_119 = null;
      IStrategoTerm q_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consLChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail108;
      n_119 = term.getSubterm(0);
      o_119 = term.getSubterm(1);
      IStrategoList annos83 = term.getAnnotations();
      p_119 = annos83;
      term = c_22.invoke(context, n_119);
      if(term == null)
        break Fail108;
      q_119 = term;
      term = d_22.invoke(context, o_119);
      if(term == null)
        break Fail108;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consLChoice_2, new IStrategoTerm[]{q_119, term}), checkListAnnos(termFactory, p_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}