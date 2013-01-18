package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Choice_2_0 extends Strategy 
{ 
  public static $R$Choice_2_0 instance = new $R$Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_45, Strategy b_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RChoice_2_0");
    Fail306:
    { 
      IStrategoTerm d_187 = null;
      IStrategoTerm b_187 = null;
      IStrategoTerm c_187 = null;
      IStrategoTerm e_187 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail306;
      b_187 = term.getSubterm(0);
      c_187 = term.getSubterm(1);
      IStrategoList annos253 = term.getAnnotations();
      d_187 = annos253;
      term = a_45.invoke(context, b_187);
      if(term == null)
        break Fail306;
      e_187 = term;
      term = b_45.invoke(context, c_187);
      if(term == null)
        break Fail306;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRChoice_2, new IStrategoTerm[]{e_187, term}), checkListAnnos(termFactory, d_187));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}