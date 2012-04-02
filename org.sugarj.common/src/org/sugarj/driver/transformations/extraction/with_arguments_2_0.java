package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class with_arguments_2_0 extends Strategy 
{ 
  public static with_arguments_2_0 instance = new with_arguments_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_26, Strategy r_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("with_arguments_2_0");
    Fail194:
    { 
      IStrategoTerm s_136 = null;
      IStrategoTerm q_136 = null;
      IStrategoTerm r_136 = null;
      IStrategoTerm t_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._conswith_arguments_2 != ((IStrategoAppl)term).getConstructor())
        break Fail194;
      q_136 = term.getSubterm(0);
      r_136 = term.getSubterm(1);
      IStrategoList annos161 = term.getAnnotations();
      s_136 = annos161;
      term = q_26.invoke(context, q_136);
      if(term == null)
        break Fail194;
      t_136 = term;
      term = r_26.invoke(context, r_136);
      if(term == null)
        break Fail194;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._conswith_arguments_2, new IStrategoTerm[]{t_136, term}), checkListAnnos(termFactory, s_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}