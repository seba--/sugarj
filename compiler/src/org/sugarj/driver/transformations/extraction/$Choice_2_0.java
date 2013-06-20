package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Choice_2_0 extends Strategy 
{ 
  public static $Choice_2_0 instance = new $Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_21, Strategy b_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Choice_2_0");
    Fail98:
    { 
      IStrategoTerm w_116 = null;
      IStrategoTerm u_116 = null;
      IStrategoTerm v_116 = null;
      IStrategoTerm x_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail98;
      u_116 = term.getSubterm(0);
      v_116 = term.getSubterm(1);
      IStrategoList annos71 = term.getAnnotations();
      w_116 = annos71;
      term = a_21.invoke(context, u_116);
      if(term == null)
        break Fail98;
      x_116 = term;
      term = b_21.invoke(context, v_116);
      if(term == null)
        break Fail98;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consChoice_2, new IStrategoTerm[]{x_116, term}), checkListAnnos(termFactory, w_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}