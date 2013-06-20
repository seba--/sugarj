package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class follow_2_0 extends Strategy 
{ 
  public static follow_2_0 instance = new follow_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_25, Strategy i_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("follow_2_0");
    Fail176:
    { 
      IStrategoTerm v_129 = null;
      IStrategoTerm s_129 = null;
      IStrategoTerm t_129 = null;
      IStrategoTerm w_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consfollow_2 != ((IStrategoAppl)term).getConstructor())
        break Fail176;
      s_129 = term.getSubterm(0);
      t_129 = term.getSubterm(1);
      IStrategoList annos145 = term.getAnnotations();
      v_129 = annos145;
      term = h_25.invoke(context, s_129);
      if(term == null)
        break Fail176;
      w_129 = term;
      term = i_25.invoke(context, t_129);
      if(term == null)
        break Fail176;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consfollow_2, new IStrategoTerm[]{w_129, term}), checkListAnnos(termFactory, v_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}