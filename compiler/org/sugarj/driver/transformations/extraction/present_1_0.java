package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class present_1_0 extends Strategy 
{ 
  public static present_1_0 instance = new present_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("present_1_0");
    Fail189:
    { 
      IStrategoTerm t_132 = null;
      IStrategoTerm q_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conspresent_1 != ((IStrategoAppl)term).getConstructor())
        break Fail189;
      q_132 = term.getSubterm(0);
      IStrategoList annos158 = term.getAnnotations();
      t_132 = annos158;
      term = z_25.invoke(context, q_132);
      if(term == null)
        break Fail189;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conspresent_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}