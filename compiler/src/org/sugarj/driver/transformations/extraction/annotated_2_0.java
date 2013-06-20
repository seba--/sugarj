package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class annotated_2_0 extends Strategy 
{ 
  public static annotated_2_0 instance = new annotated_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_29, Strategy o_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("annotated_2_0");
    Fail273:
    { 
      IStrategoTerm u_148 = null;
      IStrategoTerm s_148 = null;
      IStrategoTerm t_148 = null;
      IStrategoTerm v_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consannotated_2 != ((IStrategoAppl)term).getConstructor())
        break Fail273;
      s_148 = term.getSubterm(0);
      t_148 = term.getSubterm(1);
      IStrategoList annos224 = term.getAnnotations();
      u_148 = annos224;
      term = n_29.invoke(context, s_148);
      if(term == null)
        break Fail273;
      v_148 = term;
      term = o_29.invoke(context, t_148);
      if(term == null)
        break Fail273;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consannotated_2, new IStrategoTerm[]{v_148, term}), checkListAnnos(termFactory, u_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}