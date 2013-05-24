package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Hover$Rule_2_0 extends Strategy 
{ 
  public static $Hover$Rule_2_0 instance = new $Hover$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_336, Strategy i_336)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("HoverRule_2_0");
    Fail782:
    { 
      IStrategoTerm w_430 = null;
      IStrategoTerm u_430 = null;
      IStrategoTerm v_430 = null;
      IStrategoTerm x_430 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consHoverRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail782;
      u_430 = term.getSubterm(0);
      v_430 = term.getSubterm(1);
      IStrategoList annos46 = term.getAnnotations();
      w_430 = annos46;
      term = h_336.invoke(context, u_430);
      if(term == null)
        break Fail782;
      x_430 = term;
      term = i_336.invoke(context, v_430);
      if(term == null)
        break Fail782;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consHoverRule_2, new IStrategoTerm[]{x_430, term}), checkListAnnos(termFactory, w_430));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}