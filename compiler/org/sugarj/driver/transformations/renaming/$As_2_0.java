package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $As_2_0 extends Strategy 
{ 
  public static $As_2_0 instance = new $As_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_18, Strategy d_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("As_2_0");
    Fail135:
    { 
      IStrategoTerm d_113 = null;
      IStrategoTerm b_113 = null;
      IStrategoTerm c_113 = null;
      IStrategoTerm e_113 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail135;
      b_113 = term.getSubterm(0);
      c_113 = term.getSubterm(1);
      IStrategoList annos121 = term.getAnnotations();
      d_113 = annos121;
      term = c_18.invoke(context, b_113);
      if(term == null)
        break Fail135;
      e_113 = term;
      term = d_18.invoke(context, c_113);
      if(term == null)
        break Fail135;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAs_2, new IStrategoTerm[]{e_113, term}), checkListAnnos(termFactory, d_113));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}