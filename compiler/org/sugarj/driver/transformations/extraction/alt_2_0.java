package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class alt_2_0 extends Strategy 
{ 
  public static alt_2_0 instance = new alt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_348, Strategy l_348)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("alt_2_0");
    Fail990:
    { 
      IStrategoTerm w_461 = null;
      IStrategoTerm u_461 = null;
      IStrategoTerm v_461 = null;
      IStrategoTerm x_461 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consalt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail990;
      u_461 = term.getSubterm(0);
      v_461 = term.getSubterm(1);
      IStrategoList annos230 = term.getAnnotations();
      w_461 = annos230;
      term = k_348.invoke(context, u_461);
      if(term == null)
        break Fail990;
      x_461 = term;
      term = l_348.invoke(context, v_461);
      if(term == null)
        break Fail990;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consalt_2, new IStrategoTerm[]{x_461, term}), checkListAnnos(termFactory, w_461));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}