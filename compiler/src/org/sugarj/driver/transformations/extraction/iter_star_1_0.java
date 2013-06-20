package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class iter_star_1_0 extends Strategy 
{ 
  public static iter_star_1_0 instance = new iter_star_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("iter_star_1_0");
    Fail236:
    { 
      IStrategoTerm f_143 = null;
      IStrategoTerm e_143 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consiter_star_1 != ((IStrategoAppl)term).getConstructor())
        break Fail236;
      e_143 = term.getSubterm(0);
      IStrategoList annos194 = term.getAnnotations();
      f_143 = annos194;
      term = d_28.invoke(context, e_143);
      if(term == null)
        break Fail236;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consiter_star_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_143));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}