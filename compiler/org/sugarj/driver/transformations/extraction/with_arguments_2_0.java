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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_26, Strategy q_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("with_arguments_2_0");
    Fail205:
    { 
      IStrategoTerm v_136 = null;
      IStrategoTerm t_136 = null;
      IStrategoTerm u_136 = null;
      IStrategoTerm w_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._conswith_arguments_2 != ((IStrategoAppl)term).getConstructor())
        break Fail205;
      t_136 = term.getSubterm(0);
      u_136 = term.getSubterm(1);
      IStrategoList annos169 = term.getAnnotations();
      v_136 = annos169;
      term = p_26.invoke(context, t_136);
      if(term == null)
        break Fail205;
      w_136 = term;
      term = q_26.invoke(context, u_136);
      if(term == null)
        break Fail205;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._conswith_arguments_2, new IStrategoTerm[]{w_136, term}), checkListAnnos(termFactory, v_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}